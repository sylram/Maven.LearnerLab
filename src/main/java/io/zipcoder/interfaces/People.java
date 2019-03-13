package io.zipcoder.interfaces;

import java.util.ArrayList;


public class People {

    private ArrayList<Person> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);

    }

    public int getCount() {
        return personList.size();
    }

    public Person finById(Long given) {
        for(Person p: personList){
            if(p.getId()==given){
                return p;
            }
        }return null;
    }

    public void remove(Person given) {
        if(personList.contains(given)){
        personList.remove(given);}
    }

    public void remove(Long id) {
        personList.remove(finById(id));

    }

    public Person[] getArray() {
        return personList.toArray(new Person[personList.size()]);
    }

    public void removeAll() {
        personList.clear();
    }
}
