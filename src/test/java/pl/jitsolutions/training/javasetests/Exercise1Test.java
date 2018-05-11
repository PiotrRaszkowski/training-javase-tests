package pl.jitsolutions.training.javasetests;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Building simple class, working with constructors and basic types.
 */
public class Exercise1Test {

    @Test
    public void classIsCorrectlyCreated() {
        //GIVEN

        //WHEN
        Car car = new Car();

        //THEN
        assertNotNull(car);
    }

    @Test
    public void classHasCustomConstructor() {
        //GIVEN
        String registrationNumber = "GD765HG";

        //WHEN
        Car car = new Car(registrationNumber);

        //THEN
        assertNotNull(car);
    }

    @Test
    public void fillIntType() {
        //GIVEN
        int productionYear = 2014;

        //WHEN
        Car car = new Car();
        car.productionYear = productionYear;

        //THEN
        assertEquals(productionYear, car.productionYear);
    }

    @Test
    public void fillStringType() {
        //GIVEN
        String model = "Octavia";

        //WHEN
        Car car = new Car();
        car.model = model;

        //THEN
        assertEquals(model, car.model);
    }

    @Test
    public void fillFloatType() {
        //GIVEN
        float engineCapacity = 2.0f;

        //WHEN
        Car car = new Car();
        car.engineCapacity = engineCapacity;

        //THEN
        assertEquals(engineCapacity, car.engineCapacity, 0f);
    }

    @Test
    public void autoboxing() {
        //GIVEN
        Long mileage = 13231312L;

        //WHEN
        Car car = new Car();
        car.mileage = mileage;

        //THEN
        assertEquals(mileage.longValue(), car.mileage);
    }

    @Test
    public void arraysCreated() {
        //GIVEN
        String [] parts = new String[]{"DSA32, BOSH1"};
        int [] inspections = new int[5];
        inspections[0] = 2013;
        inspections[1] = 2016;
        inspections[2] = 2017;
        inspections[3] = 2018;
        inspections[4] = 2018;

        //WHEN
        Car car = new Car();
        car.parts = parts;
        car.inspections = inspections;

        //THEN
        assertArrayEquals(parts, car.parts);
        assertArrayEquals(inspections, car.inspections);
    }
}
