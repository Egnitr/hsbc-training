import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
		System.out.println(nums.stream().filter(n->(n%2==0)).max((x,y)->x.compareTo(y)).get()); ;
		
		List<String> names=Arrays.asList("Shantanu","Champak","Shankar");
		names.stream().filter(s->s.startsWith("Sh")).filter(s->s.length()>7).forEach(System.out::println);
	}

}

class x implements Comparator<Integer>{
	public int compare(Integer o1,Integer o2) {
		return o1.compareTo(o2);
	}
}