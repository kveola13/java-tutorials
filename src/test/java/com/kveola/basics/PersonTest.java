package com.kveola.basics;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    public String[] states() {
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

    @Test
    public void shouldReturnHelloWorld() {
        Person person = new Person();
        assertEquals("Hello World", person.helloWorld());
    }

    @Test
    public void shouldReturnName() {
        Person person = new Person();
        assertEquals("Hello Ola", person.hello("Ola"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        Person thirdPerson = new Person();
        Person fourthPerson = new Person();

        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop() {
        for (int i = 0; i < 4; i++) {
            Person person1 = new Person();
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays() {
        Person[] personList = new Person[4];

        for (int i = 0; i < personList.length; i++) {
            personList[i] = new Person();
        }
        for (Person person : personList) {
            System.out.println(person.helloWorld());
        }
        Person newPerson = new Person();
        Person secondNewPerson = null;
        Person[] people = {personList[0], personList[3], null, newPerson, secondNewPerson, personList[2], personList[1]};
        Person VIP = people[6];




        for (LoggingLevel state : LoggingLevel.values()) {
            if (state == LoggingLevel.PENDING) {
                System.out.println(LoggingLevel.PENDING);
            }
            if (state == LoggingLevel.PROCESSING) {
                System.out.println(LoggingLevel.PROCESSING);
            }
            if (state == LoggingLevel.PROCESSED) {
                System.out.println(LoggingLevel.PROCESSED);
            }
        }
    }
}