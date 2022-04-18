package lesson23;

import java.util.ArrayList;
import java.util.Collections;


public class SortingCollections {
    public static void  sortCollection(ArrayList<Employee> staff) {
        Collections.sort(staff, ((o1, o2) -> {
            int compare = Integer.compare(o1.getSalary(), o2.getSalary());
            if (compare == 0) {
                compare = o1.getName().compareTo(o2.getName());
            }
            return compare;
        }
        ));
    }
}
