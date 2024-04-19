package lect_16.muenzautomat;

/** Die nachfolgende Klasse beinhaltet einen sehr einfachen
 * Algorithmus zur Ermittlung des Wechselgelds: Es wird
 * der gesamte Betrag in 1-Cent-Muenzen ausgegeben.
 */ 
public class SimpleChangeCalculator implements ChangeCalculator
{
	public int[] getChange(int euros, int cent)
	{
		int[] change = new int[8];
		Coin[] currency = Coin.values();

		int moneyGiven = euros*100+cent;

		for(int i = currency.length-1; i>=0; i--){
			int coinNumber = moneyGiven/currency[i].value;
			moneyGiven = moneyGiven - coinNumber*currency[i].value;
			change[i] = coinNumber;
		}
		return change;
	}

	public static void main(String[] args) {
		SimpleChangeCalculator test = new SimpleChangeCalculator();

		int[] testarray = test.getChange(12,89);
		for(int c : testarray){
			System.out.println(c);
		}
	}
}
