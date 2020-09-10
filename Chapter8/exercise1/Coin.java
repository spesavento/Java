public class Coin {
    
    private double value;
    private String name;

    //e.g. 0.25, Quarter
    public Coin(double aValue, String aName) {
        value = aValue;
        name = aName;
    }

    /**
     * returns the value of the coin
     * @return value of the coin
     */
    public double getCoinValue() {
        return value;
    }

    /**
     * returns the name of the coin
     * @return name of the coin
     */
    public String getCoinName() {
        return name;
    }

    
}
