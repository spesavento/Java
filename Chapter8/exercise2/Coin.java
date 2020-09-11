public class Coin {
    
    private double value;
    private String name;

    /**
     * Constructor
     */
    public Coin(double aValue, String aName) {
        value = aValue;
        name = aName;
    }

    /**
     * getCoinValue returns the value of a coin
     */
    public double getCoinValue() {
        return value;
    }
     /**
     * getCoinName returns the name of a coin
     */
    public String getCoinName() {
        return name;
    }
}
