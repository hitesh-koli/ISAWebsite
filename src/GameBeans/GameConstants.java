
package GameBeans;

public class GameConstants {
	public enum CardValue
	{
		//value of ace is the most hence keeping it more than one.
		Ace(111),
		Two(2),
		Three(3),
		Four(4),
		Five(5),
		Six(6),
		Seven(7),
		Eight(8),
		Nine(9),
		Ten(10),
		Eleven(11),
		Twelve(12),
		Thirteen(13);
		private int value;
		private CardValue(int value)
		{
			this.value=value;
		}
		public int getValue()
		{
			return value;
		}
	}
	public enum CardSuit
	{
		Spades(1),
		Hearts(2),
		Clubs(3),
		Diamonds(4);
		private int suitValue;
		private CardSuit(int suitValue)
		{
			this.suitValue = suitValue;
		}
		public int getSuitValue()
		{
			return suitValue;
		}
		
	}
	

}
