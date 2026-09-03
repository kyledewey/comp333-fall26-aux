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
    // public static FileWriter writer = null;
    
    // returns null if no filename
    public static String getFilename(String[] args) {
	if (args.length == 0) {
	    return null;
	} else {
	    return args[0];
	}
    }

    public static void write(FileWriter writer,
			     int result) {
	if (writer == null) {
	    // write to terminal
	    System.out.println(result);
	} else {
	    // write to file
	    writer.write("" + result + "\n");
	}
    }
    
    public static int doCalculation(FileWriter writer) {
	int result = 0;
	for (int x = ...; x < ...; x++) {
	    result += ...x...;
	    if (x % 10000 == 0) {
		write(writer, result);
	    }
	}
	return result;
    }

    // NEXT TIME: address issue of null writer / multiple destinations
    public static void main(String[] args) throws IOException {
	String filename = getFilename(args);
	FileWriter writer = null;
	if (filename != null) {
	    writer = new FileWriter(filename);
	}
	
	// why whole method?
	//int result = 1 + 2; // less lines of code,
	                    // more clear than doCalculation()
	                    // efficiency
	// only using function once! - multiple calls
	
	int result = doCalculation(writer); // modularity
	                              // cutting code duplication
	                              // "what it means": intention

	// int result2 = 1 + 2;
	// int result2 = doCalculation();
	write(writer, result);
	
	if (writer != null) {
	    writer.close();
	}
    }
}

