package exercises.le01b.anonym2param;

public class A {
    public static void main(String[] args) {
        new A().start();
    }

    public void start() {
//        Anonyme Klasse
//        printTable(new ComputeMethod() {
//            @java.lang.Override
//            public double compute(double value1, double value2) {
//                return value1 * value2;
//            }
//        });
//      Lambda
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