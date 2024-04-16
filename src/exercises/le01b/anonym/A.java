package exercises.le01b.anonym;

public class A {
    public static void main(String[] args) {
        new A().start();
    }
    public void start() {


//        Anonyme Klasse
//        printTable(new ComputeMethod() {
//            @Override
//            public double compute(double value) {
//                return Math.sqrt(value);
//            }
//        });
//      Lambda
        printTable(value -> Math.sqrt(value));

//        Anonyme Klasse
//        printTable(new ComputeMethod() {
//            @Override
//            public double compute(double value) {
//                return value * value;
//            }
//        });
//      Lambda
        printTable(value -> value * value);

//        Anonyme Klasse
//        printTable(new ComputeMethod() {
//            public double compute(double value) {
//                return value * 2;
//            }
//        });
//      Lambda
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