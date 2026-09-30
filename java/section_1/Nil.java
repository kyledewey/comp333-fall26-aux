public class Nil implements IList {
    public Nil() {}
    public boolean isEmpty() {
	return true;
    }

    public int length() {
	return 0;
    }
}
