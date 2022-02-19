import java.util.ArrayList;
import java.util.List;

public class Date {
    // a class named Date that represents a date with integer values for day, month
    // and year.
    int day, month, year;

    // A value constructor (but not a default constructor)
    public Date(int day, int month, int year) {
        checkValidDate(day, month, year);// if not valid date, will throw error;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean checkValidDate(int day, int month, int year) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be 1-31");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be 1-12");
        }

        if (isLeapYear(year) && month == 2 && day > 29) {
            throw new IllegalArgumentException("February has 29 days! (It's a leapyear)");
        }
        if ((!(isLeapYear(year))) && month == 2 && day > 28) {
            throw new IllegalArgumentException("February has 28 days!");
        }
        if (month == 4 && day > 30) {
            throw new IllegalArgumentException("April has 30 days!");
        }

        if (month == 6 && day > 30) {
            throw new IllegalArgumentException("June has 30 days!");
        }
        if (month == 9 && day > 30) {
            throw new IllegalArgumentException("September has 30 days!");
        }
        if (month == 11 && day > 30) {
            throw new IllegalArgumentException("November has 30 days!");
        }
        return true;
    }

    // checks if given year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (!(year % 100 == 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // returns int[] of all leapYears from lower to upper with option to print
    public static int[] listLeapYears(int lower, int upper, boolean print) {
        List<Integer> years = new ArrayList<Integer>();
        if (print) {
            System.out.println();
        }
        for (int i = lower; i < upper; i++) {
            if (Date.isLeapYear(i)) {
                years.add(i);
                if (print) {
                    System.out.print(i + " ");
                }
            }
        }
        if (print) {
            System.out.println();
        }
        return listToArray(years);
    }

    // converts List<Integer> to int[]
    public static int[] listToArray(List<Integer> list) {
        int[] yearArray = new int[list.size()];
        int n = 0;
        for (int i : list) {
            yearArray[n] = i;
            n++;
        }
        return yearArray;
        // years.toArray(); how to make work?
    }

    // Accessors ('getters') and Mutators ('setters')
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // The toString and equals methods

    public String toString() {
        return String.format("%02d:%02d:%04d", this.day, this.month, this.year);
    }

    public boolean equals(Date that) {
        return this.year == that.year
                && this.month == that.month
                && this.day == that.day;
    }
}
