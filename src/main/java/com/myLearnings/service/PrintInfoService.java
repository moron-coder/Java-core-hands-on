package main.java.com.myLearnings.service;

import main.java.com.myLearnings.Person;

import java.util.List;

public class PrintInfoService {
    public static void printEligiblePersons(List<Person> persons, CheckerService tester) {
        for(Person person:persons){
            if(tester.filterCriteria(person)){
                System.out.println(person);
            }
        }
    }
}
