package io.zipcoder.interfaces;

public interface Teacher {

    void lecture(Learner[] learners, double numberOfHours);

    void teach(Learner learner, double numberOfHours);
}
