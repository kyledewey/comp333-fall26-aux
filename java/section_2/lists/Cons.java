// public class Node {
//   public int elem;
//   public Node rest;
// }
//
// struct Node {
//   int elem;
//   Node* rest;
// };
//
public class Cons implements IList {
    public final int head;
    public final IList tail;
    public Cons(final int head,
		final IList tail) {
	this.head = head;
	this.tail = tail;
    }

    public boolean isEmpty() {
	return false;
    }
    
    public int length() {
	// if (tail is a Nil) {
	//   rest = 0;
	// } else if (tail is a Cons) {
	//   rest = tail.length();
	// }
	int rest = tail.length();
	//
	// rest: 0
	//
	// in scope:
	// head (int), tail (IList), rest (int),
	// this (Cons)
	//
	// rest
	return rest + 1;
    }

    // [6].addAmount(2) --> [8]
    // new Cons(6, new Nil()).addAmount(2) -->
    //   new Cons(8, new Nil())
    public IList addAmount(int value) {
	// head: 6
	// tail: []; new Nil()
	// value: 2
	// this: [6]; new Cons(6, new Nil())
	int returnedValue = head + value;
	// returnedValue: 8

	//                          int
	IList rest = tail.addAmount(value);
	//             [].addAmount(...)
	// rest: []; new Nil()

	// expected return value:
	// [8]; new Cons(8, new Nil())
	return new Cons(returnedValue, rest);

	// return new Cons(head + value, tail.addAmount(value));
    }
}
