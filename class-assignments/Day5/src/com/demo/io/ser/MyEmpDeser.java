package com.demo.io.ser;
import java.io.*;

public class MyEmpDeser {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("emp.ser");
		ObjectInputStream objIn=new ObjectInputStream(fis);
		try {
			while(true) {
			Emp e=(Emp)objIn.readObject();
			System.out.println(e.getId()+e.getName());
			}
		} catch (EOFException e) {
			System.out.println("Done");
		}
		
		objIn.close();
		System.out.println("Object Deserialized");
	}

}
