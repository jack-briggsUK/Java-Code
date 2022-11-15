import java.util.Scanner;

public class MinMaxMethods {
    // returns the minimum Int
    public static int minimum(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y < z) {
            return y;
        } else {
            return z;
        }
    }

    // returns the maximum Int
    public static int maximum(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    // return the minimum Double
    public static double minimum(double x, double y, double z) {
        if (x < y && x < z) {
            return x;
        } else if (y < z) {
            return y;
        } else {
            return z;
        }
    }

    // return the maximum Double
    public static double maximum(double x, double y, double z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    // MAIN collect input as float
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        System.out.println("Enter first number:");
        num1 = Double.parseDouble(scan.nextLine());
        System.out.println("And the second:");
        num2 = Double.parseDouble(scan.nextLine());
        System.out.println("And the final number:");
        num3 = Double.parseDouble(scan.nextLine());

        // run if against inputs, if all int run int method

        if ((num1 % 1) == 0 && (num2 % 1) == 0 && (num3 % 1) == 0) {
            int Inum1 = (int) num1;
            int Inum2 = (int) num2;
            int Inum3 = (int) num3;

            System.out.println("The min value is: " + minimum(Inum1, Inum2, Inum3));
            System.out.println("The max value is: " + maximum(Inum1, Inum2, Inum3));

        } else {
            System.out.println("The min value is: " + minimum(num1, num2, num3));
            System.out.println("The max value is: " + maximum(num1, num2, num3));
        }
    }
}
