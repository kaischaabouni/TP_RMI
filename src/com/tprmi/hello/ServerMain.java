package com.tprmi.hello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import com.tprmi.interf.HelloWorldImpl;

public class ServerMain {

	public static void main(String[] args) {
		//nom
		String name = "//localhost/HelloWorld";
		//
		HelloWorldImpl objHello;
		
		try {
			objHello = new HelloWorldImpl();
			
			//créer registre, port: 1099
			LocateRegistry.createRegistry(1099);
			
			//associer objet objSayHello au nom name
			Naming.rebind(name, objHello);
			
			System.out.println("serveur en marche");
		}
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (RemoteException ex) {
			System.out.println("Failed to create the server");
			ex.printStackTrace();
		}
		
	}

}
