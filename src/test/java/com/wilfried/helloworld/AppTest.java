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
        assertEquals(Calculateur.CalculerAddition(1,2), 3);
    }

    @Test
    public void TestCalculerSoustraction()
    {
        assertEquals(Calculateur.CalculerSoustraction(5,1), 4);
    }

    @Test
    public void TestCalculerMultiplication()
    {
        assertEquals(Calculateur.CalculerMultiplication(5,2), 10);
    }

    @Test
    public void TestCalculerDivisionFaux()
    {
        assertEquals(Calculateur.CalculerDivision(8,2), 5);
    }


}
