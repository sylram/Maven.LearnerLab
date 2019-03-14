package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class ZipCodeWilmington {

    Students students;
    Instructors instructors;


    private static final ZipCodeWilmington ourInstance = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance() {
        return ourInstance;
    }

    private ZipCodeWilmington() {
       students = Students.getInstance();
       instructors=  Instructors.getInstance();
    }

    public static void hostLecture(Teacher t, double numberOfHours){
//        Person[] studentClass = Students.getInstance().getArray();
//        Student[] studentArray = Arrays.stream(Students.getInstance().getArray()).toArray(Student[]::new);

        t.lecture(Students.getInstance().getArray(),numberOfHours);}

    public static void hostLecture(Long id, double numberOfHours){
        Instructor instructor = Instructors.getInstance().finById(id);
//        Student[] studentArray = Arrays.stream(Students.getInstance().getArray()).toArray(Student[]::new);

        instructor.lecture(Students.getInstance().getArray(),numberOfHours);
    }
}


