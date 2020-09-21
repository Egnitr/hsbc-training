package com.demo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			File file = new File("S:\\io\\demo.txt");
			fis = new FileInputStream(file);
			fos = new FileOutputStream("demo_1.txt");
			bis= new BufferedInputStream(fis);
			bos=new BufferedOutputStream(fos);
			int data = 0;
			while ((data = bis.read()) != -1) {

				System.out.print((char) data);
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found..");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally..");
			try {
				if(bis!=null ||bos!=null) {
				bis.close();
				bos.close();
				}
			} catch (IOException e) {
				System.out.println("Streams could not be closed : " + e);
			}

		}
		System.out.println("End of task..");
	}

}