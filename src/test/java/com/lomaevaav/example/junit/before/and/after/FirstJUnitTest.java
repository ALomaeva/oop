package com.lomaevaav.example.junit.before.and.after;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FirstJUnitTest extends BaseTest {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
        System.out.println("myFirstTest");
    }

    @Test
    void test2() {
        assertEquals(1, 1 + 1);
        System.out.println("test2");
    }
}
