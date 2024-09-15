package hw.hw7;

import java.util.Scanner;

public class Truk implements Move{
    @Override
    public boolean move() {
        Scanner in = new Scanner(System.in);
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
}
