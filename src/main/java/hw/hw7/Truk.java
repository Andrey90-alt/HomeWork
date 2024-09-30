package hw.hw7;

import java.util.Scanner;

public class Truk extends Human implements Move, Passability{
    @Override
    public boolean move() {
        Scanner in = new Scanner(System.in);
        Truk truk = new Truk();
        System.out.println(" Введите местность (лес, равнина, болото)(по умолчанию - равнина)");
        if (!truk.pass(in.nextLine())){
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
        return true;
    }
}
