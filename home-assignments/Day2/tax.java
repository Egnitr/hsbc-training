package day2HomeAssign.a11;

public class tax {
	public void deduct(employee emp) {
		int sal = emp.getsalary();
		if(sal <= 5000)
		{
			double x = sal*0.05;
			double nw = sal-x;
			System.out.println(nw);
		}
		else if(sal <= 10000)
		{
			double x = sal*0.1;
			double nw = sal-x;
			System.out.println(nw);
		}
		else
		{
			double x = sal*0.2;
			double nw = sal-x;
			System.out.println(nw);
		}
	}
}
