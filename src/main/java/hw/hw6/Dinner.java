package hw.hw6;

public class Dinner extends Plate{

    public  void eat(Cat[] Cats){
        Plate plate = new Plate();
        for (int i=0; i<Cats.length;i++){
            if (Cats[i].appetite>plate.curFood){
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
