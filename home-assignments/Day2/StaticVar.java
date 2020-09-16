class StaticVar{
  static int age;
  static String name;
  static void disp(){
      System.out.println("Age is: "+age);
      System.out.println("Name is: "+name);
  }
  static int count=0;
   public void increment()
   {
       count++;
   }
  public static void main(String args[]) 
  {
	  age = 30;
	  name = "Steve";
    disp();
    StaticVar obj1=new StaticVar();
    StaticVar obj2=new StaticVar();
    obj1.increment();
    obj2.increment();
    System.out.println("Obj1: count is="+obj1.count);
    System.out.println("Obj2: count is="+obj2.count);
  }
}