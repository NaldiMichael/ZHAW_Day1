package exercises.le01b.geschachtelt;

public class A {
    public static void main(String[] args) {
        printTable(new SqrtComputeMethod());
        printTable(new SquareComputeMethod());
        printTable((new AddComputeMethod()));
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
    static class SqrtComputeMethod implements ComputeMethod {
        @Override
        public double compute(double value) {
            return Math.sqrt(value);
        }
    }
    static class SquareComputeMethod implements ComputeMethod {
        @Override
        public double compute(double value) {
            return value * value;
        }
    }

    static class AddComputeMethod implements ComputeMethod {
        public double compute(double value) {
            return value * 2;
        }
    }
}

