package com.techelevator.crm;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

public class CustomerTests {

Customer customer = new Customer("John","Smith");
    Map<String, Double> testMap = new HashMap<>();

    @Test
    public void normalTest() {
Map<String, Double> mapTest = new HashMap<>();

        mapTest.put("Walking", 150.5);

        mapTest.put("Grooming", 75.8);

        mapTest.put("Sitting", 1200.99);

        Customer customer = new Customer("John","Smith");

        double expected = (150.5+75.8+1200.99);
        double result = customer.getBalanceDue(mapTest);

        assertEquals(expected, result,0.001);
    }

}
