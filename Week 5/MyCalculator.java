import java.util.Scanner;

public class MyCalculator {
    static int add(int x, int y) {
        int out = x + y;
        return out;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static int divide(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("And the second:");
        int num2 = Integer.parseInt(reader.nextLine());

        System.out.println(num1 + " plus " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " subtract " + num2 + " = " + subtract(num1, num2));
        System.out.println(num1 + " multiply " + num2 + " = " + multiply(num1, num2));
        System.out.println(num1 + " divide " + num2 + " = " + divide(num1, num2));

        reader.close();

    }
}
