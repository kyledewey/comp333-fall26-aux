// FOR WEDNESDAY: finish refactor
//
// WriteDestination dest1 = new WriteDestination();
// WriteDestination dest2 = new WriteDestination();
public abstract class WriteDestination {
    // ad-hoc polymorphism: actual method called is determined
    // at runtime

    // subtyping polymorphism: if we want something of one type,
    // a more specific type also works
    //
    // public static void takesObject(Object obj) { ... }
    //
    // takesObject(new Object());
    // takesObject("foo");
    
    // takes the thing to write
    public abstract void write(int result);    
    public abstract void close();
}
