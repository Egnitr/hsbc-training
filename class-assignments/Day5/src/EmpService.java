public class EmpService {

	EmpDao dao;

	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name) {
		String resp = dao.save(new Emp(id, name));
		return resp;
	}
}