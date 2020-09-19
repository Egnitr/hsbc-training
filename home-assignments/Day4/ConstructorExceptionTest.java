public class ConstructorExceptionTest {
   public ConstructorExceptionTest() throws InterruptedException {
      System.out.println("Preparing an Object");
      throw new InterruptedException();
   }
   public static void main(String args[]) {
      try {
         ConstructorExceptionTest test = new ConstructorExceptionTest();
      } catch (InterruptedException e) {
         System.out.println("Got interrupted...");
      }
   }
}