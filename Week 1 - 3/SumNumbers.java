import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Input a number to Square:");
        int sumTotal = reader.nextInt();
        System.out.println("How many times?");
        int sumTo = reader.nextInt();
        int i = 1;

        while (i < (sumTo + 1)) {
            sumTotal = sumTotal * sumTotal;
            i ++;
        }
        System.out.println(sumTotal);



        reader.close();
    }
}
