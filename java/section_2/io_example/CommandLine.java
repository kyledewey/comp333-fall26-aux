public class CommandLine {
    public static void main(String[] args) {
	// args: command-line arguments
	for (int index = 0; index < args.length; index++) {
	    String arg = args[index];
	    System.out.println(arg);
	}
    }
}
