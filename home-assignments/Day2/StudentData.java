class StudentData
{
   private int stuID;
   private String stuName;
   private int stuAge;
   StudentData()
   {
       stuID = 100;
       stuName = "New Student";
       stuAge = 18;
   }
   StudentData(int num1, String str, int num2)
   {
       stuID = num1;
       stuName = str;
       stuAge = num2;
   }
   public int getStuID() {
       return stuID;
   }

   public String getStuName() {
       return stuName;
   }
   public int getStuAge() {
       return stuAge;
   }

   public static void main(String args[])
   {
       StudentData myobj = new StudentData();
       System.out.println("Student Name is: "+myobj.getStuName());
       System.out.println("Student Age is: "+myobj.getStuAge());
       System.out.println("Student ID is: "+myobj.getStuID());

       StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
       System.out.println("Student Name is: "+myobj2.getStuName());
       System.out.println("Student Age is: "+myobj2.getStuAge());
       System.out.println("Student ID is: "+myobj2.getStuID()); 
  }
}