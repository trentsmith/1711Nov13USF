/**
 * 1. Fibonacci
 * Define function: fib(n) 
 * Return the nth number in the fibonacci sequence.
 */
function fib(n) {
	if(n <= 1) return 1;
	else return (fib(n - 1) + fib(n - 2));
}

function runFib(){
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