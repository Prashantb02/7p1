package LP1;
import java.net.ServerSocket;
import java.net.Socket;
public class SimpleHTTPServer {

	public static void main(String[] args) throws Exception {
		final ServerSocket server = new ServerSocket(8080);
		System.out.println("Listening for connection on port 8080....");
		while(true) {
			final Socket client = server.accept();
		}
		
	}

}
