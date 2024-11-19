package hw.hw5;

import java.util.Scanner;

public class Horse extends Animal{

    public Horse(String name, int speed, int stamina, int swimCost, int runCost) {
        super(name, speed, stamina, swimCost, runCost);
    }

    public void run(int distance){
        super.run(distance);
        System.out.println(" Лошадь бежит " + distance + " метров ");
        if ( stamina == -1){
            System.out.println(" Лошадь устала ");
        }
    }

    public void swim(int distance){
        super.swim(distance);
        System.out.println(" Лошадь бежит " + distance + " метров ");
        if ( stamina == -1){
            System.out.println(" Лошадь устала ");
        }
    }

    public void info(){
        super.info();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите имя лошади ");
        String name = in.nextLine();
        System.out.println(" Введите скорость лошади в м/с ");
        int speed = in.nextInt();
        System.out.println(" Введите выносливость лошади ");
        int stamina = in.nextInt();

        Horse horse = new Horse(name, speed, stamina, 4, 1);
        horse.swim(100);
        horse.run(10000);
        horse.info();
    }
}
