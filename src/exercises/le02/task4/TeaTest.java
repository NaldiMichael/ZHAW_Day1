package exercises.le02.task4;

public class TeaTest {
    public static void main(String[] args) {
        Tea t = new Tea("Darjeeling");
        Cup<Tea> c = new Cup<>(t);
        System.out.println(c);

        Sirup s = new Sirup("Himbeer");
        Cup<Sirup> cs = new Cup<>(s);
        System.out.println(cs);
    }
}

interface Drink {
    String getFlavour();
}

class Tea implements Drink {
    private final String flavour;
    public Tea(String flavour) {
        this.flavour = flavour;
    }
    public String getFlavour() {
        return flavour + " Tea";
    }
}
 class Cup<T extends Drink> {
    private final T drink;
    public Cup(T drink) {
        this. drink = drink;
    }
    public T getContent() {
        return drink;
    }
    @Override
    public String toString() {
        return "Cup contains: " + drink.getFlavour();
    }
}

 class Sirup implements Drink {
    private final String flavour;
    public Sirup(String flavour) {
        this.flavour = flavour;
    }
    public String getFlavour() {
        return flavour + " Sirup";
    }
}