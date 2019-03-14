package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    Learner[] learners;

    public Instructor(Long id) {
        super(id);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double lectureHours = numberOfHours/learners.length;
        for(Learner l: learners){
        teach(l,lectureHours);}


    }

    public void teach(Learner learner, double numberOfHours) {

        learner.learn(numberOfHours);


        }


}
