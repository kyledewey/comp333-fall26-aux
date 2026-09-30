// FileDestination is-a WriteDestination
public class FileDestination extends WriteDestination {
    // FileDestination has-a FileWriter
    final FileWriter fileWriter;

    public FileDestination(FileWriter fileWriter) {
	assert(fileWriter != null);
	this.fileWriter = fileWriter;
    }
    
    public void write(int result) {
	fileWriter.write("" + result + "\n");
    }

    public void close() {
	fileWriter.close();
    }
}
