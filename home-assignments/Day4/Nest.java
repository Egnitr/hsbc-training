class Nest{
   public static void main(String args[]){
     try{
         try{
            System.out.println("Inside block1");
            int b =45/0;
            System.out.println(b);
         }
         catch(ArithmeticException e1){
            System.out.println("Exception: e1");
         }
    }
    catch(ArithmeticException e2){
    	 System.out.println("Arithmetic Exception");
         System.out.println("Inside parent try catch block");
    }
    catch(Exception e3){
    	System.out.println("Exception");
         System.out.println("Inside parent try catch block");
    }
  }
}