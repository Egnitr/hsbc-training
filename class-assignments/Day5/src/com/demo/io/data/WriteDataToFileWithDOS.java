package com.demo.io.data;
import java.io.*;

public class WriteDataToFileWithDOS {

		public static void main(String[] args) throws Exception {
			FileOutputStream fos = new FileOutputStream("mydata.dat",true);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			DataOutputStream dos=new DataOutputStream(bos);
			dos.writeInt(100);
			dos.writeUTF("Abhishek");
			dos.writeUTF("PUNE");
			dos.writeDouble(10000);
			dos.close();
		}

	}
