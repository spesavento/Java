/*E8.2
Modify the giveChange method of the CashRegister class so that it returns the number
of coins of a particular type to return:
int giveChange(Coin coinType)
The caller needs to invoke this method for each coin type, in decreasing value.
*/

public class CashRegister {

    private double purchase;
    private double payment;

    /**
     * Constructor
     */
    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    /**
     * recordPurchase
     */
    public void recordPurchase(double amount) {
        purchase += amount;
    }

     /**
     * receivePayment
     * @number is number of the particular coin
     * @coin is the type of Coin returned by Coin class
     */
    public void receivePayment(int number, Coin coin) {
        payment = payment + number * coin.getCoinValue();
    }

    /**
	 * Gets the total payment
	 */
	public double getTotalPayment()
	{
		return payment;
	}
	
	/**
	 * Gets the total purchase price
	 */
	public double getTotalPurchase()
	{
		return purchase;
	}
	
	/**
	 * Gets the total change due
	 */
	public double getTotalChange()
	{
		return (payment - purchase);
    }
    
     /**
     * giveChange
     */
    public double giveChange(Coin coinType) {
        double value = coinType.getCoinValue(); //1.00, 0.25, etc
        double change = payment - purchase;  //.03
        
        //find number of the coinType to be paid as change
        int coinCount = (int) (change / value);  //e.g. .03/.01 = 3 pennies
        //subtract this from the payment for next time
        
        payment = payment - coinCount * value;

        return coinCount;

        //pennies may be off by one due to rounding error, you could add this on
    }
}
