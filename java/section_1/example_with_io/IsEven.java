// I1 t1 = new C1();
// I1 value = t1;
//
//                                      IsEven
// public static void printResult(final Runner r, final int i) { ... }
//
//
// final IsEven even = new IsEven();
//             IsEven
// printResult(even,   3);
//    final Runner r = even;
//          Runner = IsEven
public class IsEven implements Runner {
    // instance variable
    public final int x = 6;

    public IsEven() {}

    // formal parameters
    // local variables
    public int add(int x, int y) {
	// local variable
	int z = 8;
    }
}
