import java.util.Scanner;

public class MinMaxMethods {
    public static int minimum(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y < z) {
            return y;
        } else {
            return z;
        }
    }

    public static int maximum(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static double minimum(double x, double y, double z) {
        if (x < y && x < z) {
            return x;
        } else if (y < z) {
            return y;
        } else {
            return z;
        }
    }

    public static double maximum(double x, double y, double z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static void intMethod(int num1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("And the second:");
        int num2 = Integer.parseInt(scan.nextLine());
        System.out.println("And the final number:");
        int num3 = Integer.parseInt(scan.nextLine());

        System.out.println("The min value is: " + minimum(num1, num2, num3));
        System.out.println("The max value is: " + maximum(num1, num2, num3));
    }

    public static void doubleMethod(Double num1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("And the second:");
        double num2 = Double.parseDouble(scan.nextLine());
        System.out.println("And the final number:");
        double num3 = Double.parseDouble(scan.nextLine());

        System.out.println("The min value is: " + minimum(num1, num2, num3));
        System.out.println("The max value is: " + maximum(num1, num2, num3));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        if (scan.hasNextInt()) {
            intMethod(scan.nextInt());
        } else if (scan.hasNextDouble()) {
            doubleMethod(scan.nextDouble());
        }
    }
}
