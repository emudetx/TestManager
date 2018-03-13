package com.villanoo.testmanager.domain;

public class HematologyTest extends AbstractTest {

    private String HematologyProp;

    public String getHematologyProp() {
        return HematologyProp;
    }

    public void setHematologyProp(String hematologyProp) {
        HematologyProp = hematologyProp;
    }

    @Override
    public String op1() {
        return "OP1: HematologyTest";
    }
}
