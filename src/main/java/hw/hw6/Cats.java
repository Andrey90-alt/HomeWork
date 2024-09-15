package hw.hw6;



import java.util.Scanner;


public class Cats extends Plate {
    private static hw.hw6.Cats[] Cats;

    String name;
    int appetite;
    boolean starvation;

    public Cats(String name, int appetite, boolean starvation){
        this.name=name;
        this.appetite=appetite;
        this.starvation=starvation;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите объем тарелки.  ");
        maxFood= in.nextInt();

        Cats [] Cats = new Cats[10];
        Cats[0]= new Cats("A",10,true);
        Cats[1]= new Cats("B",1,true);
        Cats[2]= new Cats("C",100,true);
        Cats[3]= new Cats("D",10000,true);
        Cats[4]= new Cats("E",5,true);
        Cats[5]= new Cats("F",353,true);
        Cats[6]= new Cats("G",3535,true);
        Cats[7]= new Cats("H",6000,true);
        Cats[8]= new Cats("I",300,true);
        Cats[9]= new Cats("G",4,true);


        System.out.println(" Введите количество корма  ");
        System.out.println(" Насыпаем корм.  ");
        fillFood(in.nextInt());

        System.out.println(" Котики приступают к трапезе.  ");

        for (int i=0; i<Cats.length;i++){
            if (Cats[i].appetite>curFood){
                Cats[i].starvation=false;
            }
            if (!Cats[i].starvation){
                System.out.println(" Котик " + Cats[i].name + " голоден");
            }else {
                System.out.println(" Котик " + Cats[i].name + " сыт");
            }
        }

    }


}
