package OOPs;

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(2.0f, 0.1f));
        System.out.println(calc.sum(2, 0));

    }

}

/**
 * InnerMethodOverloading
 */
class Calculator {
    // sum adding two integer
    int sum(int a, int b) {
        System.out.println("Inside int sum function");
        return a + b;
    }

    float sum(float a, float b) {
        System.out.println("Inside float sum function");
        return a + b;
    }

}
