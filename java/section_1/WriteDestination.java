// FOR WEDNESDAY: finish refactor 
public class WriteDestination {
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

    // ad-hoc polymorphism: actual method called is determined
    // at runtime

    // subtyping polymorphism: if we want something of one type,
    // a more specific type also works
    //
    // public static void takesObject(Object obj) { ... }
    //
    // takesObject(new Object());
    // takesObject("foo");
    
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
