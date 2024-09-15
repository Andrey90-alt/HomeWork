package hw.hw5;

import java.util.Scanner;

public class Dog extends Animal{

    public Dog(String name, int speed, int stamina, int swimCost, int runCost) {
        super(name, speed, stamina, swimCost, runCost);
    }

    public void run(int distance){
        super.run(distance);
        System.out.println(" Собака бежит " + distance + " метров ");
        if ( stamina == -1){
            System.out.print(" Собака устала ");
        }
    }

    public void swim(int distance){
        super.swim(distance);
        System.out.println(" Собака плывет " + distance + " метров ");
        if ( stamina == -1){
            System.out.println(" Собака устала ");
        }
    }

    public void info(){
        super.info();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите имя собаки ");
        String name = in.nextLine();
        System.out.println(" Введите скорость собаки в м/с ");
        int speed = in.nextInt();
        System.out.println(" Введите выносливость собаки ");
        int stamina = in.nextInt();

        Dog dog = new Dog(name, speed, stamina, 2, 1);
        dog.swim(100);
        dog.run(10000);
        dog.info();
    }
}
