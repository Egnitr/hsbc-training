
public class EmpApp {

	public static void main(String[] args) {
		EmpDao dao= new EmpDaoFileSystemImpl();
		EmpService service=new EmpService(dao);
		
		String resp=service.registerEmp(123, "Scott");
		System.out.println(resp);

	}

}
