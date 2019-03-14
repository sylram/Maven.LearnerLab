package io.zipcoder.interfaces;



public class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        populateStudents();

    }

    public void populateStudents() {
        String[] names={"Marshilla","Brian","Kate","Will","Eric","Ashley","Christina",
                "Nila","Sian","Eleonor","Marlys","Jullian","David","Joe","Alex"};
        for (long i = 1L; i <=15L ; i++) {
            Student s = new Student(i);
            s.setName(names[(int)i-1]);
            add(s);
        }
    }

    @Override
    public Student[] getArray() {
//        return new Student[0];
        return personList.toArray(new Student[personList.size()]);
    }

    public static Students getInstance() {
        return INSTANCE;
    }

   
}
