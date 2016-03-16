//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class P2TCP {
//
//	public static void main(String[] args) throws IOException {
////	ServerSocket ss = new ServerSocket(7000);// represent the socket, bind and list
////	Socket socket = ss.accept();// blocker if i take the three lines will to accept the three given of list
//	
//	InputStream in = socket.getInputStream();
//	OutputStream out = socket.getOutputStream();
//	
//	byte [] buf = new byte[10];
//	int tam = in.read(buf);
//	
//	String msg = new String (buf,0,tam);
//	System.out.print(msg);
//	
//	//respost
//	
//	String msg2="Tudo bem";
//	byte[] buf2 =msg2.getBytes();
//	out.write(buf2);
//	socket.close();
//	
//	
//	
//
//	}
//
//}
