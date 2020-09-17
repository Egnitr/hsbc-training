package day2HomeAssign.a11;

public class Demo {

	public void studentFun(Student arr[]) {
		int sum =0;
		for(int i=0; i<arr.length; i++)
			sum += arr[i].getmarks();
		double avg = sum/arr.length;
		
		System.out.println("Marks Sum : " + sum + " avg : " + avg);
	}
	
	public void empFun(employee arr[]) {
		int sum =0;
		for(int i=0; i<arr.length; i++)
			sum += arr[i].getsalary();
		double avg = sum/arr.length;
		
		System.out.println("Salary Sum : " + sum + " avg : " + avg);
	}
	
	public static void main(String args[]) {
		Student arr[] = new Student[4];
		arr[0] = new Student(32);
		arr[1] = new Student(56);
		arr[2] = new Student(54);
		arr[3] = new Student(87);
		
		Demo d = new Demo();
		d.studentFun(arr);
		
		employee ar[] = new employee[3];
		ar[0] = new employee(10000);
		ar[1] = new employee(50000);
		ar[2] = new employee(4000);
		d.empFun(ar);
		
		tax t = new tax();
		t.deduct(ar[0]);
		t.deduct(ar[2]);
		
		
	}
}
