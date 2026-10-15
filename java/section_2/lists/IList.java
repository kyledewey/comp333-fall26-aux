public interface IList {
    public boolean isEmpty();
    public int length();

    // [3, 2, 4].addAmount(1) --> [4, 3, 5]
    //   [(3 + 1), (2 + 1), (4 + 1)]
    //
    // [6].addAmount(2) --> [8]
    //
    // [8, 2, 4].addAmount(3) --> [11, 5, 7]
    // new Cons(8, new Cons(2, new Cons(4, new Nil()))).addAmount(3)
    //   new Cons(11, new Cons(5, new Cons(7, new Nil())))
    //
    // [].addAmount(4) --> []
    // new Nil().addAmount(4) --> new Nil()
    public IList addAmount(int value);

    // FOR MONDAY: show assign 1, compile
}
