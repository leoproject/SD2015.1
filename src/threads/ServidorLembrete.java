package threads;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorLembrete 
{

	public static void main(String[] args) throws IOException 
	{
		ServerSocket sSocket = new ServerSocket(8000);

		while(true)
		{
			Lembrete lembrete = new Lembrete("Medicamento ",3,12);
			
			Socket socket = sSocket.accept();
			DataInputStream in = new DataInputStream(socket.getInputStream());
			
			String nome = in.readUTF();
			int valor = in.readInt();
			
			lembrete.start();
		}
	}	
}