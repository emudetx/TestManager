package com.villanoo.testmanager;

import com.villanoo.testmanager.adapter.OrderRepository;
import com.villanoo.testmanager.adapter.PatientRepository;
import com.villanoo.testmanager.adapter.SampleTypeRepository;
import com.villanoo.testmanager.adapter.TestRepository;
import com.villanoo.testmanager.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private TestRepository testRepository;
    @Autowired
    private SampleTypeRepository sampleTypeRepository;
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        orderRepository.deleteAll();
        testRepository.deleteAll();
        sampleTypeRepository.deleteAll();

        SampleType sampleTypeBlood = new SampleType();
        sampleTypeBlood.setName("Blood");
        sampleTypeRepository.save(sampleTypeBlood);

        BiochemistryTest biochemistryTest = new BiochemistryTest();
        biochemistryTest.setName("bio test");
        biochemistryTest.setSampleType(sampleTypeBlood);
        biochemistryTest.setPropA(1);
        biochemistryTest.setPropB(2);
        biochemistryTest.setBiochemistryProp("bio property");
        testRepository.save(biochemistryTest);

        HematologyTest hematologyTest = new HematologyTest();
        hematologyTest.setName("bio test");
        hematologyTest.setSampleType(sampleTypeBlood);
        hematologyTest.setPropA(1);
        hematologyTest.setPropB(2);
        hematologyTest.setHematologyProp("hematology property");
        testRepository.save(hematologyTest);


        List<AbstractTest> tests = new ArrayList<>();
        tests.add(biochemistryTest);
        SampleContainer sampleContainer = new SampleContainer();
        sampleContainer.setSampleType(sampleTypeBlood);
        sampleContainer.setLabel("00001");
        sampleContainer.setTests(tests);

        Patient patient = new Patient();
        patient.setName("Oscar");
        patient.setSurname("Villanova");
        patient.setDateOfBirth(new Date());
        patientRepository.save(patient);

        Order order = new Order();
        order.setOrderId("Order1");
        order.setDate(new Date());

        List<SampleContainer> sampleContainers = new ArrayList<>();
        sampleContainers.add(sampleContainer);
        order.setSampleContainers(sampleContainers);
        order.setPatient(patient);
        orderRepository.save(order);

    }

}