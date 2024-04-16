package exercises.le02.cup;

public class Cup {
    private final Drink drink;

    public Cup(Drink drink) {
        this.drink = drink;
    }

    public Drink getContent() {
        return drink;
    }

    public String toString() {
        return "Cup contains: " + drink.getFlavour();
    }
}
