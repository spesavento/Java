public class CashRegisterTester {

    public static void main(String[] args) {
        final Coin DOLLAR = new Coin(1.00, "Dollar");
        final Coin QUARTER = new Coin(.25, "Quarter");
        final Coin DIME = new Coin(.10, "Dime");
        final Coin NICKEL = new Coin(.05, "Nickel");
        final Coin PENNY = new Coin(.01, "Penny");

        //create new cash register object
        CashRegister myRegister = new CashRegister();
        
        //record purchases
        myRegister.recordPurchase(4.25);
        myRegister.recordPurchase(10.00);
        myRegister.recordPurchase(9.75);
        myRegister.recordPurchase(5); 

        //pay in coins
        myRegister.receivePayment(27, DOLLAR);
        myRegister.receivePayment(6, QUARTER); 
        myRegister.receivePayment(5, DIME);  
        myRegister.receivePayment(5, NICKEL); 
        myRegister.receivePayment(5, PENNY); 

        double change = myRegister.giveChange();

        System.out.printf("Change: %.2f\n", change);
		System.out.println("Expected Change: 0.30");
		
		myRegister.recordPurchase(2.19);
		myRegister.recordPurchase(1.95);
		myRegister.recordPurchase(10.95);
		myRegister.recordPurchase(8.70);
		
		myRegister.receivePayment(20, DOLLAR);
		myRegister.receivePayment(8, QUARTER);
		myRegister.receivePayment(15, DIME);
		myRegister.receivePayment(10, NICKEL);
		myRegister.receivePayment(40, PENNY);
		
		double change2 = myRegister.giveChange();
		
		System.out.printf("Change: %.2f\n", change2);
		System.out.println("Expected Change: 0.61");
    }
}
