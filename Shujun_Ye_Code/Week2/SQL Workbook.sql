--SQL WORKBOOK ASSIGNMENT SHUJUN YE

-- 2.1 SELECT
-- The SELECT statement is used to select data from a database.
-- The data returned is stored in a result table, called the result-set.
SELECT * FROM EMPLOYEE;

SELECT * FROM EMPLOYEE
WHERE LASTNAME = 'King';

SELECT * FROM EMPLOYEE
WHERE FIRSTNAME = 'Andrew' AND REPORTSTO IS NULL;

-- 2.2 ORDER BY
-- The ORDER BY keyword sorts the records in ascending (ASC) order by default.
-- To sort the records in descending order, use the DESC keyword.
SELECT * FROM ALBUM
ORDER BY TITLE DESC;

SELECT FIRSTNAME FROM CUSTOMER
ORDER BY CITY;

-- 2.3 INSERT INTO
-- Adding values for all the columns of the table, do not need to specify the
-- column names in the SQL query. However, make sure the order of the values is
-- in the same order as the columns in the table
INSERT INTO GENRE
VALUES (26, 'Movie');

INSERT INTO GENRE
VALUES (27, 'Concert');

INSERT INTO EMPLOYEE
VALUES (9, 'Lee', 'Sang-hyeok', 'IT Staff', 6, '07-MAY-96', '11-NOV-14',
'3905 Independence Boulevard', 'Wilmington', 'NC', 'USA', '28412',
'+1 (910) 645-0339', '+1 (910) 645-0451', 'faker@chinookcorp.com'); 

INSERT INTO EMPLOYEE
VALUES (10, 'Kloss', 'Karlie', 'IT Staff', '6', '03-AUG-92', '22-NOV-11',
'4202 East Fowler Avenue', 'Tampa', 'FL', 'USA', '33620', '+1 (800) 360-8685',
'+1 (800) 360-8750', 'karlie@chinookcorp.com');

INSERT INTO CUSTOMER
VALUES (60, 'Lisa', 'Bullard', NULL, '3415 Avent Ferry Rd', 'Raleigh', 'NC', 'USA',
'27606', '+1 (910) 434-6850', NULL, 'lisa_bullard@gmail.com', 3);

INSERT INTO CUSTOMER
VALUES (61, 'Chris', 'Lutz', NULL, '2919 Network Pl', 'Lutz', 'FL', 'USA', '33559',
'+1 (813) 431-5050', '+1 (813) 431-5056', 'chris@outlook.com', 5);

-- 2.4 UPDATE
-- Notice the WHERE clause in the UPDATE statement. The WHERE clause specifies
-- which record(s) that should be updated. If you omit the WHERE clause, all
-- records in the table will be updated!
UPDATE CUSTOMER
SET FIRSTNAME = 'Robert', LASTNAME = 'Walter'
WHERE FIRSTNAME = 'Aaron' AND LASTNAME = 'Mitchell';

UPDATE ARTIST
SET NAME = 'CCR'
WHERE NAME = 'Creedence Clearwater Revival';

-- 2.5 LIKE
-- The LIKE operator is used in a WHERE clause to search for a specified pattern in a column.
-- There are two wildcards used in conjunction with the LIKE operator:
-- % - The percent sign represents zero, one, or multiple characters
-- _ - The underscore represents a single character
-- The percent sign and the underscore can also be used in combinations!
SELECT * FROM INVOICE
WHERE BILLINGADDRESS LIKE 'T%';

-- 2.6 BETWEEN
-- The BETWEEN operator selects values within a given range.
-- The values can be numbers, text, or dates.
-- The BETWEEN operator is inclusive: begin and end values are included. 
SELECT * FROM INVOICE
WHERE TOTAL BETWEEN 15 AND 50;

SELECT * FROM EMPLOYEE
WHERE HIREDATE BETWEEN '01-JUN-03' AND '01-MAR-04';

-- 2.7 DELETE
-- The DELETE statement is used to delete existing records in a table.
-- Notice the WHERE clause in the DELETE statement. The WHERE clause specifies
-- which record(s) that should be deleted. If you omit the WHERE clause, all
-- records in the table will be deleted!
DELETE FROM INVOICELINE
WHERE INVOICEID IN (SELECT INVOICEID FROM INVOICE
WHERE CUSTOMERID IN (SELECT CUSTOMERID FROM CUSTOMER
WHERE FIRSTNAME = 'Robert' AND LASTNAME = 'Walter'));

DELETE FROM INVOICE
WHERE CUSTOMERID IN (SELECT CUSTOMERID FROM CUSTOMER
WHERE FIRSTNAME = 'Robert' AND LASTNAME = 'Walter');

DELETE FROM CUSTOMER
WHERE FIRSTNAME = 'Robert' AND LASTNAME = 'Walter';

-- 3.1 System Defined Functions
-- Create a function that returns the current time.
CREATE OR REPLACE FUNCTION get_current_time
RETURN TIMESTAMP
IS
  current_time TIMESTAMP;
BEGIN
  SELECT LOCALTIMESTAMP INTO current_time FROM DUAL;
  RETURN current_time;
END;
/
SELECT get_current_time FROM DUAL;

-- Create a function that returns the length of a mediatype from the mediatype table
CREATE OR REPLACE FUNCTION get_mediatype_length(media_id IN NUMBER)
RETURN NUMBER
IS
  media_length NUMBER;
BEGIN
  SELECT LENGTH(NAME) INTO media_length FROM MEDIATYPE WHERE MEDIATYPEID = media_id;
  RETURN media_length;
END; -- Not finish
/
SELECT get_mediatype_length(2) FROM DUAL;

-- 3.2 System Defined Aggregate Functions
-- Create a function that returns the average total of all invoices
CREATE OR REPLACE FUNCTION avg_total_invoices
RETURN NUMBER
IS
  avg_total NUMBER(10,2);
BEGIN
  SELECT AVG(TOTAL)INTO avg_total FROM INVOICE;
  RETURN avg_total;
END;
/
SELECT avg_total_invoices FROM DUAL;

-- Create a function that returns the most expensive track
CREATE OR REPLACE FUNCTION get_most_exp_track
RETURN NUMBER
IS
  track_max NUMBER(10,2);
BEGIN
  SELECT MAX(UNITPRICE) INTO track_max FROM TRACK;
  RETURN track_max;
END;
/
SELECT get_most_exp_track FROM DUAL;

-- 3.3 User Defined Scalar Functions
-- Create a function that returns the average price of invoiceline items in the
-- invoiceline table
CREATE OR REPLACE FUNCTION get_avg_price
RETURN NUMBER
IS
  avg_price NUMBER(10, 2);
BEGIN
  SELECT AVG(UNITPRICE) INTO avg_price FROM INVOICELINE;
  RETURN avg_price;
END;
/
SELECT get_avg_price FROM DUAL;

-- 3.4 User Defined Table Valued Functions
-- Create a function that returns all employees who are born after 1968.



-- 4.1 Basic Stored Procedure
-- Create a stored procedure that selects the first and last names of all the
-- employees.
CREATE OR REPLACE PROCEDURE get_employees_by_name
AS
BEGIN

END;
/



