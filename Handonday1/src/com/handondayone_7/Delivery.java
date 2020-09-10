package com.handondayone_7;

public class Delivery {
private Long over,ball,runs;
private String batsmen,bowler,nonStricker;
public Delivery() {
	
}
public Long getOver() {
	return over;
}
public void setOver(Long over) {
	this.over = over;
}
public Long getBall() {
	return ball;
}
public void setBall(Long ball) {
	this.ball = ball;
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
public String getBowler() {
	return bowler;
}
public void setBowler(String bowler) {
	this.bowler = bowler;
}
public String getNonStricker() {
	return nonStricker;
}
public void setNonStricker(String nonStricker) {
	this.nonStricker = nonStricker;
}
public Delivery(Long over, Long ball, Long runs, String batsmen, String bowler, String nonStricker) {
	super();
	this.over = over;
	this.ball = ball;
	this.runs = runs;
	this.batsmen = batsmen;
	this.bowler = bowler;
	this.nonStricker = nonStricker;
}
}
