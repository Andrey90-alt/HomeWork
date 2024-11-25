package hw;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class App {

    public static Integer @NotNull [] delEdgeOfArray(@NotNull Integer[] array) {
        int indexOfLastDigitOne = getLastIndex(array, 1);
        if (indexOfLastDigitOne == -1) {
            throw new RuntimeException();
        }
        return Arrays.copyOfRange(array, indexOfLastDigitOne + 1, array.length);
    }

    @Contract(pure = true)
    public static boolean isOnlyDigitOneAndTwo(@NotNull Integer @NotNull [] array) {
        if (array.length == 0) {
            return false;
        }
        boolean isExistDigitOne = false;
        boolean isExistDigitTwo = false;
        for (Integer item : array) {
            switch (item) {
                case 1: isExistDigitOne = true;
                    break;
                case 2: isExistDigitTwo = true;
                    break;
                default: return false;
            }
        }
        return isExistDigitOne && isExistDigitTwo;
    }

    private static int getLastIndex(Integer @NotNull [] array, int criteria) {
        int index = -1;
        for (int i = array.length; i-- >0;) {
            if (array[i] == criteria) {
                index = i;
                break;
            }
        }
        return index;
    }
}
