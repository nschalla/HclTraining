package com.handondayone_4;

public class Player {
String playerName,countryName,Skill;


public Player(String playerName, String countryName, String skill) {
	super();
	this.playerName = playerName;
	this.countryName = countryName;
	Skill = skill;
}

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}

public String getCountryName() {
	return countryName;
}

public void setCountryName(String countryName) {
	this.countryName = countryName;
}

public String getSkill() {
	return Skill;
}

public void setSkill(String skill) {
	this.Skill = skill;
}
}
