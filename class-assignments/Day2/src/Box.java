public class Box {
	private int length;
	private int breadth;
	private int height;
	private String color="Not set";
	private double weight;
	public Box(int length,int breadth,int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public Box(int length) {
		this(length,length,length);
	}
	public Box(int length,int breadth,int height,String color) {
		this(length,breadth,height);
		this.color = color;
	}
	public Box(int length,int breadth,int height,String color,double weight) {
		this(length,breadth,height,color);
		this.weight = weight;
	}
	public double getVolume() {
		return length*breadth*height;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public static void main(String[] args)  
    { 	
		Box b1=new Box(10,20,30);
		System.out.println(b1.getVolume());
		Box b2=new Box(10,20,30,"Blue");
		System.out.println(b2.getColor());
		Box b3=new Box(10,20,30,"Red",5.3);
		System.out.println(b3.getWeight());
    }
}
