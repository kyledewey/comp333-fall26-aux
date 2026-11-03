public class TypeInference {
    public static int add(int x, int y) {
	int temp = x + y;
	temp = "foo";
	return temp;
    }
}
