package com.tprmi.interf;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloWorldImpl extends UnicastRemoteObject implements InterfHelloWorld {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloWorldImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sayHello() {
		System.out.println("Hello World !");
	}

	@Override
	public void sayHello(String person) {
		System.out.println("Hello "+ person +" !");
	}

}
