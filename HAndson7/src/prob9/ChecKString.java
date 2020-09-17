package prob9;

public class ChecKString {
 String humpty;

public ChecKString() {
	super();
}

public ChecKString(String humpty) {
	super();
	this.humpty = humpty;
}
 public void check() {
	 if(humpty==humpty.toUpperCase()) {
		 System.out.println("String is in uppercase");
	 }
	 else {
		 System.out.println("String is not in uppercase");
	 }
}
}
