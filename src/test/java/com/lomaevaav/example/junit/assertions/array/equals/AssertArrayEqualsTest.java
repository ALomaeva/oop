package com.lomaevaav.example.junit.assertions.array.equals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertArrayEqualsTest {
    @Test
    void name(){
        int[] a = {1,2,3};
        int[] b = {3,4,5};
        Assertions.assertArrayEquals(a, b, "Количество курсов на сайте не корректно");
    }
}
