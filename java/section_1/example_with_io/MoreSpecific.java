public class Base {
    public void method() { System.out.println("base"); }
}

public class Sub2 extends Base {
    public void method() { System.out.println("sub1"); }
    public void method2() { System.out.println("hi"); }
}

public class Example {
    public static void main(String[] args) {
	Base b = new Sub2();
	b.method(); // ok
	b.method2(); // compile-time error

	if (b instanceof Sub2) {
	    Sub2 casted = (Sub2)b;
	    casted.method2(); // ok (but bad practice)
	}
    }
public class General {
    public String a; // General has-a a
    public int foo() { return 0; }
}

public class Specific extends General {
    // Specific has-a a
    public int bar() { return 1; }
}

public class Main {
    General g1 = new General();
    // can call: g1.foo()

    General g2 = new Specific();
    // can call: g2.foo();

    g2.foo(); // ok
    g2.bar(); // wouldn't compile

    Specific s1 = new Specific();
    s1.foo(); // ok
    s1.bar(); // ok
    // call call: s1.foo(), s1.bar()

    List lst = new ArrayList(); // new LinkedList();
    
