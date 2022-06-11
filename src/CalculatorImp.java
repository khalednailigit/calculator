import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImp extends UnicastRemoteObject implements ICalculator {

    protected CalculatorImp() throws RemoteException {
        super();
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws RemoteException {
        return a / b;
    }
   
    
}
