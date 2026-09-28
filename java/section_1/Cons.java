public class Cons implements IList {
    public final int head;
    public final IList tail;
    
    public Cons(final int head,
		final IList tail) {
	this.head = head;
	this.tail = tail;
    }
}
