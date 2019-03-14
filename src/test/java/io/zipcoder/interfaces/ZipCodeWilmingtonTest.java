package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

//    @Before
//    public void clear(){
////        Students.getInstance().removeAll();
//        Students.getInstance();
//    }

    @After
    public void tearDown() {
        Students.getInstance().removeAll();
        Students.getInstance().populateStudents();
//        Students.getInstance();
    }


    @Test
    public void hostLectureTest(){
        double expected = 2;
        Student student = Students.getInstance().finById(2L);

        //When
        ZipCodeWilmington.hostLecture(101L,30.0);
        double actual = student.getLearningHours();

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void hostLectureByTeacherTest(){
        Instructor instructor = new Instructor(102L);
        double expected = 2;

        //When
        ZipCodeWilmington.hostLecture(instructor,30.0);



        Student student = Students.getInstance().finById(6L);

        double actual = student.getLearningHours();

        Assert.assertEquals(expected,actual,0);

    }
    @Test
    public void getInstanceTest(){
        Assert.assertNotNull(ZipCodeWilmington.getInstance());


    }
}
