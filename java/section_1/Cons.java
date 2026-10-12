public class Cons implements IList {
    public final int head;
    public final IList tail;
    
    public Cons(final int head,
		final IList tail) {
	this.head = head;
	this.tail = tail;
    }

    // public int length() {
    // 	return 1 + tail.length();
    // }
    
    // [3, 1, 2].length(): 3
    //   head: 3
    ///  tail: [1, 2]
    //    [1, 2].length(): 2
    public int length() {
	// type-directed programming
	// String - "foo"; int - 2345
	//
	// Recursive definition
	// Want to call on something smaller
	// we started with a Cons
	// want something smaller than what we had
	//
	// this: Cons (subtype of IList) - originally had
	// tail: IList
	int rest = tail.length();

	// head: int
	// rest: int
	return rest + 1;
    }

    public boolean isEmpty() {
	return false;
    }

    // [2, 1, 3].addAmount(1): [3, 2, 4]
    // [5].addAmount(4): [9]
    //
    //
    // [3, 0].addAmount(2): [5, 2]
    // new Cons(3, new Cons(0, new Nil())).addAmount(2) -->
    //   new Cons(5, new Cons(2, new Nil()))
    public IList addAmount(int amount) {
	// this: [3, 0]; new Cons(3, new Cons(0, new Nil()))
	// head: 3
	// tail: [0]; new Cons(0, new Nil())
	// amount: 2
	//
	// result: [5, 2]

	//            [0].addAmount(2): [2]
	// rest: [2]
	// [2] --> [5, 2]
	
	//                          int
	IList rest = tail.addAmount(...);

	rest
	...rest...
	
	IList rest = tail.addAmount(amount);
	return new Cons(head + amount, rest);

	// return new Cons(head + amount, tail.addAmount(amount));
    }
}
