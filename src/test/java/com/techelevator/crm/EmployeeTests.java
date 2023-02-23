package com.techelevator.crm;

import com.techelevator.hr.Employee;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class EmployeeTests {
    Employee employee = new Employee("John","Smith");
    Map<String, Double> testMap = new HashMap<>();

    @Test
    public void normalTest() {
        Map<String, Double> mapTest = new HashMap<>();

        mapTest.put("Walking", (10.0));

        mapTest.put("Grooming", 10.0);

        mapTest.put("Sitting", 10.0);

        Employee employee = new Employee("John","Smith");

        double expected = (25);
        double result = employee.getBalanceDue(mapTest);

        assertEquals(expected, result,0.01);
    }













}
