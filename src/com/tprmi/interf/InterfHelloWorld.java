package com.tprmi.interf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfHelloWorld extends Remote{
	public void sayHello() throws RemoteException;
	public void sayHello(String person) throws RemoteException;
}
