package com.villanoo.testmanager.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

public class SampleType {
    @Id
    private String id;

    private String name;

    private List<AbstractTest> tests;

    public List<AbstractTest> getTests() {
        return tests;
    }

    public void setTests(List<AbstractTest> tests) {
        this.tests = tests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
