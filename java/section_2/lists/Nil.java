public class Nil implements IList {
    public Nil() {}
    public boolean isEmpty() {
	return true;
    }

    public int length() {
	return 0;
    }

    // [].addAmount(4) --> []
    // new Nil().addAmount(4) --> new Nil()
    public IList addAmount(int value) {
	//return new Nil();
	return this;
    }
}
