package hw;

public class Plate extends App {
    int maxFood;
    int curFood;




    public void fillFood(int moreFood){
        curFood += moreFood;
        if (curFood>maxFood){
            curFood=maxFood;
            System.out.println(" Корм перевалил через край ");
        }
    }

    public boolean  unFillFood(int lessFood){
        curFood -= lessFood;
        return curFood >= 0;
    }




}