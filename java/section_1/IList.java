//       IList
//       /   \
//     Nil   Cons (recursive case at data level)
//     (base
//      case) int head;
//            IList tail;
//
// IList l0 = new Nil();
// IList l1 = new Cons(1, l0);
public interface IList {
    public boolean isEmpty();
    public int length();

    // [2, 1, 3].addAmount(1): [3, 2, 4]
    //   [2 + 1, 1 + 1, 3 + 1]
    //   [    3,     2,     4]
    //
    // [5].addAmount(4): [9]
    //   [5 + 4]
    //   [    9]
    // 
    // [3, 0].addAmount(2): [5, 2]
    //   [3 + 2, 0 + 2]
    //   [    5,     2]
    //
    // [].addAmount(3): []
    //   []
    public IList addAmount(int amount);
}
