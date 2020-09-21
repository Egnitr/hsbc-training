import java.io.*;
public class EmpDaoFileSystemImpl implements EmpDao{

	@SuppressWarnings("finally")
	@Override
	public String save(Emp e) {
		FileWriter fw=null;
		String msg="emp not written";
		try {
			fw=new FileWriter("emp1.txt",true);
			String empData= e.show();
			fw.write(empData);
			System.out.println("msg written");
		}catch (Exception e1) {
			System.out.println(e1);
		}finally {
			try {
				if(fw!=null) {
					fw.close();
				}
			} catch (final Exception e2) {
				System.out.println(e);
			}
			return msg;
		}
		
	}

}
