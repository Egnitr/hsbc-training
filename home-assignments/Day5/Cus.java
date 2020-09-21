import java.io.Serializable;

public class Cus implements Serializable {
	int id;
	String name;
	String city;
	public Emp(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
