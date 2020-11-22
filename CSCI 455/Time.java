public class Time {
    private int hr;
    private int min;
    private int sec;

    public Time(int hour, int minutes, int seconds) {
        hr = hour;
        min = minutes;
        sec = seconds;
    }

    public int getHour24() {
        return hr;
    }

    public int getHour12() {

        //not just hr - 12
        if (hr > 12) {
            return hr-12;
        } else if (hr == 0) {
            return 12;
        } else {
            return hr; 
        }
    }

    public boolean isPM() {
        if (hr > 12) {
            return true;
        } else {
            return false;
        }
    }

    // Returns the number of minutes past the hour
    public int getMinutes() {
        return min;
    }

    // Returns the number of seconds past the minute
    public int getSeconds() {
        return sec;
    }

    // Advances the time of day by one second (e.g., 18:24:59 turns to 18:25:00)
    // if we were already at the end of the day, wraps around to midnight (00:00:00)
    public void tick() {

        if (hr == 23 && min == 59 && sec == 59) {
            hr = 0;
            min = 0;
            sec = 0;

        }
        //change all to seconds and add 1
        int timeinSec = sec + min*60 + hr*60*60 + 1;
        hr = timeinSec/(60*60);
        min = (timeinSec - hr*(60*60))/(60);
        sec = (timeinSec - hr*(60*60) - min*60);
    }
}