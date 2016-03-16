package RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class CalcServer {

	public static void main(String[] args) throws RemoteException {
		Calc calc = new Calc();
		ICalc stub =(ICalc) UnicastRemoteObject.exportObject(calc, 7788);
		Registry reg = LocateRegistry.createRegistry(9900);
		reg.rebind("cal1", stub);
		
	}

}
