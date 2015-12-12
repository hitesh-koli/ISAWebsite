package GameBeans;
import java.util.HashMap;

import GameBeans.Cards;

public class UserDetails {

	private String UserName,userId;

	//should be one two or three
	private int currentGamePosition;
	
	// 10 cards that are distibuted per player.
	private Cards [] currentDeck = new Cards[10];
	private Cards currentMoveCard = new Cards();
	
	private int currentBid,CurrentBitTotal;
	private int totalAmount;
	
	//userid, integer number of hands owed to him
	private HashMap<String,Integer> HandsOwedToOthers = new HashMap<String,Integer>(); 
	
	private int HandsWonPreviousGame;
	
	//if he or she wins 5/10 games in total, he /she wins Hurray (end condition)
	private int GamesWon;

	public Cards [] getCurrentDeck() {
		return currentDeck;
	}

	public void setCurrentDeck(Cards [] currentDeck) {
		this.currentDeck = currentDeck;
	}

	public int getCurrentGamePosition() {
		return currentGamePosition;
	}

	public void setCurrentGamePosition(int currentGamePosition) {
		this.currentGamePosition = currentGamePosition;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public int getGamesWon() {
		return GamesWon;
	}

	public void setGamesWon(int gamesWon) {
		GamesWon = gamesWon;
	}

	public HashMap<String,Integer> getHandsOwedToOthers() {
		return HandsOwedToOthers;
	}

	public void setHandsOwedToOthers(HashMap<String,Integer> handsOwedToOthers) {
		HandsOwedToOthers = handsOwedToOthers;
	}

	public int getHandsWonPreviousGame() {
		return HandsWonPreviousGame;
	}

	public void setHandsWonPreviousGame(int handsWonPreviousGame) {
		HandsWonPreviousGame = handsWonPreviousGame;
	}

	public Cards getCurrentMoveCard() {
		return currentMoveCard;
	}

	public void setCurrentMoveCard(Cards currentMoveCard) {
		this.currentMoveCard = currentMoveCard;
	}

	public int getCurrentBid() {
		return currentBid;
	}

	public void setCurrentBid(int currentBid) {
		this.currentBid = currentBid;
	}

	public int getCurrentBitTotal() {
		return CurrentBitTotal;
	}

	public void setCurrentBitTotal(int currentBitTotal) {
		CurrentBitTotal = currentBitTotal;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
}
