package hw19;

public class App {
    public static void main(String[] args) {
        Box<Fruit> box = new Box<>();
        box.addFruit(
                new Apple("Яблоко 1", 1000),
                new Apple("Яблоко 2", 500),
                new Orange("Апельсин 1", 2000),
                new Orange("Апельсин 2", 1000)
        );



        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(
                new Apple("Яблоко 1", 1000),
                new Apple("Яблоко 2", 500)

        );



        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(
                new Orange("Апельсин 1", 2000),
                new Orange("Апельсин 2", 1000)

        );


        System.out.println(box.weight());
        System.out.println(appleBox.weight());
        System.out.println(orangeBox.weight());

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox.compare(appleBox));
        System.out.println(appleBox.compare(box));

        orangeBox.pour(orangeBox);
        orangeBox.pour(box);
        appleBox.pour(box);
        System.out.println(box);

        Box<Fruit> newFruitBox = new Box<>();
        box.pour(newFruitBox);
        System.out.println(newFruitBox);
        System.out.println(box);


    }
}
