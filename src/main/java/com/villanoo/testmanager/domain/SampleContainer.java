package com.villanoo.testmanager.domain;

import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

public class SampleContainer {
    @DBRef
    private SampleType sampleType;
    private String label;
    private List<AbstractTest> tests;

    public SampleType getSampleType() {
        return sampleType;
    }

    public void setSampleType(SampleType sampleType) {
        this.sampleType = sampleType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<AbstractTest> getTests() {
        return tests;
    }

    public void setTests(List<AbstractTest> tests) {
        this.tests = tests;
    }
}
