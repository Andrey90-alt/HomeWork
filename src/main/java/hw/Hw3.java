package hw;

import java.util.Arrays;

public class Hw3 {
    public static void main(String[] args) {
        sumOfPositiveElements(new int[][]{{1, 2, -100}, {1, -100, -100}});
        intSize(new int[5]);
        zeroDiag(new int[][]{{1, 2, 3}, {1, 2, 3}});
        findMax(new int[][]{{-100, 8, 6}, {100, 2, 299}});
        secondRow(new int[][]{{-100, 8, 6}, {-8,2}});
    }

    static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum = sum + arr[i][j];
                }

            }
        }
        System.out.println(sum);
        return sum;
    }

    static void intSize(int size[]) {
        String n = " ".repeat(size.length + size.length + size.length - 4);
        for (int i = 0; i < size.length; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        for (int i = 0; i < size.length - 2; i++) {
            System.out.println("*" + n + "*");
        }
        for (int i = 0; i < size.length; i++) {
            System.out.print("*  ");
        }

    }

    static int[][] zeroDiag(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j && arr[i][j] != 0) {
                    arr[i][j] = 0;

                }
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(arr));
        return arr;

    }

    static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }


        }
        System.out.println(max);
        return max;
    }

    static int secondRow(int[][] arr) {
        int sum = 0;
        for (int i = 1; i == 1; i++) {
            if(arr[i].length == 0){
                sum=-1;
                return sum;

            }
            if(arr[i].length != arr[0].length){

                System.out.println("Введите корректные значения. Строки должны совпадать");
                return sum;
            }
            for (int j = 0; j <= 2; j++) {


                sum += arr[i][j];
            }
            if(arr[i].length != 0){
                System.out.println(sum);
                return sum;

        }

    }

        return sum;
    }}

