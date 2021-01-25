package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {4, 2, 9, 10, 1};
        int[] expect = {4, 2, 1, 10, 9};
        int[] rsl = SwitchArray.swap(input, 2, 4);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to3() {
        int[] input = {2, 4, 6, 8, 10};
        int[] expect = {2, 8, 6, 4, 10};
        int[] rsl = SwitchArray.swap(input, 1, 3);
        assertThat(rsl, is(expect));
    }
}