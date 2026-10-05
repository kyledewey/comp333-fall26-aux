//           TerminalDestination is a subtype of WriteDestination
public class TerminalDestination extends WriteDestination {
    public TerminalDestination() {}

    public void write(int result) {
	System.out.println(result);
    }

    public void close() {}
}
