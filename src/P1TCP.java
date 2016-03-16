import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.Socket;

import java.net.UnknownHostException;




public class P1TCP {
	public static void main(String args[]) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",7000); // represent the socket,bind and connect
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		String msg="OLá";
		byte[] buf =msg.getBytes();
		out.write(buf);
		
		//out.write(msg.getBytes());
		
		//receive
		
		byte [] buf2 = new byte[12];
		int tam = in.read(buf2);
		
		String msg2 = new String (buf2,0,tam);
		System.out.print(msg2);
		socket.close();
		
		
		
	}

}
