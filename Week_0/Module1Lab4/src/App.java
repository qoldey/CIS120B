//Module 1 Lab 4
public class App {
    public static void main(String[] args) {
        int[] inArray = { 1, 2, 7, 6, 2, 8, 4, 5, 6, 1, 10 };
        int lowIndex = 2;
        int highIndex = 5;

        int max = maxInRange(inArray, lowIndex, highIndex);
        System.out.println(max);

        int maxnum = max(inArray);
        System.out.println(maxnum);

    }

    private static int maxInRange(int[] inArray, int lowIndex, int highIndex) {

        if (lowIndex < 0 || highIndex > inArray.length) {
            throw new IllegalArgumentException("indices must fit within array.");
        }

        // if lowIndex == highIndex,the sole element in the range must be the maximum.
        // So that’s the base case.
        if (lowIndex == highIndex) {
            return inArray[highIndex]; // if 1 pos, return it
        } else {
            // break the array into two pieces, find the maximum in each of the pieces, and
            // then find the maximum of the maxima.
            return Math.max(inArray[lowIndex], maxInRange(inArray, lowIndex + 1, highIndex));
            // else compare array[low] and array[low+1]
        }
    }

    // a method called max that takes an array and uses maxInRange to find and
    // return the largest element.
    private static int max(int[] inArray) {
        return maxInRange(inArray, 0, inArray.length - 1);
    }
}
