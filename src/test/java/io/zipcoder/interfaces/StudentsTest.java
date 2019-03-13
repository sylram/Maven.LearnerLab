package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {
    @Test
    public void checkStudentsTest(){
        int expected = 15;


        int classSize = Students.getInstance().getCount();
        String actual = Students.getInstance().finById(2L).getName();

        Assert.assertEquals(classSize,expected);
    }
    @Test
    public void checkByNameTest(){
        String expected = "Marlys";



        String actual = Students.getInstance().finById(11L).getName();

        Assert.assertEquals(actual,expected);
    }

}
