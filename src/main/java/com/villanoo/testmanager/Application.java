package com.villanoo.testmanager;

import com.villanoo.testmanager.adapter.OrderRepository;
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


        List<AbstractTest> tests = new ArrayList<>();
        tests.add(biochemistryTest);
        SampleContainer sampleContainer = new SampleContainer();
        sampleContainer.setSampleType(sampleTypeBlood);
        sampleContainer.setLabel("00001");
        sampleContainer.setTests(tests);


        final Order order = new Order();
        order.setOrderId("Order1");
        order.setDate(new Date());

        final List<SampleContainer> sampleContainers = new ArrayList<>();
        sampleContainers.add(sampleContainer);
        order.setSampleContainers(sampleContainers);
        orderRepository.save(order);

    }

}