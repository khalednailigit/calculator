import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
         
            String serviceName = "CalculatorService";
            Registry registry = LocateRegistry.getRegistry();
            ICalculator calculator = (ICalculator) registry.lookup(serviceName);
            System.out.println("Addition: " + calculator.add(10, 20));
            System.out.println("Subtraction: " + calculator.subtract(10, 20));
            System.out.println("Multiplication: " + calculator.multiply(10, 20));
            System.out.println("Division: " + calculator.divide(10, 20));


        }catch(Exception e){
            e.printStackTrace();
        }
    
}
}
