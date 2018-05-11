package pl.jitsolutions.training.javasetests;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Working with collections.
 */
public class Exercise6Test {

    @Test
    public void buildArrayList() {
        //GIVEN
        List<String> tasks = new ArrayList<>();

        //WHEN
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        //THEN
        assertEquals(3, tasks.size());
    }

    @Test
    public void buildHashSet() {
        //GIVEN
        Set<Integer> numbers = new HashSet<>();

        //WHEN
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //THEN
        assertEquals(3, numbers.size());
    }

    @Test
    public void buildHashMap() {
        //GIVEN
        Map<String, String> cars = new HashMap<>();

        //WHJEN
        cars.put("GD876GH", "Volvo");
        cars.put("GA876GH", "Mercedes");

        //THEN
        assertEquals(2, cars.size());
    }

    @Test
    public void distinctList() {
        //GIVEN
        List<String> tasks = new ArrayList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.add("Task 3");

        //WHEN
        tasks = new ArrayList<>(new HashSet<>(tasks));

        //THEN
        assertEquals(3, tasks.size());
    }
}
