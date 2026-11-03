// // an integer
// //
// // >  - false, false, false; 0
// // >= - false, false, true; 1
// // <  - false, true, false; 2
// // <= - false, true, true; 3
// // == - true, false, false; 4
// // != - true, false, true; 5
// // ?  - true, true, false; 6
// // ?  - true, true, true;  7...
// function printGreaterLessOrEquals(arr, x, lessThan, equals) {/*...*/}
    
// // < - true
// // > - false
// function printGreaterOrLessThan(arr, x, lessThan) {
//     for (let index = 0; index < arr.length; index++) {
// 	let element = arr[index];
// 	if ((lessThan && element < x) ||
// 	    (!lessThan && element > x)) {
// 	    console.log(element);
// 	}
//     }
// }

// FOR NEXT TIME: handout on higher-order functions

// -first parameter: array of numbers
// -second parameter: a function, number -> boolean
function printSomeElements(arr, shouldPrint) {
    for (let index = 0; index < arr.length; index++) {
	let element = arr[index];
	// calls shouldPrint with element as a parameter
	if (shouldPrint(element)) {
	    console.log(element);
	}
    }
}    

function printGreaterThan(arr, x) {
    printSomeElements(arr,
		      function (e) {
			  return e > x;
		      });
}

function printLessThan(arr, x) {
    printSomeElements(arr, (e) => e < x);
}

function printLessThan5(arr) {
    printLessThan(arr, 5);
}

function printLessThan10(arr) {
    printLessThan(arr, 10);
}
