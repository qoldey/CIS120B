public class DateClient {
    public static void main(String[] args) throws Exception {

        Date today = new Date(29, 2, 2000); // last day of february on a leapyear
        // Date wedding = new Date(30, 2, 2019);
        // This would throw "IllegalArgumentException: February has 28 days!"

        boolean checkLeapYear = Date.isLeapYear(today.year);
        System.out.println(checkLeapYear); // true, we are in a leapYear

        int[] leapyears = Date.listLeapYears(1956, 2020, true); // get leapyears from lower to upper & print

        System.out.println(today); // toString as day:month:year

        Date tomorrow = new Date(today.day + 1, today.month + 1, today.year);// tomorrow

        System.out.println(tomorrow.equals(today)); // false, today != tomorrow

    }

}
