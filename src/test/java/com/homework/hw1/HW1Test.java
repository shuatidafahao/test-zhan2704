package test.java.com.homework.hw1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;


class HW1Test {
    @Test
    public void testHelloWorld()
    {

        // assertion - you will see one success and one fail
        assertEquals("Hello", "Hello!");
        assertEquals("Hello world!\n", "Hello world!");

    }

}