package threads;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Lembrete extends Thread
{
	private String nomeMedicamento;
	private int intervalo;
	private int total;
	private Socket socket;
	
	public Lembrete(String nomeMedicamento, int intervalo, int total)
	{
		this.nomeMedicamento = nomeMedicamento;
		this.intervalo = intervalo;
		this.total = total;
	}
	
	public Lembrete(Socket socket) throws UnknownHostException, IOException
	{
		socket = null;
	}
	
	@Override
	public void run()
	{
		//DataInputStream in;
		DataOutputStream out;
		
		try 
		{
			socket = new Socket("localhost", 5000);
			//in     = new DataInputStream(socket.getInputStream());
			out    = new DataOutputStream(socket.getOutputStream());	
			
			out.writeUTF(nomeMedicamento);
			out.writeInt(intervalo);
			out.writeInt(total);
			
		} 
		catch (UnknownHostException e1)
		{
		
			e1.printStackTrace();
		} 
		catch (IOException e1) 
		{
	
			e1.printStackTrace();
		}
		
//		for(int i = 0; i < total; i++)
//		{
//			System.out.println("Tomar medicamento: "+this.nomeMedicamento+" Em cada: "+this.intervalo+" horas tomado: "+(i+1));
//			try {
//				Thread.sleep(1000*intervalo);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
