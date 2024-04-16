package exercises.le02.cup;

public class Main {
    public static void main(String[] args) {
        Tea t = new Tea("Darjeeling");
        Cup c = new Cup(t);
        System.out.println(c);

        Sirup s = new Sirup("Himbeere");
        Cup c2 = new Cup(s);
        System.out.println(c2);
    }
}
