package com.lomaevaav.example.junit.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertNullTest {
    @Test
    void name() {
        String dogName = "Лорд";
        Assertions.assertNotNull(dogName);
    }

    @Test
    void name2() {
        String dogName = null;
        Assertions.assertNotNull(dogName);
    }
}
