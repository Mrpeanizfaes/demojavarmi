package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerSideRMIService extends Remote {
    public String sayHello() throws RemoteException;

    public String sayBye() throws RemoteException;
}
