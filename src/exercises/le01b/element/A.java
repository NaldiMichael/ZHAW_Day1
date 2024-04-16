package exercises.le01b.element;

public class A {
    public static void main(String[] args) {
// Variante 1:
//        A a = new A();
//        printTable(a.new SqrtComputeMethod());
//        printTable((a.new SquareComputeMethod()));
//        printTable((a.new AddComputeMethod()));
// Variante 2
        new A().start();
    }

    public void start() {
        printTable(this.new SqrtComputeMethod());
        printTable(this.new SquareComputeMethod());
        printTable(this.new AddComputeMethod());
    }

    public static void printTable(ComputeMethod computeMethod) {
        System.out.println("Wertetabelle ");
        for (double x = 0.0; x <= 5.0; x += 1) {
            System.out.println(" " + x +
                    "->" + computeMethod.compute(x));
        }
    }
    interface ComputeMethod {
        double compute(double value);
    }
    class SqrtComputeMethod implements ComputeMethod {
        @Override
        public double compute(double value) {
            return Math.sqrt(value);
        }
    }
    class SquareComputeMethod implements ComputeMethod {
        @Override
        public double compute(double value) {
            return value * value;
        }
    }

    class AddComputeMethod implements ComputeMethod {
        public double compute(double value) {
            return value * 2;
        }
    }
}

