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
    public static FileWriter writer = null;

    // returns null if no filename
    public static String getFilename(String[] args) {
	if (args.length == 0) {
	    return null;
	} else {
	    return args[0];
	}
    }

    // foo.txt
    //   abc
    //   def
    //
    // write("abc");
    // write("def");
    // close();

    public static void write(int result) {
	if (writer == null) {
	    // write to terminal
	    System.out.println(result);
	} else {
	    // write to file
	    writer.write("" + result + "\n");
	}
    }
    
    // let's say this runs a long time...
    public static int doCalculation() {
	int result = 0;
	for (int x = ...; x < ...; ...x...) {
	    // runs for awhile
	    result = x * ...;

	    // Clobbering (programming / files)
	    //
	    // foo.txt
	    //  qwertyui
	    //
	    // open_for_writing("foo.txt")
	    //
	    // foo.txt
	    //  
	    
	    // problem: lots of output.  Solution:
	    // output only sometimes.
	    if (x % 10000) {
		write(result);
	    }
	}

	return result;
    }

    public static void main(String[] args) throws IOException {
	String filename = getFilename(args);
	if (filename != null) {
	    writer = new FileWriter(filename);
	}

	// do we really need another method?
	// int result = 1 + 2; // less code, fewer clock cycles
	int result = doCalculation(filename); // more modular

	// int result2 = 1 + 2;
	// int result2 = doCalculation();

	// Two different ways to write
	// if/else implies mutual exclusion, but it's
	// the same sort of thing
	write(result);

	if (writer != null) {
	    writer.close();
	}
    }
}

