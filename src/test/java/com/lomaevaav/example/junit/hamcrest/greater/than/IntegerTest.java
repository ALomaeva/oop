package com.lomaevaav.example.junit.hamcrest.greater.than;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;

public class IntegerTest {
    @Test
    void greatThanTest() {
        int numberActual = 100;
        int numberExpected = 100;

        MatcherAssert.assertThat(numberActual, greaterThan(numberExpected));
    }
    @Test
    void lessThanOrEqualToTest() {
        int numberActual = 50;
        int numberExpected = 100;

        MatcherAssert.assertThat(numberActual, lessThanOrEqualTo(numberExpected));
    }
    @Test
    void closeToTest() {
        double numberActual = 100.00;
        double numberExpected = 90.00;

        MatcherAssert.assertThat(numberActual, closeTo(numberExpected, 1));
    }



}
