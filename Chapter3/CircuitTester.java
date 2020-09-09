public class CircuitTester {
    public static void main(String[] args) {

        Circuit myCircuit = new Circuit();
        System.out.println("The expected value of first switch is 0");
        System.out.println("The actual value is " + myCircuit.getFirstSwitchState());
        System.out.println("The expected value of second switch is 0");
        System.out.println("The actual value is " + myCircuit.getSecondSwitchState());
        System.out.println("The expected value of the lamp is 0");
        System.out.println("The actual value is " + myCircuit.getLampState());

        //on off on
        System.out.println("After 3 switches, the expected value of first switch is 1");
        myCircuit.toggleFirstSwitch();
        myCircuit.toggleFirstSwitch();
        myCircuit.toggleFirstSwitch();
        System.out.println("The actual value is " + myCircuit.getFirstSwitchState());

        System.out.println("After 1 switch, the expected value of second switch is 1");
        myCircuit.toggleSecondSwitch();
        System.out.println("The actual value is " + myCircuit.getSecondSwitchState());

        System.out.println("After 3 more switches, the expected value of second switch is 0");
        myCircuit.toggleSecondSwitch();
        myCircuit.toggleSecondSwitch();
        myCircuit.toggleSecondSwitch();
        System.out.println("The actual value is " + myCircuit.getSecondSwitchState());

    }
}
