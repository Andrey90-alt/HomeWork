package hw.hw7;

import java.util.Scanner;

public class Car extends Human implements Move, Passability{
    @Override
    public boolean move() {
        Scanner in = new Scanner(System.in);
        Car car = new Car();
        System.out.println(" Введите местность (лес, равнина, болото)(по умолчанию - равнина)");
        if (!car.pass(in.nextLine())){
            System.out.println(" Перемещение невозможно ");
            return false;
        }
        System.out.println(" Введите кол-во топлива  ");
        int energy = in.nextInt();
        System.out.println(" Введите дистанцию.  ");
        int distanse = in.nextInt();
        if (distanse<=energy){
            System.out.println(" Перемещение  успешно. Пройдено  " + distanse);
            return true;
            } else {
                System.out.println(" Топлива не хватило");
                return false;


        }
    }

    @Override
    public boolean pass(String ground) {
        if (ground.equals("болото") || ground.equals("лес")){
            return false;
        }else {
            return true;
        }
    }
}
