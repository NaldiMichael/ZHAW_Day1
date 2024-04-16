package exercises.le01b.lambda;

public class A {
    public static void main(String[] args) {
        new A().start();
    }
    public void start() {
        printTable(value -> Math.sqrt(value));
        printTable(value -> value * value);
        printTable(value -> value * 2);
    }

    public static void printTable(ComputeMethod computeMethod) {
        System.out.println("Wertetabelle ");
        for (double x = 0.0; x <= 5.0; x += 1) {
            System.out.println(" " + x +
                    "->" + computeMethod.compute(x));
        }
    }
}
interface ComputeMethod {
    double compute(double value);
}