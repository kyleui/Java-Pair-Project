package com.techelevator.crm;

import com.techelevator.Person;

import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable{

    private String phoneNumber;
    private List<Pet> pets;

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        this.phoneNumber = "";

    }


    @Override
    public double getBalanceDue(Map<String, Double> customerOwes) {
     double balanceDue = 0;
        for (String typeOfService: customerOwes.keySet()){
            balanceDue+= customerOwes.get(typeOfService);
        }
       return balanceDue;
    }
}
