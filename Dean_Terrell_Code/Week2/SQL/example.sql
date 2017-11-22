CREATE SEQUENCE ART_SEQ
START WITH 500
INCREMENT BY 1;
/
CREATE OR REPLACE TRIGGER ART_TRIGGER
BEFORE INSERT ON ARTIST
FOR EACH ROW
BEGIN
SELECT ART_SEQ.NEXTVAL INTO :NEW.ARTISTID FROM DUAL;
END;
/
COMMIT;

Update Artist
Set name = 'Deanboi'
Where ARTISTID = 5;

select * from artist