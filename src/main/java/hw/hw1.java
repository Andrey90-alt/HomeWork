package hw;


public class hw1 {
    public static void main(String[] args) {
        greetings();
        checkSign(0,0,0);
        selectColor(11);
        compareNumbers(1,2);
        addOrSubtractAndPrint(1,2,false);
    }
    static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    static void checkSign(int a, int b, int c){
        if (a+b+c>=0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void selectColor(int data){
        if (data<=10){
            System.out.println("Красный");
        } else if (data<=20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    static void compareNumbers(int a, int b){
        if (a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
    static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (!increment){
            int result = initValue + delta;
            System.out.println(result);
        }else {
            int result = initValue - delta;
            System.out.println(result);
        }
    }
}


