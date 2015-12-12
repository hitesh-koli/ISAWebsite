package GameBeans;

import java.util.HashMap;


public class SingleGame {

	private UserDetails [] currentPlayers = new UserDetails [3];
	
	//user id, numberofhandswon
	private HashMap<String,Integer> handsWonPerUserThisGame =new  HashMap<String, Integer>();
	
	//<userid>,<cards[]>
	private HashMap<String,Cards[]> currentDistributedCards = new HashMap<String ,Cards[]>();
	
	
	public HashMap<String,Cards[]> getCurrentDistributedCards() {
		return currentDistributedCards;
	}
	public void setCurrentDistributedCards(HashMap<String ,Cards[]> currentDistributedCards) {
		this.currentDistributedCards = currentDistributedCards;
	}
	public UserDetails [] getCurrentPlayers() {
		return currentPlayers;
	}
	public void setCurrentPlayers(UserDetails [] currentPlayers) {
		this.currentPlayers = currentPlayers;
	}
	public HashMap<String,Integer> getHandsWonPerUserThisGame() {
		return handsWonPerUserThisGame;
	}
	public void setHandsWonPerUserThisGame(HashMap<String,Integer> handsWonPerUserThisGame) {
		this.handsWonPerUserThisGame = handsWonPerUserThisGame;
	}
}
