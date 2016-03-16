package RMI;

import java.rmi.RemoteException;

public class Calc implements ICalc {
	public int add(int x, int y) throws RemoteException 
	{
		return x + y;
	}
	public int mult(int x, int y) throws RemoteException 
	{
		return x * y;
	}
	@Override
	public int div(int x, int y) throws RemoteException {
		return x/y;
	}
	@Override
	public int sub(int x, int y) throws RemoteException {
		
		return x-y;
	}
}
