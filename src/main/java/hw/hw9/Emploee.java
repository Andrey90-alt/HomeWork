package hw.hw9;

import java.util.ArrayList;

public class Emploee {
    String name;
    int age;

    public Emploee (String name, int age){
        this.name = name;
        this.age = age;
    }


    public ArrayList<String> emploeeNames(ArrayList<Emploee> emploees){
        ArrayList<String> emploeesNames = new ArrayList<>();
        for (int i = 0; i < emploees.size(); i++) {
            emploeesNames.add(emploees.get(i).name);
            System.out.print(emploees.get(i).name);
        }
        return emploeesNames;

    }

    public ArrayList<Emploee> minAges(ArrayList<Emploee> emploees, int min){
        Emploee emploee = new Emploee("a",1);
        ArrayList<Emploee> minAges = new ArrayList<>();
        for (int i = 0; i < emploees.size(); i++) {
            if (emploees.get(i).age>=min){
                minAges.add(emploees.get(i));
            }
        }
        System.out.println();
        emploee.emploeeNames(minAges);
        return minAges;

    }

    public void medEmploee(ArrayList<Emploee> emploees, int min){
        Emploee emploee = new Emploee("a",1);
        int sum = 0;
        for (int i = 0; i < emploees.size(); i++) {
            sum = (sum + emploees.get(i).age);
        }
        int med = sum/emploees.size();
        if (min<med){
            System.out.println();
            System.out.println("Превышает");
        } else {
            System.out.println();
            System.out.println("Не превышает");
        }


    }

    public Emploee linkOnEmploee(ArrayList<Emploee> emploees) {
        Emploee emploee = emploees.get(0);
        int minAge = emploees.get(0).age;
        for (int i = 0; i < emploees.size(); i++) {
            if (minAge > emploees.get(i).age) {
                minAge = emploees.get(i).age;
                emploee = emploees.get(i);

            }
        }
        System.out.println(emploee.name);
        return emploee;
    }

        public static void main (String[]args){

            Emploee emploee = new Emploee("a", 1);
            ArrayList<Emploee> emploees = new ArrayList<Emploee>();

            Emploee a = new Emploee("A", 29);
            Emploee b = new Emploee("B", 29);
            Emploee c = new Emploee("C", 28);
            Emploee d = new Emploee("D", 27);
            Emploee e = new Emploee("E", 26);

            emploees.add(a);
            emploees.add(b);
            emploees.add(c);
            emploees.add(d);
            emploees.add(e);

            emploee.linkOnEmploee(emploees);
            emploee.emploeeNames(emploees);
            emploee.medEmploee(emploees, 20);
            emploee.minAges(emploees, 27);




        }
    }