package com.villanoo.testmanager.domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.data.annotation.Id;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BiochemistryTest.class, name = "biochemistry"),
        @JsonSubTypes.Type(value = HematologyTest.class, name = "hematology"),
        @JsonSubTypes.Type(value = ImmunologyTest.class, name = "immunology"),
        @JsonSubTypes.Type(value = MicrobiologyTest.class, name = "microbiology")
})
public abstract class AbstractTest {

    @Id private String id;

    private String name;
    private SampleType sampleType;
    private int propA;
    private int propB;
    private String propC;

    public String getName() {
        return name;
    }

    public SampleType getSampleType() {
        return sampleType;
    }

    public int getPropA() {
        return propA;
    }

    public int getPropB() {
        return propB;
    }

    public String getPropC() {
        return propC;
    }

    private String op1Result;

    public void setName(String name) {
        this.name = name;
    }

    public void setSampleType(SampleType sampleType) {
        this.sampleType = sampleType;
    }

    public void setPropA(int propA) {
        this.propA = propA;
    }

    public void setPropB(int propB) {
        this.propB = propB;
    }

    public void setPropC(String propC) {
        this.propC = propC;
    }

    public String op1 () {
        return "OP1: AbstractTest";
    }

    public int op2 () {
        return propA + propB;
    }

    public String getOp1Result() {
        return op1();
    }

    public int getOp2Result() {
        return op2();
    }
}
