public class Nil implements IList {
    public Nil() {}
    public boolean isEmpty() {
	return true;
    }

    public int length() {
	return 0;
    }

    // [].addAmount(3): []
    public IList addAmount(int amount) {
	// return new Nil();
	return this;
    }
}
