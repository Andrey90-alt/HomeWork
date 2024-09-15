package hw.hw7;

import java.util.Scanner;

public class Horse implements Move{
    @Override
    public boolean move() {
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите кол-во энергии  ");
        int energy = in.nextInt();
        System.out.println(" Введите дистанцию.  ");
        int distanse = in.nextInt();
        if (distanse<=energy){
            System.out.println(" Перемещение  успешно. Пройдено  " + distanse);
            return true;
        } else {
            System.out.println(" Энергии не хватило");
            return false;


        }
    }
}
