public class FileDestination extends WriteDestination {
    final FileWriter fileWriter;

    public FileDestination(FileWriter fileWriter) {
	assert(fileWriter != null);
	this.fileWriter = fileWriter;
    }
    
    public void write(int result) {
	fileWriter.write("" + result + "\n");
    }
}
