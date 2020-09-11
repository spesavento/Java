public class CashRegisterTester {

    public static void main(String[] args) {

        final Coin DOLLAR = new Coin(1.00, "DOLLAR");
        final Coin QUARTER = new Coin(.25, "QUARTER");
        final Coin DIME = new Coin(.10, "DIME");
        final Coin NICKEL = new Coin(.05, "NICKEL");
        final Coin PENNY = new Coin(.01, "PENNY");

        CashRegister myRegister = new CashRegister();

        myRegister.recordPurchase(4.35);
        myRegister.recordPurchase(5);
        myRegister.recordPurchase(8.92);
        myRegister.recordPurchase(12.85);

        myRegister.receivePayment(31, DOLLAR);
        myRegister.receivePayment(4, QUARTER);
        myRegister.receivePayment(3, DIME);
        myRegister.receivePayment(3, NICKEL);
        myRegister.receivePayment(9, PENNY);

        System.out.println("Purchase: " + myRegister.getTotalPurchase());
        System.out.println("Payment: " + myRegister.getTotalPayment());
        System.out.println("Change: " + myRegister.getTotalChange());

        System.out.println("Number of Dollars: " + myRegister.giveChange(DOLLAR));
		System.out.println("Number of Quarters: " + myRegister.giveChange(QUARTER));
		System.out.println("Number of Dimes: " + myRegister.giveChange(DIME));
		System.out.println("Number of Nickels: " +  myRegister.giveChange(NICKEL));
		System.out.println("Number of Pennies: " + myRegister.giveChange(PENNY));

    }

}
