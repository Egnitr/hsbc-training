public class App1{
	public int calculate(int a,int b) {
		try {
			return App2.divide(a,b);
		} catch (Exception e) {
			throw e;
		}
		
	}
}