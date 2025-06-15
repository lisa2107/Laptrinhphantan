package code;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client {
	 int[] arrfromClient = new int[10];
	 public static void main(String[] args) throws IOException {
	        // need host and port, we want to connect to the ServerSocket at port 7777
	        Socket socket = new Socket("localhost", 7777);


	      
	        // create a data output stream from the output stream so we can send data through it
	        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
	        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
	        Scanner scanner = new Scanner(System.in);
	        
	        while(true) {
	        	//Send message to Server
	        	System.out.println("Message to Server: ");
	        	String string1 = scanner.nextLine();
	        	dataOutputStream.writeUTF(string1);
	        	dataOutputStream.flush();
	        	if(string1.equals('q')) {
	        		break;
	        	}
	        	//Get message from Server
	        	String string2 = dataInputStream.readUTF();
	        	System.out.println("Server say: "+string2);
	        }
	        
	        dataInputStream.close();
	        dataOutputStream.close();
	        
	        socket.close();
	    }

}
