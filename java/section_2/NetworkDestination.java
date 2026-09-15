public class NetworkDestination extends WriteDestination {
    final NetworkWriter netWriter;

    public NetworkDestination(final NetworkWriter netWriter) {
	this.netWriter = netWriter;
    }

    public void write(int result) {
	netWriter.sendInteger(result);
    }
}
