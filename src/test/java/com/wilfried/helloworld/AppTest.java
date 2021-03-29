package com.wilfried.helloworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Tests :
     */
    @Test
    public void TestCalculerAddition()
    {
        assertEquals(3, Calculateur.calculerAddition(1,2));
    }

    @Test
    public void TestCalculerSoustraction()
    {
        assertEquals(4, Calculateur.calculerSoustraction(5,1));
    }

    @Test
    public void TestCalculerMultiplication()
    {
        assertEquals(10, Calculateur.calculerMultiplication(5,2));
    }

    @Test
    public void TestCalculerDivision()
    {
        assertEquals(4, Calculateur.calculerDivision(8,2));
    }


}
