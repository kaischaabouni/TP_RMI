package com.tprmi.hello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.tprmi.interf.InterfHelloWorld;

public class ClientMain {

	public static void main(String[] args) {
		//nom
		String name = "//localhost/HelloWorld";

		//objet remote
		InterfHelloWorld remoteObjHello;
		
		try {
			//récuperer objet distant
			remoteObjHello = (InterfHelloWorld) Naming.lookup(name);
			
			//appels des méthodes de l'obket distant
			remoteObjHello.sayHello();
			remoteObjHello.sayHello("Kais");		
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
