public class Time {
    // class attributes
    private int hour;
    private int minute;
    private double second;

    // default constructor
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    // value constructor - allows "new Time(args);""
    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // getters
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public double getSecond() {
        return this.second;
    }

    // setters AKA mutators
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    // get time
    public String toString() {
        return String.format("%02d:%02d:%04.1f",
                this.hour, this.minute, this.second);
    }
    // As a reminder, you need to use \%d with integers and \%f with floating-point
    // numbers. The 02 option means “total width 2, with leading zeros if
    // necessary”, and the 04.1 option means “total width 4, one digit after the
    // decimal point, leading zeros if necessary”. The output is the same:
    // 11:59:59.9.

    // Time adder
    public Time add(Time t2) {
        Time sum = new Time();
        sum.hour = this.hour + t2.hour;
        sum.minute = this.minute + t2.minute;
        sum.second = this.second + t2.second;

        while (sum.second >= 60.0) {
            sum.second -= 60.0;
            sum.minute += 1;
        }

        while (sum.minute >= 60) {
            sum.minute -= 60;
            sum.hour += 1;
        }

        while (sum.hour >= 24) {
            sum.hour -= 24;
        }
        return sum;
    }

    // equals method
    public boolean equals(Time that) {
        final double DELTA = 0.001;
        return this.hour == that.hour
                && this.minute == that.minute
                && Math.abs(this.second - that.second) < DELTA;
    }
}