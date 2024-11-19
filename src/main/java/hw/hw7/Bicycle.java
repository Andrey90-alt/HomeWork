package hw.hw7;

import java.util.Scanner;

public class Bicycle extends Human implements Move, Passability{
    @Override
    public boolean move() {
        Bicycle bicycle = new Bicycle();
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите местность (лес, равнина, болото)(по умолчанию - равнина)");
        if (!bicycle.pass(in.nextLine())){
            System.out.println(" Перемещение невозможно ");
            return false;
        }
        System.out.println(" Введите дистанцию.  ");
        int distanse = in.nextInt();
        System.out.println(" Перемещение  успешно. Пройдено  " + distanse);
        return true;
    }

    @Override
    public boolean pass(String ground) {
        if (ground.equals("болото")){
        return false;
    }else {
            return true;
        }
    }
}
