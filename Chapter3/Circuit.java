/* E3.3/E3.4
Simulate a circuit for controlling a hallway light that has switches at both ends of the hallway. Each switch can be up or down, and the light can be on or off. Toggling either switch turns the lamp on or off. Provide methods
public int getFirstSwitchState() // 0 for down, 1 for up public int getSecondSwitchState()
public int getLampState() // 0 for off, 1 for on
public void toggleFirstSwitch()
public void toggleSecondSwitch()
*/
public class Circuit {

    private int switch1;
    private int switch2;
    private int lamp;

    /**
     * Constructor class
     */
    public Circuit() {
        switch1 = 0;
        switch2 = 0;
        lamp = 0;
    }

    public int getFirstSwitchState() {
        return switch1;
    }

    public int getSecondSwitchState() {
        return switch2;
    }

    public int getLampState() {
        return lamp;
    }

    public void toggleFirstSwitch() {
        if (switch1 == 0) {
            switch1 = 1;
        } else {
            switch1 = 0;
        }
    }

    public void toggleSecondSwitch() {
        if (switch2 == 0) {
            switch2 = 1;
        } else {
            switch2 = 0;
        }
    }
}
