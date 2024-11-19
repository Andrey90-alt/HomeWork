package hw;

import java.util.Arrays;

public class Hw2 {
    public static void main(String[] args){
        printMess(5, "1");
        sumFive(new int[]{1, 5, 6, 8});
        fillMass(new int[10], 5);
        incMass(new int[]{1, 5, 6, 8},5);
        wPart(new int[]{1, 15, 8, 8});
    }
    static void printMess(int b, String a ){
        for (int i=0; i<b; i++){
            System.out.println(a);
        }
    }
    static void sumFive(int[] values){
        int sum = 0;
        for (int i=0; i<values.length;i++){
            if(values[i]>5){
                sum = sum + values[i];
            }
        }
        System.out.println(sum);
    }
    static void fillMass(int[] values, int a){
        for (int i=0; i<values.length;i++) {
            values[i] = a;
        }
        System.out.println(Arrays.toString(values));
    }
    static void incMass(int[] values, int a){
        for (int i=0; i<values.length;i++){
            values[i] = a + values[i] ;
        }
        System.out.println(Arrays.toString(values));
    }
    static void wPart(int[] values){
        int[] firstHalf = Arrays.copyOfRange(values, 0, values.length/2);
        int[] secondHalf = Arrays.copyOfRange(values, values.length/2, values.length);
        int firstSum = 0;
        int secondSum = 0;
        for (int i=0; i<firstHalf.length;i++){
            firstSum = firstSum + firstHalf[i];
        }
        for (int i=0; i<secondHalf.length;i++){
            secondSum = secondSum + secondHalf[i];
        }
        if (firstSum>secondSum){
            System.out.println("Первая сумма больше");
        } else if (firstSum<secondSum) {
            System.out.println("Вторая сумма больше");
        } else {
            System.out.println("Суммы равны");
        }
    }
}

