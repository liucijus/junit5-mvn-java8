package com.github.liucijus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
    @Test
    void failToVerifyIfTestingFrameworkWorks() {
        int expected = 1;
        int actual = 2;
        assertEquals(expected, actual);
    }
}
