package com.wipro.abc;

public class Player {

	public String PlayerId;
	public String PlayerName;
	public Country Country;
	public String getPlayerId() {
		return PlayerId;
	}
	public void setPlayerId(String playerId) {
		PlayerId = playerId;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public Country getCountry() {
		return Country;
	}
	public void setCountry(Country country) {
		Country = country;
	}
	public Player(String playerId, String playerName, Country country) {
		super();
		PlayerId = playerId;
		PlayerName = playerName;
		Country = country;
	}
	public Player()
	{
		
	}
	@Override
	public String toString() {
		return "Player [PlayerId=" + PlayerId + ", PlayerName=" + PlayerName + ", Country=" + Country + "]";
	}
	
}
