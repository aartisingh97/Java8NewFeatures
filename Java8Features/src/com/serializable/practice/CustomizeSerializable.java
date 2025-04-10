package com.serializable.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizeSerializable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		System.out.println(a1.username + " " + a1.pwd);
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println(a2.username + " " + a2.pwd);
	}

}

class Account implements Serializable {
	String username = "Aarti";
	transient String pwd = "Sin009";

	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String epwd = "123" + pwd;
		os.writeObject(epwd);
	}

	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
	}
}
