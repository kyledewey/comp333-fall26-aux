// Java: statically typed
//   - Variables have fixed types, types are fixed
//     at compile time.
//   - Fewer programs possible / less flexible
//   - Tend to be faster (don't need to check types at runtime)
//
// JavaScript: dynamically typed
//   - Variables do NOT have fixed types, types
//     can change at runtime.
//   - More programs are possible (and more errors with it)
//   - Performance hit (need to check types at runtime)
//   - Memory cost (need to store extra information to say
//     what the types are)
//
//   x = 3;
//   x = "foo";
//
//  Strong typing vs. weak typing
//  
//
// add(2, 3) // returns 5
// add("foo", "bar") // returns "foobar"
//
// public static String add(String x, String y) {
//   String temp = x + y;
//   temp = 42; // compile-time error: temp is a String, not an int
//   return temp;
// }
// 
// public static int add(int x, int y) {
//   int temp = x + y;
//   return temp;
// }
//
function add(x, y) {
    let temp = x + y;
    return temp;
}

// Supposed to take an int
//
// foo("blah")
function foo(x) {
    if (typeof(x) == "number") {
	if (x > 7) {
	    return "bar";
	} else {
	    return 42;
	}
    } else {
	return x;
    }
}
