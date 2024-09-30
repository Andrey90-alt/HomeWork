package hw.hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class Main {

    public ArrayList<Integer> minMax(int min, int max){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            int add = min + i;
            list.add(add);
        }
        return list;
    }
    public int sumFive(int[] arrayPrim){

        Integer[] array = Arrays.stream(arrayPrim)
                .boxed()
                .toArray(Integer[]::new);
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));

        int sum = 0;
        for (int i =0; i < list.size(); i++ ){
            if (list.get(i) >5){
                sum =sum + list.get(i);

            }

        }

        return sum;
    }

    public void reWrite(int num, LinkedList<Integer> arrayList){
        for (int i =0; i < arrayList.size(); i++ ){
            if (arrayList.get(i) != null) {
                arrayList.set(i, num);
            }
        }


    }

    public void plus(int num, LinkedList<Integer> arrayList){

        for (int i =0; i < arrayList.size(); i++ ){
            if (arrayList.get(i) != null) {
                arrayList.set(i, arrayList.get(i) + num) ;
            }
        }
    }

    public static void main(String[] args){
        Main main = new Main();
        ArrayList<Integer> minMax = main.minMax(1, 10);
        System.out.println(minMax);
        int sumFive;
        sumFive = main.sumFive(new int[]{1, 3, 5, 6, 6});
        System.out.println(sumFive);

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,1,4,5));
        main.reWrite(1,list);
        System.out.println(list.get(3));
        main.plus(1,list);
        System.out.println(list.get(3));


    }
}
