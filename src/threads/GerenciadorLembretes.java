package threads;

public class GerenciadorLembretes 
{
	public static void main(String[] args)
	{
		final Lembrete l1 = new Lembrete("remédio 1",8,10);
		final Lembrete l2 = new Lembrete("remédio 2",12,20);
		final Lembrete l3 = new Lembrete("remédio 3",4,6);
		
		l1.start();
		l2.start();
		l3.start();
	}

}