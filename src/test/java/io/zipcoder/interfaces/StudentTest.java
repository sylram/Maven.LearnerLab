package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void instanceOfLearnerTest(){
        //Given
    Student student = new Student(34L);

    Boolean actual = student instanceof Learner;

        Assert.assertTrue(actual);
    }
    @Test
    public void instanceOfPersonTest(){
        //Given
        Student student = new Student(34L);

        Boolean actual = student instanceof Person;

        Assert.assertTrue(actual);
    }
    @Test
    public void LearnTest(){
        //Given
        double expected = 3.5;
        Student student = new Student(34L);

        student.learn(expected);
        double actual = student.getLearningHours();

        Assert.assertEquals(expected,actual,0);
    }


}
