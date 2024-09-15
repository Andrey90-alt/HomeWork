package hw.hw6;

public class Plate {
    static int maxFood;
    public static int curFood;

    public static void fillFood(int moreFood){
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
