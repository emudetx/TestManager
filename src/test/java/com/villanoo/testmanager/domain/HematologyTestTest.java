package com.villanoo.testmanager.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class HematologyTestTest {

    @Test
    public void op1() {
        HematologyTest hematologyTest = new HematologyTest();
        assertEquals("OP1: HematologyTest", hematologyTest.op1());
    }

    @Test
    public void op2() {
        HematologyTest hematologyTest = new HematologyTest();
        int propA = 4;
        int propB = 5;
        hematologyTest.setPropA(propA);
        hematologyTest.setPropB(propB);
        int expectedResult = propA + propB;
        assertEquals(expectedResult, hematologyTest.op2());
    }
}