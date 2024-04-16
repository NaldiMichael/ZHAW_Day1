package exercises.le02.cup;

public class Sirup implements Drink{
    private final String flavour;

    public Sirup(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour + " Sirup";
    }
}
