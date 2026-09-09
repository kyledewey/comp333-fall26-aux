// FileDestination is a subtype of WriteDestination
// FileDestination is a subclass of WriteDestination
// FileDestination inherits from WriteDestination
//
// class FileDestination : WriteDestination 
// NEXT TIME: refactor networkwriter, ad-hoc polymorphism,
//            subtyping polymorphism
// 
public FileDestination extends WriteDestination {
    private final FileWriter fileWriter;

    public WriteDestination(FileWriter fileWriter) {
	this.fileWriter = fileWriter;
    }

    public void write(int result) {
	fileWriter.write("" + result + "\n");
    }

    public void close() {
	fileWriter.close();
    }
}

