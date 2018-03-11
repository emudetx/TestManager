package com.villanoo.testmanager.domain;

public class BiochemistryTest extends AbstractTest {

    public String getBiochemistryProp() {
        return biochemistryProp;
    }

    private String biochemistryProp;

    public void setBiochemistryProp(String biochemistryProp) {
        this.biochemistryProp = biochemistryProp;
    }

    @Override
    public String op1() {
            return "OP1: BiochemistryTest";
    }

    @Override
    public int op2() {
        return super.op2() + 10;
    }
}
