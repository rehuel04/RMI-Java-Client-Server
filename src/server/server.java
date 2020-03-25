package server;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry   =  LocateRegistry.createRegistry(2020);
        implementasi sh = new implementasi();
        
        registry.rebind("wtf", sh);
        System.out.println("Server berjalan...");
    }
}
