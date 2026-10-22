// dynamic typing: more programs are possible

public class Add {
    public static int add(int x, int y) {
	return x + y;
    }

    public static String add(String x, String y) {
	return x + y;
    }

    public static void example() {
	int i = add(3, 4);
	String s = add("foo", "bar");
    }

    // public static ??? foo(int x) {
    // 	if (x > 7) {
    // 	    return "hi";
    // 	} else {
    // 	    return false;
    // 	}
    // }
}
