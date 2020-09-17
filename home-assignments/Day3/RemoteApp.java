
public interface TVRemote {
	public String voiceAct();
	public int cost();
}
public class SamTV implements TVRemote {

	@Override
	public String voiceAct() {
		return "No";
	}

	@Override
	public int cost() {
		return 2000;
	}

}
public class IplTV implements TVRemote {

	@Override
	public String voiceAct() {
		return "Yes";
	}

	@Override
	public int cost() {
		return 6000;
	}

}
public class RemoteApp {

	public static void main(String[] args) {
		String TVRemoteType="I";
		if(TVRemoteType.equals("S")) {
			TVRemote w=new SamTV();
			System.out.println(w.voiceAct());
			System.out.println(w.cost());
		}
		if(TVRemoteType.equals("I")) {
			TVRemote w=new IplTV();
			System.out.println(w.voiceAct());
			System.out.println(w.cost());
		}
		
	}

}