package prob5;

public class CheckString {
	String humpty,dumpty;;
	public void check() {
		String deleteString =humpty.replaceAll(dumpty, "");
		System.out.println(deleteString);
	}
	public CheckString(String humpty, String dumpty) {
		super();
		this.humpty = humpty;
		this.dumpty = dumpty;
	}

	public CheckString() {
		super();
		// TODO Auto-generated constructor stub
	}

}
