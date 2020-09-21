package com.demo.io.emp;

import java.io.*;

public class RWEmp{

	public static void main(String[] args) {
		FileReader fis = null;
		BufferedReader bis=null;
		try {
			File file = new File("Emp.txt");
			fis = new FileReader(file);
			bis= new BufferedReader(fis);
			String line="";
			while ((line = bis.readLine()) != null) {

				System.out.println(line);
				String[] cols=line.split(",");
				int id=Integer.parseInt(cols[0]);
				double sal=Double.parseDouble(cols[3]);
				Emp e=new Emp(id,cols[1],cols[2],sal);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found..");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
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