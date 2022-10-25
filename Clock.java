/**
 *First Problem
 * This is the Super Class
 */
public class Clock {
    private String hours;
    private String min;
    private String time;

    public String getHours() {
        hours = java.time.Instant.now().toString().substring(0,2);
        return hours;
    }

    public String getMin() {
        min = java.time.LocalTime.now().toString().substring(3,5);
        return min;
    }
    public String getTime() {
        time = getHours()+":"+getMin();
        return time;
    }


}