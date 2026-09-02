// FOR WEDNESDAY: finish refactor 
public class WriteDestination {
    FileWriter writer;
    NetworkWriter netWriter;

    // takes the thing to write
    public void write(int result) {
	if (writer == null) {
	    // write to terminal
	    System.out.println(result);
	} else {
	    // write to file
	    writer.write("" + result + "\n");
	}
    }
    
