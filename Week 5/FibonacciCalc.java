public class FibonacciCalc {
    static void Fibonacci() {
        long[] num = new long[100];

        num[0] = 0;
        num[1] = 1;
        System.out.println(num[0]);
        System.out.println(num[1]);

        for (int i = 2; i < num.length; i++) {
            int j = i - 2;
            int k = i - 1;
            num[i] = num[j] + num[k];

            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        Fibonacci();
    }
}
