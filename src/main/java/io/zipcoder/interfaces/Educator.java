package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    KHRIS(100),
    WHIL(101),
    LEON(102),
    FROILAN(103),
    DOLIO(104),
    NHU(105);
    private long id;
    private double timeWorked;
    final Instructor instructor;

   Educator(long id){
       this.id = id;
       this.instructor = new Instructor(id);
       instructor.setName(this.toString());
       }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
       this.timeWorked +=numberOfHours;
        instructor.lecture(learners,numberOfHours);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.timeWorked +=numberOfHours;
        this.instructor.teach(learner,numberOfHours);

    }
    public double getTimeWorked(){
       return timeWorked;
    }
}
