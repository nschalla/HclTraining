package Probs1;

public class GoldStall implements Stall{
	String stallName,ownerName;
	Integer cost,tvSet;
	
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

	public Integer getTvSet() {
		return tvSet;
	}

	public void setTvSet(Integer tvSet) {
		this.tvSet = tvSet;
	}

	public GoldStall(String stallName, String ownerName, Integer cost, Integer tvSet) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.tvSet = tvSet;
	}

	public GoldStall() {
		super();
	}

	@Override
	public void display() {
		System.out.println("Stall Name :"+getStallName());
		System.out.println("Cost : "+getCost());
		System.out.println("Owner Name : "+getOwnerName());
		System.out.println("Number of tv sets"+getTvSet());
	
	}

}
