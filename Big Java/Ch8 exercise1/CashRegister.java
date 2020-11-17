/*E8.1
Implement the Coin class described in Section 8.2. Modify the CashRegister class so that coins can be added to the 
cash register, by supplying a method void receivePayment(int coinCount, Coin coinType) 
The caller needs to invoke this method multiple times, once for each type of coin that is present in the payment.
*/

/**
 * holds coins and computes their total
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
     * Record the purchase of an item
     */
    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void receivePayment(int coinCount, Coin coinType) {
        payment = payment + coinCount*coinType.getCoinValue();
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}