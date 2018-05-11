package pl.jitsolutions.training.javasetests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Working with methods.
 */
public class Exercise2Test {

    @Test
    public void classHasGetterMethod() {
        //GIVEN
        String registrationNumber = "GA654DD";

        //WHEN
        Car car = new Car(registrationNumber);

        //THEN
        assertNotNull(car);
        assertEquals(registrationNumber, car.getRegistrationNumber());
    }

    @Test
    public void increaseSpeed() {
        //GIVEN
        Car car = new Car();

        //WHEN
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        //THEN
        assertEquals(30.0d, car.getSpeed(), 0d);
    }

    @Test
    public void applyBrakes() {
        //GIVEN
        Car car = new Car();
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        //WHEN
        car.applyBrakes(25.0d);

        //THEN
        assertEquals(5.0d, car.getSpeed(), 0d);
    }
}
