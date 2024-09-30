package hw.hw4;


import java.util.Scanner;

public class Box {
    private int size;
    private String color;
    private boolean capStatus = false;
    private String thingInside;

    public void newBox() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер коробки: ");
        size = in.nextInt();
        System.out.print("Введите цвет коробки: ");
        color = in.next();
        System.out.println("Добавлена коробка размера " + size + " цвета " + color);
        System.out.println("Сейчас коробка закрыта ");
    }

    public void open(){
        if (capStatus){
            System.out.print("Сейчас коробка открыта ");
        } else {
            capStatus = true;
        }
    }

    public void close(){
        if (!capStatus){
            System.out.print("Сейчас коробка закрыта ");
        } else {
            capStatus = false;
        }
    }

    public void put(){
        if (!capStatus){
            System.out.print("Сейчас коробка закрыта ");
        } else {
        Scanner in = new Scanner(System.in);
        System.out.print("Что вы хотите положить в коробку?");
        thingInside = in.nextLine();
        System.out.print("Вы положили " + thingInside + " в коробку");
        }

    }

    public void info(){
        System.out.print("Коробка размера " + size + " цвета " + color + " внутри лежит " + thingInside);
    }

    public void reColor(){
        Scanner in = new Scanner(System.in);
        System.out.print("В какой цвет вы хотите перекрасить коробку? ");
        color = in.next();
        System.out.print("Теперь коробка имеет цвет: " + color);
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Box box = new Box();
        box.newBox();
        System.out.print("Что вы хотите сделать с коробкой?(открыть, закрыть, положить(предмет внутрь), перекрасить, инфо)");
        String comand = in.nextLine();
        if (comand.equals("открыть")){
            box.open();
        } else if (comand.equals("закрыть")) {
            box.close();
        }else if (comand.equals("положить")){
            box.put();
        } else if (comand.equals("перекрасить")){
            box.reColor();
        } else if (comand.equals("инфо")){
            box.info();
        }else {
            System.out.print("Такой команды нет");
        }
    }

}
