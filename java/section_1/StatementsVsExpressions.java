public class StatementsVsExpressions {
    // int a = add(1, 2);
    // add(3, 4);
    public static int add(int x, int y) {
	return x + y;
    }
    
    public static void main(String[] args) {
	// expressions - evaluates to a value
	// int a = 1;
	// int b = 1 + 2;
	// int c = add(3, 4);
	// 

	// statements - don't evaluate to a value,
	//              but have some "effect"
	d = System.out.println("hello");

	// if statement
	int c;
	if (someCondition) {
	    System.out.println("hi");
	    //c = 1;
	} else {
	    System.out.println("bye");
	    c = 2;
	}
	System.out.println(c);

	// ternary operator - expression
	// (someCondition) ? ifTrue : ifFalse
	c = (someCondition) ? 0 + 1 : 2 + 3;
	// someCondition is true: c = 1
	// someCondition is false: c = 5
    }

    public static boolean randomBoolean() { ... }
    
    public static void handout() {
	boolean b = (randomBoolean()) ? true : false;
	if (b) {
	    System.out.println("foo");
	} else {
	    System.out.println("bar");
	}

	// rewritten:
	Conditional c = (randomBoolean()) ? ... : ... ;
	// Conditional is NOT a built-in
	// Conditional MUST be defined by us
	// Conditional is a type
	// Conditional is a class/abstract class/interface
	//
	// each ... is an expression
	// each ... must be compatible with type "Conditional"
	//   -types could be identical (... is a Conditional)
	//   -... could be a subtype of Conditional (particular
	//    kind of Conditional, ... inherits from Conditional)
	c.operation();
	// operation is a method
	// Conditional objects must define an operation method
	// operation method takes no arguments
	// operation method probably doesn't return anything
	//   (returns void)
	// operation must print either "foo" or "bar"
	// possible to rewrite without if (operation method
	// shouldn't contain if)
	//
	// "need classes corresponding to true and false" -
	// there is more than one class that we need to
	// define; some sort of correspondance to true and false
	
	// operation method either prints "foo" or "bar"


	
	// {
	//     System.out.println((randomBoolean()) ? "foo" : "bar");
	    
	//     boolean b = randomBoolean();
	//     if (b) {
	// 	System.out.println("foo");
	//     } else {
	// 	System.out.println("bar");
	//     }
	// }

	

	
	// boolean b = randomBoolean();
	//
	// if (someCondition) {
	//   return false;
	// } else {
	//   return true;
	// }
	//
	// return !someCondition;

    } // handout

    public static void handoutSolution() {
	// MONDAY: show ... part
	Conditional c = (randomBoolean()) ? ... : ...;
	c.operation();
    }
}
