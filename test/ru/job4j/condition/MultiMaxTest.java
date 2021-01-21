package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(6, 4, 5);
        assertThat(result, is(6));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(4, 3, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenAllEqual() {
        int result = MultiMax.max(3, 3, 3);
        assertThat(result, is(3));
    }

}