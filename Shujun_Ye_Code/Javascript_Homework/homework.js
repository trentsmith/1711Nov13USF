/**
 * 1. Fibonacci
 * Define function: fib(n) 
 * Return the nth number in the fibonacci sequence.
 */
function fib(n) {
	if(n <= 1) return 1;
	else return (fib(n - 1) + fib(n - 2));
}

function runFib() {
	var n = document.getElementById("fib").value;
	document.getElementById("fibDisplay").innerHTML = fib(n); // display
}

document.getElementById("doFib").addEventListener("click", runFib);

/**
 * 2. Bubble Sort
 * Define function: bubbleSort(numArray)
 * Use the bubble sort algorithm to sort the array.
 * Return the sorted array.
 */
function bubbleSort(numArray) {
	var len = numArray.length;
	for (i = 0; i < len - 1; i++){
		for (j = 0; j < len - i - 1; j++){
			if (numArray[j] > numArray[j+1]){
				var temp = numArray[j];
				numArray[j] = numArray[j+1];
				numArray[j+1] = temp;
			}
		}
	}
	return numArray; // need to fix input
}

function runBub() {
	var numArray = document.getElementById("bub").value;
	document.getElementById("bubDisplay").innerHTML = bubbleSort(numArray); // display
}

document.getElementById("doBub").addEventListener("click", runBub);

/**
 * 3. Reverse String
 * Define function: reverseStr(someStr)
 * Reverse and return the String.
 */
function reverseStr(someStr) {
	var len = someStr.length;
	for (i = len - 1; i >= 0; i--) {
		someStr += someStr.charAt(i);
	}
	var result = someStr.slice(len);
	return result;
}

function runRev() {
	var str = document.getElementById("rev").value;
	document.getElementById("revDisplay").innerHTML = reverseStr(str); // display
}

document.getElementById("doRev").addEventListener("click", runRev);

/**
 * 4. Factorial
 * Define function: factorial(someNum)
 * Use recursion to compute and return the factorial of someNum.
 */



/**
 * 5. Substring
 * Define function substring(someStr, length, offset)
 * Return the substring contained between offset and (offset + length) inclusively.
 * If incorrect input is entered, use the alert function and describe why the input was incorrect.
 */


/**
 * 6. Even Number
 * Define function: isEven(someNum)
 * Return true if even, false if odd.
 * Do not use % operator. 
 */

