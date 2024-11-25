package hw.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static hw.App.delEdgeOfArray;


class firstTest {

    @Test
    void firstTestTrue() {
        Integer[] array = {1, 2, 1, 2, 2};
        Assertions.assertArrayEquals(new Integer[]{2, 2}, delEdgeOfArray(array));
    }

    @Test
    void firstTestZero() {
        Integer[] array = {1, 2, 3, 4, 1};
        Assertions.assertArrayEquals(new Integer[]{}, delEdgeOfArray(array));
    }

    @Test
    void firstTestThrow() {
        Integer[] array = {2, 2, 2, 2};
        Assertions.assertThrowsExactly(RuntimeException.class, () -> delEdgeOfArray(array));
    }

    @Test
    void firstTestThrowZero() {
        Integer[] array = {};
        Assertions.assertThrowsExactly(RuntimeException.class, () -> delEdgeOfArray(array));
    }
}
