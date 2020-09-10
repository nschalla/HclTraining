package Prob2;

public class StageEvent extends Event {
	 Integer noOfShows,noOfSeatsPerShow;

	public StageEvent(Integer noOfShows, Integer noOfSeatsPerShow) {
		super();
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public StageEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(Integer noOfShows) {
		this.noOfShows = noOfShows;
	}

	public Integer getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(Integer noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public Double projectedRevenue() 
	{
		return (double) (noOfSeatsPerShow*noOfShows*50);
		
	}
}
