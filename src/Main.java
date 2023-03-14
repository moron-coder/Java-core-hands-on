import main.java.com.myLearnings.Person;
import main.java.com.myLearnings.service.AgeNameCheckerService;
import main.java.com.myLearnings.service.CheckerService;
import main.java.com.myLearnings.service.PrintInfoService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int x=5;
        Person p1=new Person("P22",22);
        Person p2=new Person("P10",10);
        Person p3=new Person("P11",11);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        PrintInfoService printInfoService = new PrintInfoService();
        printInfoService.printEligiblePersons(persons, new AgeNameCheckerService());

        System.out.println("<----------------------->");

        printInfoService.printEligiblePersons(persons, new CheckerService() {
            @Override
            public boolean filterCriteria(Person person) {
                return person.age<13;
            }
        });
    }
}