import java.io.*;

public class MyCusSer {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("cus.ser");
		ObjectOutputStream objOut=new ObjectOutputStream(fos);
		for (int i = 0; i < 3; i++) {
			Cus cus=new Cus(100+i,"Abhi"+i,"Pune");
			objOut.writeObject(cus);
		}
		
		objOut.close();
		System.out.println("Object serialized");
	}

}
