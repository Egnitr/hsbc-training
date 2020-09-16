public class Factorial
{ 
    static int fact(int n) 
    { 
        while(n > 0){ 
         n*=(n-1);
        } 
        return n;
    } 
      
    public static void main(String[] args)  
    { 
        int num = 6; 
        System.out.println("Factorial of "+ num + " is " + fact(num));  
        }
    } 
} 