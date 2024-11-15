package hw19;

public class Apple extends Fruit {
    private final String name;

    public Apple(String name, int weight) {
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
