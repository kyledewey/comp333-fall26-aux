import java.io.FileWriter;
import java.io.IOException;

// Motivate ad-hoc polymorphism with a code example
//
// -Program that takes some command-line input
//   -Input either empty or it's a file name
//   -Empty input: write output to terminal
//   -file name: write output to that file
// -Program itself does some calculation
//  (doesn't matter what)
public class Main {
    // returns null if no filename
    public static String getFilename(String[] args) {
	if (args.length == 0) {
	    return null;
	} else {
	    return args[0];
	}
    }

    public static int doCalculation() {
	return 1 + 2;
    }

    // NEXT TIME: doCalculation prints stuff
    public static void main(String[] args) throws IOException {
	String filename = getFilename(args);

	// why whole method?
	int result = 1 + 2; // less lines of code,
	                    // more clear than doCalculation()
	                    // efficiency
	// only using function once! - multiple calls
	
	int result = doCalculation(); // modularity
	                              // cutting code duplication
	                              // "what it means": intention

	int result2 = 1 + 2;
	int result2 = doCalculation();

	if (filename == null) {
	    // write to terminal
	    System.out.println(result);
	} else {
	    // write to file
	    FileWriter writer = new FileWriter(filename);
	    writer.write("" + result + "\n");
	    writer.close();
	}
    }
}

