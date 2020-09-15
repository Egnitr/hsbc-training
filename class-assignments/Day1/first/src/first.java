public class first 
{ 
    static int fact(int n) 
    { 
        if (n == 0) 
          return 1; 
          
        return n*fact(n-1); 
    } 
      
    public static void main(String[] args)  
    { 
        int num = 6; 
        System.out.println("Factorial of "+ num + " is " + fact(num)); 
        String name[]= new String[]{"Abhishek","Abhishek2","Abhishek3","Abhishek4","Abhishek5","Abhishek6","Abhishek8","Abhishek7","Abhishek9","Abhishek0"};
        for(int i=0;i<10;i++) {
        	System.out.println("Welcome "+ name[i]); 
        }
    } 
} 