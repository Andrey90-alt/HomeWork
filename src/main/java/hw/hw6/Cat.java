package hw.hw6;



import java.util.Scanner;


public class Cat extends Dinner {

    String name;
    int appetite;
    boolean starvation;

    public Cat(String name, int appetite, boolean starvation){
        this.name=name;
        this.appetite=appetite;
        this.starvation=starvation;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите объем тарелки.  ");
        Plate plate = new Plate();
        Dinner dinner = new Dinner();
        plate.maxFood = in.nextInt();

        Cat[] Cats = new Cat[10];
        Cats[0]= new Cat("A",10,true);
        Cats[1]= new Cat("B",1,true);
        Cats[2]= new Cat("C",100,true);
        Cats[3]= new Cat("D",10000,true);
        Cats[4]= new Cat("E",5,true);
        Cats[5]= new Cat("F",353,true);
        Cats[6]= new Cat("G",3535,true);
        Cats[7]= new Cat("H",6000,true);
        Cats[8]= new Cat("I",300,true);
        Cats[9]= new Cat("G",4,true);


        System.out.println(" Введите количество корма  ");
        System.out.println(" Насыпаем корм.  ");
        plate.fillFood(in.nextInt());

        System.out.println(" Котики приступают к трапезе.  ");
        dinner.eat(Cats);


    }


}
