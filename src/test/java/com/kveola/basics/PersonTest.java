package com.kveola.basics;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class PersonTest {

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
}