package hw.hw7;

import java.util.Scanner;

public class Human {
    static String name;
    static String currentTransport;
    static String ground;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите имя.  ");
        name = in.nextLine();
        System.out.println(" Введите транспорт (aвтомобиль, лошадь, велосипед, вездеход, пешком(по умолчанию))");
        currentTransport = in.nextLine();
        System.out.println(" Введите местность (лес, равнина, болото)");
        ground = in.nextLine();
        if (currentTransport.equals("пешком")){
            Move move = new Foot();
            boolean result = move.move();
            System.out.println(result);
            System.out.println(name + " Завершил перемещение");
        }
        if (currentTransport.equals("aвтомобиль")){
            if (ground.equals("лес") || ground=="болото" ) {
                System.out.println("По местности " + ground + " перемещение невозможно");
                boolean result = false;
                System.out.println(result);
                }  else if (ground=="равнина") {
                    Move move = new Car();
                    boolean result = move.move();
                    System.out.println(result);
            }
                System.out.println(name + " Завершил перемещение");

            } else if (currentTransport.equals("лошадь")) {
            if (ground=="болото" ) {
                System.out.println("По местности " + ground + " перемещение невозможно");
                boolean result = false;
                System.out.println(result);
            }  else if (ground=="равнина" | ground=="лес") {
                Move move = new Horse();
                boolean result = move.move();
                System.out.println(result);
            }
            System.out.println(name + " Завершил перемещение");


        }else if (currentTransport.equals("велосипед")){
            if (ground=="болото" ) {
                System.out.println("По местности " + ground + " перемещение невозможно");
                boolean result = false;
                System.out.println(result);
            }  else if (ground=="равнина" | ground=="лес") {
                Move move = new Bicycle();
                boolean result = move.move();
                System.out.println(result);
            }
            System.out.println(name + " Завершил перемещение");

        } else if (currentTransport.equals("вездеход")) {
            Move move = new Truk();
            boolean result = move.move();
            System.out.println(result);
            System.out.println(name + " Завершил перемещение");

        }

    }
}




