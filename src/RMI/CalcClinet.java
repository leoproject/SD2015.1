package RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalcClinet {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry reg = LocateRegistry.getRegistry("localhost", 9900);
		ICalc calc = (ICalc) reg.lookup("cal1");
		int z = calc.mult(50, 1000000);
		System.out.println(z);
		int zb = calc.sub(50, 1000000);
		System.out.println(zb);
		int b = calc.div(8, 4);
		System.out.println(b);
		

	}

}
