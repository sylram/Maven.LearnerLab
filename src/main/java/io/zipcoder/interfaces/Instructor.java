package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    Learner[] learners;

    public Instructor(Long id) {
        super(id);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double lectureHours = numberOfHours/learners.length;
        teach(learners,lectureHours);


    }

    public void teach(Learner[] learners, double numberOfHours) {
        for (Learner l: learners) {
            l.learn(numberOfHours);

        }

    }
}
