package inheritance.theoryImplementation.overloadingVsOverriding;


public class MethodOverloadingExampleUsingCalculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExampleUsingCalculator calc = new MethodOverloadingExampleUsingCalculator();
        System.out.println(calc.add(5,10));
        System.out.println(calc.add(5.89,10.45));

    }
}
