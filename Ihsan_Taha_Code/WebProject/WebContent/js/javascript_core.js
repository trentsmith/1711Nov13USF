/*
 * JavaScript is a scripting language for client-side operations
 * C-like syntax
 * Supports protoypal inheritance
 */

/*
 * Variable Types
 * number, string, object, boolean, null, NaN(?), undefined
 * null is considered an object in JS. can consider it a bug
 */

var a = 5;
var b = 'hello';
var c = "hello";

/*
 * Truthy and Falsy
 * Falsy - null, 0, undefined, NaN, "", false
 * Truthy - anything else
 */

/*
 * Operators
 */

// Arithmetic: + - * / %
// Bitwise: & | >> >>> <<
// Comparison > < >= <= == === != !==
// Logical (includes guard and default) && || ! ||

/*
 * Objects
 * - can inherit from other objects
 * - object literal {}
 * - Objects can contain an unordered collection of name/value pairs
 */

/*
 * Guard Operator &&
 * - if the first operand is truthy, return the 2nd operand
 * otherwise return the first operand
 * instead of returning true or false, it returns the value
 * of the appropriate operand
 */
var isLoggedIn = true;
var username = "user";

var getUser = function() {
	return isLoggedIn && username;
}

/*
 * Default Operator - ||
 * if the first operand is truthy, return the first operand
 * otherwise return the second operand
 */
var getsComission = 500;
var getsRegSalary = 100;
	var getsPaid = function() {
	return getsComission || getsRegSalary;
}

/*
 * Hoisting
 */	
function getValue(condition) {
	if(condition) {
		var value = "blue";
	} else {
		// value exists here with a value of undefined
		return null;
	}
}
function getValue(condition) {
	var value;
	if(condition) {
		value = "blue";
	} else {
		return null;
	}
}
function getValue(condition) {
	if(condition){
		let value="blue";
	}
}

//BLAAAH...
	
/*
 * Arrays
 * - inherit from object
 * - array indexes are converted into strings &
 */