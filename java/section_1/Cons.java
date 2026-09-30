public class Cons implements IList {
    public final int head;
    public final IList tail;
    
    public Cons(final int head,
		final IList tail) {
	this.head = head;
	this.tail = tail;
    }

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
}
