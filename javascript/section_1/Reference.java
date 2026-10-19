public class Reference {
    public int x;
    public Reference() {
	x = 0;
    }

    public static void main(String[] args) {
	final Reference r = new Reference();
	r.x = 5;
	System.out.println(r.x);
    }
}
