package com.lomaevaav.example.junit.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTrueTest {
    @Test
    void name() {
        Assertions.assertTrue(false, "Тест упал");
    }
    @Test
    void name2() {
        Assertions.assertTrue(true, "Тест прошел");
    }
}
