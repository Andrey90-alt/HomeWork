package hw.hw8;

public class Hw8 {


    public int sumArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {

        Hw8 hw8 = new Hw8();

        String[][] arr = new String[][]{{"10", "11", "2", "1"}, {"8", "25", "1", "67"}, {"100", "9", "8", "4"}, {"1", "1", "1", "1"}};
        try {
            try {
                int result = hw8.sumArr(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Был превышен размер массива");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Найдена ошибка в ячейке");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }




}

