package hw.hw5;

public class Animal {

    String name;
    int speed;
    int stamina;
    int swimCost;
    int runCost;

    public Animal(String name, int speed, int stamina, int swimCost, int runCost) {
        this.name = name;
        this.speed = speed;
        this.stamina = stamina;
        this.swimCost = swimCost;
        this.runCost=runCost;

    }

    public void run(int distance){
        int time = distance / speed;
        stamina = stamina - (distance * runCost);
        if (stamina <= -1) {
            stamina =-1;
        }
    }

    public  void swim(int distance){
        int time = distance / speed;
        stamina = stamina - (distance * swimCost);
        if (stamina <= -1) {
            stamina =-1;
        }
    }

    public void info(){
        String tired = "";
        if (stamina<=-1){
            tired = "устала";
        }
        System.out.println(name + " выносливость " + stamina + " " + tired);
    }


}
