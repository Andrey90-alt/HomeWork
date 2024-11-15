package hw19;

import java.util.*;

import static java.util.Collections.*;

public class Box<T extends Fruit> {
    private final List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }



    @SafeVarargs
    public final void addFruit(T... fruits) {
        Objects.requireNonNull(fruits, "Добавляемые фрукты должны существовать");
        if (fruits.length == 0) {
            return;
        }
        this.fruits.addAll(List.of(fruits));
    }

    public int weight() {
        if (fruits.isEmpty()) {
            return 0;
        }
        int tempWeight = 0;
        for (T fruit : fruits) {
            tempWeight += fruit.getWeight();
        }
        return tempWeight;
    }

    public boolean compare(Box<?> box) {
        Objects.requireNonNull(box, "Коробка должна существовать ");
        if (box == this) {
            return true;
        }
        boolean b = Math.abs(this.weight() - box.weight()) < 1e-6;
        return b;
    }

    public void pour(Box<? super T> box) {
        Objects.requireNonNull(box, "Коробка должна существовать");
        if (box == this) {
            System.out.println("Необходимо пересыпать в другую коробку");
            return;
        }else if (box.fruits.isEmpty()) {
            reverse(this.fruits);
        }
        box.fruits.addAll(0, this.fruits);
        this.fruits.clear();
    }

    public List<T> getFruit() {
        return fruits;
    }


    public String toString() {
        return this.getFruit().toString();
    }
}
