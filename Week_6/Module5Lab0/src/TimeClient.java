public class TimeClient {
    public static void main(String[] args) {
        Time time = new Time(12, 2, 25.2);
        Time time2 = new Time();
        time2.setHour(3);
        time2.setMinute(6);
        time2.setSecond(30.3);

        String timeThree = time2.toString();
        System.out.println(timeThree); // Same result
        System.out.println(time2);

        if (time.equals(time2)) {
            System.out.println("time and time2 are equivalent");
        } else {
            System.out.println("time and time2 are not equivalent");
        }
        if (time == time2) {
            System.out.println("time and time2 are identical");
        } else {
            System.out.println("time and time2 are not identical");
        }
        Time time3 = time.add(time2);
        System.out.println(time3);
    }
}
