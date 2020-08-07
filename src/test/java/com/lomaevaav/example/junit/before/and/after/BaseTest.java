package com.lomaevaav.example.junit.before.and.after;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeAll
    static void beforeAllBaseTest() {
        System.out.println("BaseTest BeforeAll");
    }

    @BeforeEach
    void setUpBaseTest() {
        System.out.println("BaseTest BeforeEach");
    }

    @AfterEach
    void tearDownBaseTest() {
        System.out.println("BaseTest AfterEach");
    }

    @AfterAll
    static void afterAllBaseTest() {
        System.out.println("BaseTest AfterAll");

    }
}
