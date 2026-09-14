public class NetworkDestination extends WriteDestination {
    private final NetworkWriter netWriter;

    public NetworkDestination(NetworkWriter netWriter) {
	this.netWriter = netWriter;
    }

    public void write(int result) {
	netWriter.sendInteger(result);
    }

    public void close() {
	netWriter.disconnect();
    }
}
