/* E7.4 
Add a method removeMin to the Student class of Section 7.4 that removes 
the minimum score without calling other methods.
*/

public class Student {
    private double[] scores;
    private int scoresSize;

    public Student(int capacity) {
        scores = new double[capacity];
        scoresSize = 0;

    }

    public boolean addScore(double score) {

        //make sure there is room, then add it
        if(scoresSize < scores.length) {
            scores[scoresSize] = score;
            scoresSize++;
            return true;
        } else {
            return false;
        }
    }

    public double getSum() {
        //only loop through the number of filled indeces
        int sum = 0;
        for(int i = 0; i < scoresSize; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public double getMinimum() {
        //only loop through the number of filled indeces
        double minimum = scores[0];
        for(int i = 1; i < scoresSize; i++) {
            if(scores[i] < minimum) {
                minimum = scores[i];
            }
        }
        return minimum;
    }

    public void removeMin() {
        //find the position of the minimum score
        double minimum = scores[0];
        int minIndex = 0;
        for(int i = 1; i < scoresSize; i++) {
            if(scores[i] < minimum) {
                minimum = scores[i];
                minIndex = i;
            }
        }
        System.out.println("Min index is " + minIndex);
        System.out.println("scoresSize index is " + scoresSize);

        //remove the minimum and make indeces and size one less
        for(int j = minIndex + 1; j < scoresSize; j++) {
            scores[j - 1] = scores[j];
        }
        scoresSize--;
    }

    public void printArray() {
        for(int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    }

    public double finalScore() {

        if (scoresSize == 0) {
            return 0; }
        else if (scoresSize == 1) {
            return scores[0]; }
        else {
            return getSum() - getMinimum(); 
        }
    }
}
