package exercises.le02.cup;

public class Tea implements Drink{
    private final String flavour;

    public Tea(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour + " Tea";
    }
}
