public class Add {
    public static String add(String x, String y) {
	String temp = x + y;
	return temp;
    }

    public static int add(int x, int y) {
	// var: type inference - still statically typed
	var temp = x + y; // temp: int
	temp = "foo";
	return temp;
    }

    // public static Object foo(int x) {
    // 	if (x > 7) {
    // 	    return "bar";
    // 	} else {
    // 	    return new Integer(42);
    // 	}
    // }	
}
