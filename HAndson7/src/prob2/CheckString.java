package prob2;

public class CheckString {
String humpty,dumpty;;
public void check() {
boolean isfound=humpty.indexOf(dumpty)!=-1? true :false;
if(isfound==true) {
	System.out.println("  Found");
}
else {
	System.out.println("not found");
}
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
