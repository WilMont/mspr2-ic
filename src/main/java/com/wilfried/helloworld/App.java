package com.wilfried.helloworld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculateur.calculerAddition(1,2); // On attend 3
        Calculateur.calculerSoustraction(5,1); // On attend 4
        Calculateur.calculerMultiplication(5,2); // On attend 10
        Calculateur.calculerSoustraction(8,2); // On attend 4
    }
}
