/* E3.1/E3.2 
We want to add a button to the tally counter in Section 3.1 that allows an operator to undo an accidental button click. 
Provide a method public void undo() that simulates such a button. As an added precaution, make sure that clicking the 
undo button more often than the click button has no effect. Simulate a tally counter that can be used to admit a limited 
number of people. First, the limit is set with a call public void setLimit(int maximum). If the click button is clicked 
more often than the limit, it has no effect. 
*/

/** 
 * This class models a tally counter
 */
public class Counter {
    private int value;
    private int limit;

    /**
     * Gets the current value of this counter.
     * @return the current value
     */
    public int getValue() {
        return value;
    }

    /**
     * Advances the value of this counter by 1.
     */
    public void click(){
        value = value + 1;
        value = Math.min(value, limit);
    }

    /**
     * Undoes 1 click or value of the counter.
     */
    public void undo(){
        value--;
        //make sure it can not be below 0
        value = Math.max(value, 0);
    }
    
    /**
     * Set the limit for the number of clicks
     */
    public void setLimit(int maximum) {
        limit = maximum;
    }

    /**
     * Resets the value of this counter to 0;
     */
    public void reset() {
        value = 0;
    }
}
