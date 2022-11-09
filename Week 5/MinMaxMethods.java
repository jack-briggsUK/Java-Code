import java.util.Scanner;

public class MinMaxMethods {
    //returns the minimum Int
    public static int minimum(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y < z) {
            return y;
        } else {
            return z;
        }
    }
//returns the maximum Int
    public static int maximum(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }
//return the minimum Double
    public static double minimum(double x, double y, double z) {
        if (x < y && x < z) {
            return x;
        } else if (y < z) {
            return y;
        } else {
            return z;
        }
    }
//return the maximum Double
    public static double maximum(double x, double y, double z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }
//prints the min and max Int
    public static void intMethod(int num1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("And the second:");
        int num2 = Integer.parseInt(scan.nextLine());
        System.out.println("And the final number:");
        int num3 = Integer.parseInt(scan.nextLine());

        System.out.println("The min value is: " + minimum(num1, num2, num3));
        System.out.println("The max value is: " + maximum(num1, num2, num3));
        scan.close();
    }
//prints the min and max Double
    public static void doubleMethod(Double num1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("And the second:");
        double num2 = Double.parseDouble(scan.nextLine());
        System.out.println("And the final number:");
        double num3 = Double.parseDouble(scan.nextLine());

        System.out.println("The min value is: " + minimum(num1, num2, num3));
        System.out.println("The max value is: " + maximum(num1, num2, num3));
        scan.close();
    }

    //MAIN determins if Int or Double
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        if (scan.hasNextInt()) {
            intMethod(scan.nextInt());
        } else if (scan.hasNextDouble()) {
            doubleMethod(scan.nextDouble());
        }
        scan.close();
    }
}
