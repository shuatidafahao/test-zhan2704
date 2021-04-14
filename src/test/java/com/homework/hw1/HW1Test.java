package test.java.com.homework.hw1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import main.java.com.homework.hw1.Demo;
import main.java.com.homework.hw1.HW1;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class HW1Test {
    @Test
    public void testHelloWorld()
    {
        Demo d1 = new Demo(1);
        assertEquals(1, d1.demoClassVar());
        assertEquals(1, d1.demoInstanceVar());

        Demo d2 = new Demo(23);
        assertEquals(2, d2.demoClassVar());
        assertEquals(23, d2.demoInstanceVar());



        assertEquals(true, d1.demoIsPrimeNumber(11));

    }

}