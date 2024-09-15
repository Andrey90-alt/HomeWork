package hw.hw7;

import java.util.Scanner;

public class Bicycle implements Move{
    @Override
    public boolean move() {
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите дистанцию.  ");
        int distanse = in.nextInt();
        System.out.println(" Перемещение  успешно. Пройдено  " + distanse);
        return true;
    }
}
