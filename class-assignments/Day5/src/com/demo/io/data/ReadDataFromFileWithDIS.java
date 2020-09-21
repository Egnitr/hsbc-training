package com.demo.io.data;

import java.io.*;
public class ReadDataFromFileWithDIS {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis=null;
		DataInputStream dis=null;
		try {
			File file = new File("mydata.dat");
			fis = new FileInputStream(file);
			bis= new BufferedInputStream(fis);
			dis=new DataInputStream(bis);
			while (true) {
				int id = dis.readInt();
				String name= dis.readUTF();
				String city=dis.readUTF();
				double sal= dis.readDouble();
				System.out.println(id+name+city+sal);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found..");
		}  catch (EOFException e) {
				System.out.println("Done reading");
		}catch (IOException e) {
			System.out.println(e);
		}
	}

}
