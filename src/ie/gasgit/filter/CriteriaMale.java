package ie.gasgit.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by glen on 03/08/16.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> malePersons = new ArrayList<>();
        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);

            }

        }
        return malePersons;
    }
}
