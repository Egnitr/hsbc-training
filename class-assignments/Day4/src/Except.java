
public class Except {

	public static void main(String[] args) {
		int[] num= {1,3,4,2};
		String[] names=new String[5];
		//name[2].length();
		try { 
			System.out.println(num[4]);
			
		}
		catch (Exception e) {
			System.out.println("Array size is less than specified");
		}
	}

}
