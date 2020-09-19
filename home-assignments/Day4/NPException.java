public class NPException {
	public class NPException extends RuntimeException {
	NPException nb;
	}

	private double balance;
	public NPException(double balance) {
		this.balance = balance;
	}
	public double withraw(double amount) throws LBException {
		try {
			if(balance<1000)
			System.out.println("Low Balance");
			throw new LBException();
		} catch (LBException e) {
			System.out.println(e);
		}
		return balance;
		
	}
	public static void main(String[] args) {
		NPException b=new NPException();
		System.out.println(b.withraw(1000));
	}
	

}
