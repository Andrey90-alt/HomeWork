package hw.hw5;

import java.util.Scanner;

public class Cat extends Animal{


    public Cat(String name, int speed, int stamina, int swimCost, int runCost) {
        super(name, speed, stamina, swimCost, runCost);
    }

    public void run(int distance){
        super.run(distance);
        System.out.println(" Кошка бежит " + distance + " метров ");
        if ( stamina == -1){
            System.out.print(" Кошка устала ");
        }
    }

    public void swim(int distance){
        System.out.println(" Кошка не умеет плавать ");
    }

    public void info(){
        super.info();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите имя кошки ");
        String name = in.nextLine();
        System.out.println(" Введите скорость кошки в м/с ");
        int speed = in.nextInt();
        System.out.println(" Введите выносливость кошки ");
        int stamina = in.nextInt();

        Cat cat = new Cat(name, speed, stamina, 0, 1);
        cat.swim(100);
        cat.run(10000);
        cat.info();
    }
}
