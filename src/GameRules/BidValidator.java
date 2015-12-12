package GameRules;

import GameBeans.SingleGame;
import GameBeans.UserDetails;

public class BidValidator {

	public boolean isBetValidFromEachUser(SingleGame thisGame)
	{
		boolean isValid = true;
		for(UserDetails singleUser:thisGame.getCurrentPlayers())
		{
			if(singleUser.getCurrentBid() < singleUser.getTotalAmount())
			{
				singleUser.setTotalAmount(singleUser.getTotalAmount()-singleUser.getCurrentBid());
			}
			else
			{
				isValid=false;
			}
		}
		return isValid;
	}
	
}
