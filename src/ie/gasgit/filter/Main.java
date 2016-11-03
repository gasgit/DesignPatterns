package ie.gasgit.filter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("glen", "male", "single"));
        persons.add(new Person("ben", "male", "married"));
        persons.add(new Person("harriot", "female", "married"));
        persons.add(new Person("serena", "female", "single"));
        persons.add(new Person("mark", "male", "single"));
        persons.add(new Person("christine", "female", "single"));
        persons.add(new Person("sarah", "female", "single"));
        persons.add(new Person("juliet", "female", "married"));


        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new SingleCriteria();
        Criteria married = new MarriedCriteria();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleFemale = new AndCriteria(single, female);
        Criteria singleOrFemale = new OrCriteria(single, female);



        System.out.println();
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));


        System.out.println();
        System.out.println("Females: ");
        printPersons(female.meetCriteria(persons));

        System.out.println();
        System.out.println("Single Males: " );
        printPersons(singleMale.meetCriteria(persons));

        System.out.println();
        System.out.println("Single Females");
        printPersons(singleFemale.meetCriteria(persons));

        System.out.println();
        System.out.println("Single or Female: ");
        printPersons(singleOrFemale.meetCriteria(persons));

        System.out.println();
        System.out.println("Married: ");
        printPersons(married.meetCriteria(persons));

        System.out.println();
        System.out.println("Persons: ");
        printPersons(persons);

    }
    public static void printPersons(List<Person> persons){
        for(Person person : persons){
            System.out.println("Person : [ Name: " + person.getName() +
                    ", Gender : " + person.getGender() +
                    ", Marital Status : " + person.getMaritalStatus() + " ]");

        }



    }
}
