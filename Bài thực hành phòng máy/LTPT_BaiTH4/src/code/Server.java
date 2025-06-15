package code;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Server {
	public static void main(String[] args) throws IOException {
        // don't need to specify a hostname, it will be the current machine
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("ServerSocket awaiting connections...");
        Socket socket = ss.accept(); // blocking call, this will wait until a connection is attempted on this port.

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        // read the message from the socket
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
        	//Get message from Client
        	String clientMessage = dataInputStream.readUTF();
        	if(clientMessage.equals('q')) {
        		break;
        	}
        	System.out.println("Client say: "+clientMessage);
        	
        	
        	//Send Message from Server
        	System.out.println("Message from Server: ");
        	String serverMessage = scanner.nextLine();
        	dataOutputStream.writeUTF(serverMessage);
        	dataOutputStream.flush();
        	
        }
        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
    }
	
}
