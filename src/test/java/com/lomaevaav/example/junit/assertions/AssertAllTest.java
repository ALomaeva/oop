package com.lomaevaav.example.junit.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllTest {
    @Test
    void name() {
        assertAll("Пользователь",
                () -> assertEquals("Иван", "Петр"),


                () -> assertEquals("Иванов", "Петр")

        );
    }
}
