import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpProcessing {

	public static void main(String[] args) {
		Set<Emp> empSet = new HashSet<>();
			empSet.add(new Emp(100, "Rajesh", "Hyderabad", 45000));
			empSet.add(new Emp(101, "Scott", "London", 55000));
			empSet.add(new Emp(102, "Ashish", "Bangalore", 65000));
			empSet.add(new Emp(103, "Shantanu", "Hyderabad", 35000));
			empSet.add(new Emp(104, "Rupa", "Hyderabad", 35000));
			empSet.add(new Emp(105, "Chethan", "Delhi", 45000));
			empSet.add(new Emp(106, "Kirthi", "Bangalore", 75000));
			empSet.add(new Emp(107, "Kamal", "Bangalore", 45000));
			empSet.add(new Emp(108, "Manoj", "Hyderabad", 75000));
			empSet.add(new Emp(109, "Ramesh", "Hyderabad", 65000));
			
			//empSet.stream().forEach(System.out::println);
			empSet .stream()
			.filter(s->s.getSal()>50000)
			.forEach(System.out::println);
			
			empSet .stream()
			.filter(e->e.getCity().equals("Hyderabad"))
			.map(e->{e.setSal(e.getSal()+5000); return e;}
			.forEach(System.out::println);
	}

}
