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
	int rest = tail.length();
	
    }
}
