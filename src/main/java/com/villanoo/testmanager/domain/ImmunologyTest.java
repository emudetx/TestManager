package com.villanoo.testmanager.domain;

public class ImmunologyTest extends AbstractTest {

    private String ImmunologyProp;

    @Override
    public String op1() {
        return "OP1: ImmunologyTest";
    }

    public String getImmunologyProp() {
        return ImmunologyProp;
    }

    public void setImmunologyProp(String immunologyProp) {
        ImmunologyProp = immunologyProp;
    }
}
