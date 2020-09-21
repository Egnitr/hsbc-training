package com.demo.io;

import java.io.*;

public class FileReaderWriter{

	public static void main(String[] args) {
		FileReader fis = null;
		FileWriter fos = null;
		BufferedReader bis=null;
		BufferedWriter bos=null;
		try {
			File file = new File("S:\\io\\demo.txt");
			fis = new FileReader(file);
			fos = new FileWriter("demo_1.txt");
			bis= new BufferedReader(fis);
			bos=new BufferedWriter(fos);
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