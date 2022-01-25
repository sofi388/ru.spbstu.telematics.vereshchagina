package ru.spbstu.telematics;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
      App.MakeStr str = new App.MakeStr();
    int actualLength;
    int expectedLength;
    @Test
    public void makeStringTest() throws Exception
    {
        App.MakeStr str = new App.MakeStr();
        str.length = 10;
        expectedLength = str.length;
        actualLength = str.makeString();

        assertEquals(expectedLength, actualLength);
    }
}
