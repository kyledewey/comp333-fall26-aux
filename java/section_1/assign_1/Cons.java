public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode
    
    // [1, 7, 2].length(): 3
    // new Cons(1, new Cons(7, new Cons(2, new Nil()))).length()
    //
    public int length() {
	// return tail.length() + 1;

	// this: [1, 7, 2]
	// head: 1
	// tail:    [7, 2]
	// expected return value: 3

	//               [7, 2].length(): 2
	int restLength = tail.length();
	// restLength: 2
	
	return restLength + 1; 
	
	//
	// check is done through ad-hoc polymorphism
	//
	// ImmutableList a = ...;
	// int len = a.length(); // length called depends on runtime type of a
	//
	// if (...) {
	//     // base case
	// } else {
	//     // recursive case
	// }
    }

    // [3, 7, 1].sum(): 11
    public int sum() { // empty list sum is defined as 0
	// this: [3, 7, 1]
	// head: 3
	// tail: [7, 1]
	// expected return value: 11
	
	//          [7, 1].sum()
	int restSum = tail.sum();
	//  restSum: 8

	return head + tail.sum();
    }

    public ImmutableList append(final ImmutableList other) {
	return null;
    }
    public boolean contains(final int value) {
	return true;
    }
} // Cons
