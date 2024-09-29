package client;

import server.ServerSideRMIService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiClient {
    public static void main(String args[]) {
        try {
            ServerSideRMIService service = (ServerSideRMIService) Naming
                    .lookup("rmi://localhost:6799/GreetingRMI");

            System.out.println("To say hello: " + service.sayHello());

            System.out.println("To say goodbye: " + service.sayBye());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
