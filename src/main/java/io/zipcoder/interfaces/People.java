package io.zipcoder.interfaces;

import java.util.ArrayList;


public abstract class People<E extends Person> {

    ArrayList<E> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(E person) {
        personList.add(person);

    }

    public int getCount() {
        return personList.size();
    }

    public E finById(Long given) {
        for (E person : personList) {
            if (person.getId() == given) {
                return person;
            }
        }
        return null;
    }

    public void remove(E given) {
        if (personList.contains(given)) {
            personList.remove(given);
        }
    }

    public void remove(Long id) {
        personList.remove(finById(id));

    }

    public abstract E[] getArray();

//        return (E[]) personList.toArray();



    public void removeAll() {
        personList.clear();
    }

//    People Anonymous = new People() {
//
//    };


}
