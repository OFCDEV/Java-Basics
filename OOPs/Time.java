package OOPs;
public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Overriding the toString() method to format the time as "hh:mm because Java doesn't have << operator"
    @Override
    public String toString() {
        // Format the hours and minutes to always display two digits
        return String.format("%02d:%02d", hours, minutes);
    }

    public static void main(String[] args) {
        Time time1 = new Time(6, 9);
        Time time2 = new Time(12, 18);

        System.out.println(time1);
        System.out.println(time2);
    }
}
