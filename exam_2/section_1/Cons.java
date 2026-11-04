public class Cons implements ImmutableList {
    public final boolean head;
    public final ImmutableList tail;
    public Cons(final boolean head, final ImmutableList tail) {
	this.head = head;
	this.tail = tail;
    }
    // [true, false].orAll(): true
    // Cons(true, Cons(false, Nil))
    // head: true
    // tail: [false]
    public boolean orAll() {
	return head || tail.orAll();
	
	//             [false].orAll()
	// rest: false
	// boolean rest = tail.orAll();
	// return head || rest; // true
    }
}
