package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest(){

        ZipCodeWilmington.hostLecture(101L,30.0);
        double expected = 2;

        Student student = (Student) Students.getInstance().finById(2L);

        double actual = student.getLearningHours();

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void hostLectureByTeacherTest(){
        Instructor instructor = new Instructor(102L);
        ZipCodeWilmington.hostLecture(instructor,30.0);
        double expected = 2;

        Student student = (Student) Students.getInstance().finById(2L);

        double actual = student.getLearningHours();

        Assert.assertEquals(expected,actual,0);

    }
}
