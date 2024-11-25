package hw.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static hw.App.isOnlyDigitOneAndTwo;

public class secondTest {

    @Test
    void secondTestTrue() {
        Integer[] array = {1, 2};
        Assertions.assertTrue(isOnlyDigitOneAndTwo(array));
    }

    @Test
    void secondTestFalse1() {
        Integer[] array = {1, 1};
        Assertions.assertFalse(isOnlyDigitOneAndTwo(array));
    }

    @Test
    void secondTestFalse2() {
        Integer[] array = {2, 2};
        Assertions.assertFalse(isOnlyDigitOneAndTwo(array));
    }

    @Test
    void secondTestFalseAnyOther() {
        Integer[] array = {1, 3};
        Assertions.assertFalse(isOnlyDigitOneAndTwo(array));
    }

    @Test
    void secondTestFalseZero() {
        Integer[] array = {};
        Assertions.assertFalse(isOnlyDigitOneAndTwo(array));
    }
}
