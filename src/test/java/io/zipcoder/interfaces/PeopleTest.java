package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeopleTest {
    People people = Students.getInstance();

    @Before
    public void  setUp(){
        people.removeAll();
    }
    @After
    public void tearDown() {
        Students.getInstance().removeAll();
        Students.getInstance().populateStudents();
//        Students.getInstance();
    }


    @Test
    public void constructorTest(){
        //Given
        int expected = 0;
        //When

        int actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addTest(){
        //Given
//        People people = new People();
        Person person1 = new Person(10L);
        Person person2 = new Person(11L);
        int expected = 2;
        //When
        people.add(person1);
        people.add(person2);
        int actual = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void findByIdTest() {
        //Given
//        People people = new People();
        Long given = 10L;
        Person expected = new Person(given);
        ;
        people.add(expected);


        //When
        Person actual = people.finById(given);


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdTest2() {
        //Given
//        People people = new People();
        Long given = 11L;
        Person expected = null;

        //When
        Person actual = people.finById(given);


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByPersonTest() {
        //Given
//        People people = new People();
        Long id = 11L;
        Person given = new Person(id);
        Person expected = null;
        int size = 0;

        //When
        people.add(given);
        people.remove(given);
        Person actual = people.finById(id);
        int actual2 = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(size,actual2);
    }
    @Test
    public void removeByIDTest() {
        //Given
//        People people = new People();
        Long id = 11L;
        Person given = new Person(id);
        Person expected = null;
        int size = 0;
        people.add(given);


        //When
        int previous = people.getCount();
        people.remove(id);
        Person actual = people.finById(id);
        int actual2 = people.getCount();

        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(size,actual2);
        Assert.assertEquals(previous,1);
    }
//    @Test
//    public void getArrayTest() {
//        //Given
////        People people = new People();
//        Person person1 = new Person(1L);
//        Person person2 = new Person(2L);
//        Person person3 = new Person(3L);
//        Person[] expected = {person1, person2, person3};
//        people.add(person1);
//        people.add(person2);
//        people.add(person3);
//
//        Person[] actual = people.getArray();
//
//        Assert.assertEquals(expected,actual);
//    }
    @Test
    public void removeAllTest() {
        //Given
//        People people = new People();
        Person person1 = new Person(1L);
        Person person2 = new Person(2L);
        Person person3 = new Person(3L);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        int expected = 0;

        people.removeAll();
        int actual = people.getCount();

        Assert.assertEquals(expected,actual);
    }
}
