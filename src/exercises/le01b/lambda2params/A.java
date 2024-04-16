package exercises.le01b.lambda2params;

public class A {
    public static void main(String[] args) {
        new A().start();
    }

    public void start() {
        printTable((value1, value2) -> value1 * value2);
    }

    public static void printTable(ComputeMethod computeMethod) {
        System.out.println("Wertetablle ");
        double y = 2.0;
        for (double x = 0.0; x <= 5.0; x +=1) {
            y++;
            System.out.println(" " + x + " & " + y +
                    "->" + computeMethod.compute(x, y));
        }
    }
}

interface ComputeMethod {
    double compute(double value1, double value2);
}