public class TerminalDestination extends WriteDestination {
    public TerminalDestination() {}

    public void write(int result) {
	System.out.println(result);
    }

    public void close() {}
}
