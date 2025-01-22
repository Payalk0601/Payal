public class SumOfIntegers {
    public static void main(String[] args) {
        // Initialize variables
        int total = 0;
        int i = 1;

        // Use a while loop to sum integers from 1 to 100
        while (i <= 100) {
            total += i;
            i++;
        }

        // Print the result
        System.out.println("The sum of integers from 1 to 100 is: " + total);
    }
}