package com.villanoo.testmanager.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class BiochemistryTestTest {

    @Test
    public void op1() {
        BiochemistryTest biochemistryTest = new BiochemistryTest();
        assertEquals("OP1: BiochemistryTest", biochemistryTest.op1());
    }

    @Test
    public void op2() {
        BiochemistryTest biochemistryTest = new BiochemistryTest();
        int propA = 4;
        int propB = 5;
        biochemistryTest.setPropA(propA);
        biochemistryTest.setPropB(propB);
        int expectedResult = propA + propB + 10;
        assertEquals(expectedResult, biochemistryTest.op2());
    }
}