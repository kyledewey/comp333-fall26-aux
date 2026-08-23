public class Main {
    // x: 1
    
    public static void main(String[] args) {
	int x = 0;

	// x = 0 + 1;
	// x = 1;
	x = x++ + x++;
	System.out.println(x); // what gets printed?
    }
}
