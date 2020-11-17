/**
 * CounterTester tests the functionality of the methods added to the Counter class
 */
public class CounterTester {
    public static void main(String[] args){
        Counter counter = new Counter();

        counter.setLimit(6);

        /*click 7 times*/
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        counter.click();
        counter.click();

        /*Expect 6*/
        System.out.println("Counter: " + counter.getValue());

        /*undo 8 times*/
        counter.undo();
        counter.undo();
        counter.undo();
        counter.undo();
        counter.undo();
        counter.undo();
        counter.undo();
        counter.undo();

        /*Expect 0*/
        System.out.println("Counter: " + counter.getValue());

    }
}
