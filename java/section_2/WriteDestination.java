public class WriteDestination {
    FileWriter fileWriter;
    NetworkWriter netWriter;

    // MONDAY: removing assert; avoiding if in write and close
    public WriteDestination(FileWriter fileWriter,
			    NetworkWriter netWriter) {
	assert(!(fileWriter != null && netWriter != null));
	this.fileWriter = fileWriter;
	this.netWriter = netWriter;
    }
    
    public void write(int result) {
	if (fileWriter != null) {
	    // write to file
	    fileWriter.write("" + result + "\n");
	} else if (netWriter != null) {
	    // write to network location
	    netWriter.sendInteger(result);
	} else {
	    // write to terminal
	    System.out.println(result);
	}
    }
}

