package com.handondayone_3;


public class Delivery {
	private Long overs,balls,runs;
	private String batsmen,blower,nonStricker;
	
	public Delivery(Long overs, Long balls, Long runs, String batsmen, String blower, String nonStricker) {
		super();
		this.overs = overs;
		this.balls = balls;
		this.runs = runs;
		this.batsmen = batsmen;
		this.blower = blower;
		this.nonStricker = nonStricker;
	}

public Long getOvers() {
		return overs;
	}

	public void setOvers(Long overs) {
		this.overs = overs;
	}

	public Long getBalls() {
		return balls;
	}

	public void setBalls(Long balls) {
		this.balls = balls;
	}

	public Long getRuns() {
		return runs;
	}

	public void setRuns(Long runs) {
		this.runs = runs;
	}

	public String getBatsmen() {
		return batsmen;
	}

	public void setBatsmen(String batsmen) {
		this.batsmen = batsmen;
	}

	public String getBlower() {
		return blower;
	}

	public void setBlower(String blower) {
		this.blower = blower;
	}

	public String getNonStricker() {
		return nonStricker;
	}

	public void setNonStricker(String nonStricker) {
		this.nonStricker = nonStricker;
	}

public void displayDeliveryDetails() {
	System.out.println("Delivery Details:");
	System.out.println("Over : "+getOvers());
	System.out.println("Ball : "+getBalls());
	System.out.println("Runs : "+getRuns() );
	System.out.println("Batsmen : "+getBatsmen());
	System.out.println("Bolwer : "+ getBlower());
	System.out.println("NonStricker : "+getNonStricker());
}
}
