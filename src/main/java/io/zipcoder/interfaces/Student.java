package io.zipcoder.interfaces;

public class Student extends Person implements Learner {


    private double totalStudyTime;
    public Learner[] learners;

    public Student(Long id) {
        super(id);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getLearningHours() {
        return totalStudyTime;
    }
}
