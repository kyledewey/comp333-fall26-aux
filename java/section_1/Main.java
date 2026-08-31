import java.io.FileWriter;
import java.io.IOException;

// Motivate ad-hoc polymorphism with a code example
//
// Possible destinations:
// 1.) Terminal
// 2.) File
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

    // let's say this runs a long time...
    public static int doCalculation() {
	int result = 0;
	for (int x = ...; x < ...; ...x...) {
	    // runs for awhile
	    result = x * ...;

	    // problem: lots of output.  Solution:
	    // output only sometimes.
	    if (x % 10000) {
		System.out.println(result);
	    }
	}
	
	return result;
    }

    public static void main(String[] args) throws IOException {
	String filename = getFilename(args);

	// do we really need another method?
	// int result = 1 + 2; // less code, fewer clock cycles
	int result = doCalculation(); // more modular

	// int result2 = 1 + 2;
	// int result2 = doCalculation();

	// Two different ways to write
	// if/else implies mutual exclusion, but it's
	// the same sort of thing
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

