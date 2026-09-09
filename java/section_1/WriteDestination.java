// FOR WEDNESDAY: finish refactor 
public class WriteDestination {
    private FileWriter fileWriter;
    private NetworkWriter netWriter;

    // public WriteDestination(FileWriter fileWriter,
    // 			    NetworkWriter netWriter) {
    // 	this.fileWriter = fileWriter;
    // 	this.netWriter = netWriter;
    // }

    // new WriteDestination()
    public WriteDestination() {
	fileWriter = null;
	netWriter = null;
    }

    // new WriteDestination(new FileWriter(...))
    public WriteDestination(FileWriter fileWriter) {
	this.fileWriter = fileWriter;
	netWriter = null;
    }

    // new WriteDestination(new NetworkWriter(...))
    public WriteDestination(NetworkWriter netWriter) {
	fileWriter = null;
	this.netWriter = netWriter;
    }

    // public void setFileWriter(FileWriter fileWriter) {
    // 	this.fileWriter = fileWriter;
    // }
    
    // takes the thing to write
    public void write(int result) {
	assert(!(fileWriter != null && netWriter != null));
	if (fileWriter != null) {
	    // String + int = String
	    // int + String = String
	    // int + int = int
	    // int x = 2;
	    // int y = 3;
	    // System.out.println((x + y) + " hello")
		
	    fileWriter.write("" + result + "\n");
	} else if (netWriter != null) {
	    netWriter.sendInteger(result);
	} else {
	    System.out.println(result);
	}
    }

    public void close() {
	if (fileWriter != null) {
	    fileWriter.close();
	}
	if (netWriter != null) {
	    netWriter.disconnect();
	}
    }
}
