package com.villanoo.testmanager.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.List;

public class Order {

    @Id
    private String id;
    private Date date;
    private String orderId;
    private List<SampleContainer> sampleContainers;
    @DBRef
    private Patient patient;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<SampleContainer> getSampleContainers() {
        return sampleContainers;
    }

    public void setSampleContainers(List<SampleContainer> sampleContainers) {
        this.sampleContainers = sampleContainers;
    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
