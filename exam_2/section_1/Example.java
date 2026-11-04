public class Example {
    public static void main(String[] args) {
	ImmutableList empty = new Nil();
	System.out.println(empty.orAll()); // prints false
	ImmutableList trueFalse = // [true, false]
	    new Cons(true, new Cons(false, empty));
	System.out.println(trueFalse.orAll()); // prints true
	ImmutableList falseFalse = // [false, false]
	    new Cons(false, new Cons(false, empty));
	System.out.println(falseFalse.orAll()); // prints false
    }
}
