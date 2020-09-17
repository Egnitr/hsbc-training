class Parent {  } 
class Child extends Parent { } 
  
class Test 
{ 
    public static void main(String[] args) 
    { 
        Child c = new Child(); 
  
        if (cobj instanceof Child) 
           System.out.println("c is instance of Child"); 
        else
           System.out.println("c is NOT instance of Child");            
    } 
}