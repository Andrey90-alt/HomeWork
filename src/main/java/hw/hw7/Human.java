package hw.hw7;

import java.util.Scanner;

public class Human implements Move, Passability{
    private String name;
    static String currentTransport="";
    private String ground;

    @Override
    public boolean move() {
        Human human = new Human();
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите местность (лес, равнина, болото)(по умолчанию - равнина)");
        if (!human.pass(in.nextLine())){
            System.out.println(" Перемещение невозможно ");
            return false;
        }
        System.out.println(" Введите дистанцию.  ");
        int distanse = in.nextInt();
        System.out.println(" Перемещение  успешно. Пройдено  " + distanse);
        return true;
    }

    public String in(){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите транспорт в который желаете сесть (aвтомобиль, лошадь, велосипед, вездеход (по умолчанию - пешком))");
        currentTransport = in.next();
        System.out.println(" Вы сели в " + currentTransport );
        return currentTransport;
    }

    public String out(){
        System.out.println(" Вы покинули транспорт, если находитесь в нем");
        currentTransport = "";
        return currentTransport;
    }



    public void choise(){
        Human human = new Human();
        Horse horse = new Horse();
        Bicycle bicycle = new Bicycle();
        Truk truk = new Truk();
        Car car = new Car();
        Scanner in = new Scanner(System.in);
        System.out.println(" Что вы желаете сделать? (сесть(в транспорт), покинуть(транспорт), поехать (по умолчанию - пойти пешком ");
        String command = in.nextLine();
        if (command.equals("сесть")){
            currentTransport = human.in();
            human.choise();
        } else if (command.equals("покинуть")) {
            currentTransport = human.out();
            human.choise();
        }else if (command.equals("поехать") || command.isEmpty()){
            System.out.println(" Вы начинаете движение в " + currentTransport );
            if (currentTransport.isEmpty()){
               human.move();
            } else if (currentTransport.equals("aвтомобиль")){
                car.move();
            } else if (currentTransport.equals("лошадь")) {
                horse.move();

            } else if (currentTransport.equals("велосипед")) {
                bicycle.move();

            } else if (currentTransport.equals("вездеход")) {
                truk.move();
            }else {
                System.out.println(" Данный транспорт недоступен для перемещения ");
                human.choise();
            }
        } else {
            System.out.println(" команда не корректна" );
        }
    }



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Human human = new Human();


        System.out.println(" Введите имя.  ");
        human.name = in.next();
        human.choise();

    }

    @Override
    public boolean pass(String ground) {
        return true;
    }
}




/*if (currentTransport.equals("пешком")){
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

        }*/