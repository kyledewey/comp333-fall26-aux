public class Problem2 {
    // int a = add(1, 2);
    // add(5, 4);
    public static int add(int x, int y) {
	System.out.println(x);
	return x + y;
    }
    
    public static boolean randomBoolean() { ... }

    public static int someMethod() { return 0; }
    
    public static void main(String[] args) {
	// expressions: evaluate down to a value; have a type
	// 5: int
	// 1 + 2: int
	// 2 * someMethod(): int
	// someMethod(): int
	// "foo" + "bar": String
	//

	// statements: perform some action (effect)
	// System.out.println("foo");
	// int x = 5;
	// if (...) { ... } else { ... };
	// return 5;
	// someMethod(); // expression statement

	//boolean b = (randomBoolean()) ? true : false;
	boolean b;
	if (randomBoolean()) {
	    b = true;
	} else {
	    b = false;
	}
			 

	// String str = (randomBoolean()) ? "foo" : "bar";
	// System.out.println(str);

	// boolean b = randomBoolean();
	
	boolean b = (randomBoolean()) ? true : false;
	if (b) {
	    System.out.println("foo");
	} else {
	    System.out.println("bar");
	}


	Conditional c = (randomBoolean()) ? new True() : new False();
	// Conditional must be a type
	// Conditional is NOT built-in
	// Conditional must be a class, abstract class, or interface
	// ... must be of type Conditional or a subtype of conditional
	
	c.operation(); // should print "foo" or "bar"
	// Conditional objects must have an operation method
	// operation method takes no arguments
	// operation method probably returns void
	// operation method prints "foo" or "bar"
    }
}
