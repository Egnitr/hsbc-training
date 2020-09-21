package com.demo.io;

import java.io.*;

public class ArrayWrite{

	public static void main(String[] args) {
		char arr[]=new char[300];
		int i=0;
		FileReader fis = null;
		BufferedReader bis=null;
		try {
			File file = new File("demo.txt");
			fis = new FileReader(file);
			bis= new BufferedReader(fis);
			int data = 0;
			while ((data = bis.read()) != -1) {
				arr[i++]=(char)data;
				System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found..");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally..");
			try {
				if(bis!=null) {
				bis.close();

				}
			} catch (IOException e) {
				System.out.println("Streams could not be closed : " + e);
			}

		}
	}

}