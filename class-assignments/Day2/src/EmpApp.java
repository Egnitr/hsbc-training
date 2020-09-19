public class EmpApp {
		int EmpId;
		String Name;
		public int getEmpId() {
			return EmpId;
		}
		public String getName() {
			return Name;
		}
		public void setEmpDetails(int empId, String name) {
			EmpId = empId;
			Name = name;
			System.out.print(EmpId+" ");
			System.out.println(Name);
		}

	public static void main(String[] args)  
    { 	
        EmpApp e[] = new EmpApp[10];
        for(int i=0;i<2;i++) {
        	e[i]= new EmpApp();
	        e[i].setEmpDetails(i+101,"Abhishek"+i);
        }
        int id=101;
        System.out.println("Searching EmpId "+id); 
        for(int i=0;i<e.length;i++) {
	        if(e[i].getEmpId()==id) {
	        	System.out.println("Employee "+id+" Found");
	        	break;
	        }
        }
        System.out.println("Entering new employee");
        for(int i=0;i<e.length;i++) {
	        if(e[i]==null) {
	        	e[i]= new EmpApp();
	        	e[i].setEmpDetails(i+101,"Abhishek"+i);
	        	break;
	        }
        }

        System.out.println("Listing all employees"); 
        for(int i=0;i<e.length;i++) {
        	if(e[i]==null) {
	        	break;
	        }
        	System.out.println("Employee: "+e[i].getEmpId());
        	System.out.println("Name: "+e[i].getName());
        	
        }
    } 
}
