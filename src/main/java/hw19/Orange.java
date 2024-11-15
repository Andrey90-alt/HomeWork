package hw19;

public class Orange extends Fruit {
    private final String name;

    public Orange(String name, int weight) {
        super(weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return name + " вес = " + this.getWeight();
    }
}