package ie.gasgit.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by glen on 04/08/16.
 */
public class MarriedCriteria implements Criteria {


    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> marriedPersons = new ArrayList<>();
        for(Person person : persons){
            if(person.getMaritalStatus().equalsIgnoreCase("MARRIED")){
                marriedPersons.add(person);
            }
        }
        return marriedPersons;
    }
}
