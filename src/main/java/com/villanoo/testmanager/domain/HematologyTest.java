package com.villanoo.testmanager.domain;

public class HematologyTest extends AbstractTest {

    public String getHematologyProp() {
        return HematologyProp;
    }

    public void setHematologyProp(String hematologyProp) {
        HematologyProp = hematologyProp;
    }

    private String HematologyProp;

    @Override
    public String op1() {
        return "OP1: HematologyTest";
    }
}
