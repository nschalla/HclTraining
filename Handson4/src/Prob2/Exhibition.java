package Prob2;

public class Exhibition extends Event{
	 Integer noOfStall;

	public Integer getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(Integer noOfStall) {
		this.noOfStall = noOfStall;
	}

	public Exhibition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exhibition(Integer noOfStall) {
		super();
		this.noOfStall = noOfStall;
	}

	public Double projectedRevenue() 
	{
		
		return (double) (noOfStall*10000);
		
	}
 
	
}
