package io.zipcoder.interfaces;

public class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        String[] names = {"Kris","Will","Nhu","Leon","Frolian","Dolio"};
        for (long i = 100; i <106 ; i++) {
            Instructor instructor = new Instructor(i);
            instructor.setName(names[(int)i-100]);
            add(instructor);

        }
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }


}
