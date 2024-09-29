package server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiServer {
    public static void main(String[] args) {
        try {
            ServerSideRMIService service = new ServerSideRMIServiceImpl();

            LocateRegistry.createRegistry(6799);

            Naming.bind("rmi://localhost:6799/GreetingRMI", service);

            System.out.println("Server is running");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}