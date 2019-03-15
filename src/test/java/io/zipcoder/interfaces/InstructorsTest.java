package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void checkInstructorsTest(){
        int expected =6;

       int actual = Instructors.getInstance().getCount();



        Assert.assertEquals(expected,actual);
    }
    @Test
    public void checkByNameTest(){
        String expected = "Nhu";

        String actual = Instructors.getInstance().finById(102L).getName();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getArrayTest(){

//        Instructor[] expected = {new Instructor(100L),new Instructor(101L),
//                new Instructor(102L),new Instructor(103L),new Instructor(104L),
//                new Instructor(105L),};
        Instructor[] actual = Instructors.getInstance().getArray();

        Assert.assertNotNull(actual);

    }


}

