package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void getIdTest(){
        Long id = 2342L;
        String name = "Carlos";
        Person person = new Person(id);

        //when
        Long actual = person.getId();

        //
        Assert.assertEquals(id,actual);

    }
//    @Test
//    public void getIdTest() {
//        Long id = 2342L;
//        String expected = "Carlos";
//        Person person = new Person(id);
//
//        //when
//        String actual = person.getName();
//
//        //
//        Assert.assertEquals(expected, actual);
//
//    }
    @Test
    public void getNameTest() {
        Long id = 2342L;
        String expected = "Carlos";
        Person person = new Person(id);

        //when
        person.setName(expected);
        String actual = person.getName();

        //
        Assert.assertEquals(expected, actual);
    }
}
