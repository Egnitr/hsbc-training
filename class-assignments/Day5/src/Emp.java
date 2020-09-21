public class Emp {
	private int id;
	private String name;
	
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String show() {
		return (id + "  " + name+"\n");
	}

}
