public class FibonacciCalc {
//     static void Fibonacci(int x) {
//         double[] num = new double[x];

//         num[0] = 0;
//         num[1] = 1;
//         System.out.println(num[0]);
//         System.out.println(num[1]);

//         for (int i = 2; i < num.length; i++) {
//             int j = i - 2;
//             int k = i - 1;
//             num[i] = num[j] + num[k];

//             System.out.println(num[i]);
//         }
//     }

//     public static void main(String[] args) {
//         Fibonacci(100);
//     }
public static long Fibonacci(int n) {
    if (n == 0) {
        return 0;
    }
    if (n == 1 || n == 2) {
        return 1;
    }
    return Fibonacci(n - 2) + Fibonacci(n - 1);
}

public static void main(String[] args) {
    int max = 100;
    System.out.print("Fibonacci Series of " + max + " numbers: ");
    for (int i = 0; i < max; i++) {
        System.out.print(Fibonacci(i) + " ");
    }

}

}
