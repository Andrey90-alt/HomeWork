package hw;

import java.util.Scanner;
public class Cat extends App{
    private Cat cat;
    private String name;
    private int appetite;
    private boolean starvation;

    public Cat(String name, int appetite, boolean starvation){
        this.name=name;
        this.appetite=appetite;
        this.starvation=starvation;
    }



    public  void eat(Cat[] Cats){
        Plate plate = new Plate();
        for (int i=0; i<Cats.length;i++){
            if (Cats[i].appetite>plate.curFood){
                Cats[i].starvation=false;
            }
            if (!Cats[i].starvation){
                System.out.println(" Котик " + Cats[i].name + " голоден");
            }else {
                System.out.println(" Котик " + Cats[i].name + " сыт");
            }
        }
    }


}