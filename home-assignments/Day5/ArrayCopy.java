import java.io.*;

public class ArrayCopy{

  public static void main(String[] args) throws IOException {
    String arr[]= {"Abhishek1","Abhishek2","Abhishek3","Abhishek4","Abhishek5","Abhishek6","Abhishek7","Abhishek8","Abhishek9","Abhishek10","Abhishek11","Abhishek12","Abhishek13","Abhishek14","Abhishek15","Abhishek16","Abhishek17","Abhishek18","Abhishek19"};
    FileWriter fos = null;
    BufferedWriter bos=null;
    try {
      fos = new FileWriter("demo.txt");
      bos=new BufferedWriter(fos);
      for (int i = 0; arr[i] !=null; i++) {
        System.out.println(arr[i]);
        bos.write(arr[i]);
        bos.newLine();
      }
    } catch (Exception e) {
      System.out.println(e);
    } finally {
        if(bos!=null) {
        bos.close();
        }
    }
  }

}