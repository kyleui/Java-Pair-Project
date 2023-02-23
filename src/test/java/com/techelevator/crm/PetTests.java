package com.techelevator.crm;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PetTests {

    Pet pet = new Pet("John", "Dragon");


    @Test
    public void stringTest() {

        String[] test = {"Rabies", "Distemper", "Parvo"};
        String expected = "Rabies, Distemper, Parvo";

        String result = pet.listVaccinations();

        assertEquals(expected, result);

    }


    @Test
    public void emptyTest() {

        String[] test = {};
        String expected = "";

        String result = pet.listVaccinations();

        assertEquals(expected, result);

    }




}