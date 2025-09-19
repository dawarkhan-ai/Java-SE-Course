package packages.problems.utilitySetDemo.util;

public class MathUtils {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int factorial(int n) {
        int fact = 1;
        for(int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}
