package com.demo.io.ser;
import java.io.*;

public class MyEmpSer {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("emp.ser");
		ObjectOutputStream objOut=new ObjectOutputStream(fos);
		for (int i = 0; i < 11; i++) {
			Emp emp=new Emp(100+i,"Abhi"+i,"Pune",1000);
			objOut.writeObject(emp);
		}
		
		objOut.close();
		System.out.println("Object serialized");
	}

}
