package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerSideRMIServiceImpl extends UnicastRemoteObject implements ServerSideRMIService {
    public ServerSideRMIServiceImpl() throws RemoteException {};

    @Override
    public String sayHello() {
        return "Hello!";
    }

    @Override
    public String sayBye() {
        return "Goodbye!";
    }
}
