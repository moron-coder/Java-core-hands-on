package main.java.com.myLearnings.service;

import main.java.com.myLearnings.Person;

public class AgeNameCheckerService implements CheckerService {
    @Override
    public boolean filterCriteria(Person person) {
        return person.age>10;
    }
}
