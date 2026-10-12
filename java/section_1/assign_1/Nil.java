public class Nil implements ImmutableList {
    public Nil() {}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode

    public int length() {
	return 0;
    }
    public int sum() { // empty list sum is defined as 0
	return 0;
    }
    public ImmutableList append(final ImmutableList other) {
	return null;
    }
    public boolean contains(final int value) {
	return true;
    }
} // Nil
    
