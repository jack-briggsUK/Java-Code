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

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.println(i + ": " + fibo(i));
        }
    }
    public static long fibo(long i) {
        if (i <= 1) {
            return i;
        }
        return fibo(i - 1) + fibo(i - 2);
    }
}
