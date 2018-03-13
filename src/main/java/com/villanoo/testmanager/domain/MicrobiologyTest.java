package com.villanoo.testmanager.domain;

public class MicrobiologyTest extends AbstractTest {

    private String MicrobiologyProp;

    @Override
    public String op1() {
        return "OP1: MicrobiologyTest";
    }

    public String getMicrobiologyProp() {
        return MicrobiologyProp;
    }

    public void setMicrobiologyProp(String microbiologyProp) {
        MicrobiologyProp = microbiologyProp;
    }
}
