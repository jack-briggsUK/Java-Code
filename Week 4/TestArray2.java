public class TestArray2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int element : numbers) {
            sum = sum + element;
        }
        System.out.println("The sum of all numbers is: " + sum);

        double average = (double) sum / numbers.length;

        System.out.println("The average of these is: " + average);
    }
}
