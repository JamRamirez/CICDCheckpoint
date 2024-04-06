package org.example;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AppTest {

    @Test
    void TwoPlusTwo(){
        App calculator = new App();
        assertEquals(4.0, calculator.add(2,2));
    }

    @Test
    void TwoSubsOne(){
        App calculator = new App();
        assertEquals(1.0, calculator.substraction(2,1));
    }

    @Test
    void TwoMultFive(){
        App calculator = new App();
        assertEquals(10.0, calculator.multiplication(2,5));
    }

    @Test
    void TenDivTwo(){
        App calculator = new App();
        assertEquals(5.0, calculator.division(10,2));
    }

    @Test
    void TwoDivCero(){
        App calculator = new App();
        assertEquals(-1, calculator.division(2,0));
    }

}
