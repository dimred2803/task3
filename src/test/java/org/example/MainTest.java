package org.example;

import static org.example.Main.func;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void TestFunc() {
        double actual = func(0,0,1,1,2,2);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void TestFunc2() {
        double actual = func(3,0,5 ,6,0,1);
        double expected = 10;
        assertEquals(expected,actual);
    }
}