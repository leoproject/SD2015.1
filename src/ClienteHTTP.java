
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteHTTP {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket ("www.ufs.br",80);
		String CRLF = "\r\n";
		String msg = "GET / HTTP\1.1"+CRLF+"Host:www.ufs.br"+CRLF+CRLF;
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		byte[] buf = msg.getBytes();
		out.write(buf);
		
		//version primate for recieve the request of server 
		
		byte[] bufR = new byte[256];
		int tam=0;
		String resp = null;
		while((tam = in.read(bufR))>-1)
		{
			resp = new String (bufR,0,tam);
			System.out.print(resp);
		}
		
		socket.close();

	}

}
