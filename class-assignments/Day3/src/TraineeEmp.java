
public class TraineeEmp extends Employee {
	private String performance;

	public TraineeEmp(int id,String name,double salary,String performance) {
		super(id,name,salary);
		this.performance=performance;
	}

	public String getDetails() {
		return super.getDetails()+performance;
	}
	public static void main(String[] args) {
		TraineeEmp emp=new TraineeEmp(101,"Abhi",45000, "Good");
		System.out.println(emp.getDetails());
	}
	
}
