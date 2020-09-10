package Probs1;

public class ExectuiveStall implements Stall {
	String stallName,ownerName;
	Integer cost,screen;
	
	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	

	public ExectuiveStall(String stallName, String ownerName, Integer cost, Integer screen) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.screen = screen;
	}

	public Integer getScreen() {
		return screen;
	}

	public void setScreen(Integer screen) {
		this.screen = screen;
	}

	public ExectuiveStall() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {

		System.out.println("Stall Name :"+getStallName());
		System.out.println("Cost : "+getCost());
		System.out.println("Owner Name : "+getOwnerName());
		System.out.println("Number of the Screen : "+getScreen());
	}

}
