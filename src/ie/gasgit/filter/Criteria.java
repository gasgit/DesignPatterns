package ie.gasgit.filter;

import java.util.List;

/**
 * Created by glen on 03/08/16.
 */
public interface Criteria {

     List<Person> meetCriteria(List<Person> persons);

}
