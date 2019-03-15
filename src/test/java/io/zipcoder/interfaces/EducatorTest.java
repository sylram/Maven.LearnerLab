package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
    @Test
    public void isInstanceOfTeacher(){
        Educator educator = Educator.DOLIO;

        Boolean actual = educator instanceof Teacher;

        Assert.assertTrue(actual);
    }


    @Test
    public void teachTest(){
        //Given
        double expected = 2;
        Student student = Students.getInstance().finById(2L);
        Educator educator = Educator.FROILAN;


        //When
        educator.teach(student,expected);

        double hoursTaught = educator.getTimeWorked();
        double actual = student.getLearningHours();


        Assert.assertEquals(expected,actual,0);
        Assert.assertEquals(expected,hoursTaught,0);

    }

    @Test
    public void lectureTest() {
        //Given
        Student student1 = new Student(23L);
        Student student2 = new Student(24L);
        Student student3 = new Student(25L);
        Learner[] learners = {student1, student2, student3};
        double given = 20;
        double expected = 6.67;
        Educator educator = Educator.NHU;

        //When
        educator.lecture(learners,given);
        double actual = student1.getLearningHours();


        Assert.assertEquals(expected, actual,.2);
    }


}
