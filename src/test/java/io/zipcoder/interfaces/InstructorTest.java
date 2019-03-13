package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    @Test
    public void isInstanceOfPerson(){
        Instructor instructor = new Instructor(24L);

        Boolean actual = instructor instanceof Person;

        Assert.assertTrue(actual);
    }
    @Test
    public void isInstanceOfTeacher(){
        Instructor instructor = new Instructor(24L);

        Boolean actual = instructor instanceof Instructor;

        Assert.assertTrue(actual);
    }

    @Test
    public void teachTest(){
        //Given
        Student student1 = new Student(23L);
        Student student2 = new Student(23L);
        Learner[] learners = {student1,student2};
        double expected = 20;
        Instructor instructor = new Instructor(24L);

        //When
        instructor.teach(learners,expected);
        double actual = student1.getLearningHours();
        double actual2 = student2.getLearningHours();

        Assert.assertEquals(expected,actual,0);
        Assert.assertEquals(expected,actual2,0);
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
        Instructor instructor = new Instructor(24L);

        //When
        instructor.lecture(learners, given);
        double actual = student1.getLearningHours();


        Assert.assertEquals(expected, actual,.2);
    }

}
