 package prb2;

public class Stall {
	protected String name,detail,ownerName;

	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public Stall() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void DoubleComputeCost(String stallType,Integer squareFeet,Integer numberOfTv) {
		double price;
		if(stallType=="PLATINUM") {
			price=((squareFeet*200)+(numberOfTv*10000));
			System.out.println("the cost of stall"+price);
			
		}
		else if (stallType=="DIAMOND") {
			price=((squareFeet*150)+(numberOfTv*10000));
			System.out.println("the cost of stall"+price);
			
		}
		else if(stallType=="GOLD") {
			price=((squareFeet*100)+(numberOfTv*10000));
			System.out.println("the cost of stall"+price);
		}
	}
	public void DoubleComputeCost(String stallType,Integer squareFeet) {
		
		double price;
		if(stallType=="PLATINUM") {
			price=((squareFeet*200));
			System.out.println("the cost of stall"+price);
			
		}
		else if (stallType=="DIAMOND") {
			price=((squareFeet*150));
			System.out.println("the cost of stall"+price);
			
		}
		else if(stallType=="GOLD") {
			price=((squareFeet*100));
			System.out.println("the cost of stall"+price);
		}
	}

}
