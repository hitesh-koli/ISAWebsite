package GameRules;

import java.util.HashMap;

import GameBeans.UserDetails;

public class CardsOrHandsExchange {
	//as per the rules and logic a case exists that not more than 5 cards can be exchanged per game
	
	//time constraint lets not do card exchange
	//Player decides to exchange his cards for hands owed from previous game .. happens per game
	public boolean CardsExchange (UserDetails exchangeTo, UserDetails exchangeFrom,int numberOfCardsToExchange)
	{
		boolean isSuccess = false;
		
		if(numberOfCardsToExchange>exchangeFrom.getHandsWonPreviousGame())
		{
			isSuccess = false;
		}
		else
		{
			isSuccess = true;
			
		}
		
		return isSuccess;
	}

	// player decides to give make his hands 
	public boolean HandsExchange (UserDetails exchangeTo, UserDetails exchangeFrom,int numberOfHandsToExchanged)
	{
		boolean isSuccess = false;
		if(numberOfHandsToExchanged>exchangeFrom.getHandsWonPreviousGame())
		{
			isSuccess = false;
		}
		else
		{
			isSuccess = true;
			exchangeFrom.setHandsWonPreviousGame(exchangeFrom.getHandsWonPreviousGame() - numberOfHandsToExchanged);
			exchangeTo.setHandsWonPreviousGame(exchangeTo.getHandsWonPreviousGame() + numberOfHandsToExchanged);
			
			HashMap<String,Integer> from = exchangeFrom.getHandsOwedToOthers();
			from.put( exchangeTo.getUserId() ,from.get(exchangeTo.getUserId()) - numberOfHandsToExchanged);
		}
		return isSuccess;
	}
}
