import java.io.*;

public class MyCusDeser {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("cus.ser");
		ObjectInputStream objIn=new ObjectInputStream(fis);
		try {
			while(true) {
			Cus e=(Cus)objIn.readObject();
			System.out.println(e.getId()+e.getName());
			}
		} catch (EOFException e) {
			System.out.println("Done");
		}
		
		objIn.close();
		System.out.println("Object Deserialized");
	}

}
