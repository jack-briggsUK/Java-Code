public class ThreeDigitCodes {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j & j != k & i != k) {
                        total++;

                        System.out.println(i + "" + j + "" + k);

                    }
                }
            }

        }
        System.out.println("the total number is: " + total);
    }

}
