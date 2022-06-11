import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

  public static void main(String[] args) {
    try {
      String policy = "file:./security.policy";
      System.setProperty("java.security.policy", policy);
      //register service
      Registry registry = LocateRegistry.createRegistry(1099);
      ICalculator calculator = new CalculatorImp();
      registry.rebind("CalculatorService", calculator);
      System.out.println("Server is waitin for request");
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }
}
