public abstract class BirdT {

    public void eat() {
        System.out.println("All birds eat");
    }

    public void sleep() {
        System.out.println("All birds sleep");
    }

    public abstract void fly();

}
public class Parrot extends BirdT {
    @Override
    public void fly() {
      System.out.println("Parrot flies!!!!");
    }
}

public class Duck extends BirdT {
    @Override
    public void fly() {
        System.out.println("Duck does not fly!!");
    }
}
public class Bird{
	public static void main(String[] args) {
		String BirdType="D";
		if(BirdType.equals("P")) {
			BirdT w=new Parrot();
			System.out.println(w.eat());
			System.out.println(w.fly());
		}
		if(BirdType.equals("D")) {
			BirdT w=new Duck();
			System.out.println(w.sleep());
			System.out.println(w.fly());
		}
		
	}
}