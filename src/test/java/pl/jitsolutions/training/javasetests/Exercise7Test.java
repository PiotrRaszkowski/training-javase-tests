package pl.jitsolutions.training.javasetests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Working with exceptions.
 */
public class Exercise7Test {

    @Test
    public void shouldThrowCheckedException() {
        //GIVEN
        HappinesMaker happinesMaker = new HappinesMaker();

        //WHEN
        try {
            happinesMaker.happy();
        } catch (Throwable e) {
            //THEN
            assertTrue(e instanceof Exception);
            assertEquals("I am sad, please do something...", e.getMessage());
        }
    }

    @Test
    public void shouldThrowError() {
        //GIVEN
        HappinesMaker happinesMaker = new HappinesMaker();

        //WHEN
        try {
            happinesMaker.beHappy();
        } catch (Throwable e) {
            //THEN
            assertTrue(e instanceof Error);
            assertEquals("I am so sad...", e.getMessage());
        }
    }

    @Test
    public void shouldThrowRuntimeException() {
        //GIVEN
        HappinesMaker happinesMaker = new HappinesMaker();

        //WHEN
        try {
            happinesMaker.lastTry();
        } catch (Throwable e) {
            //THEN
            assertTrue(e instanceof RuntimeException);
            assertEquals("No space to be happy...", e.getMessage());
        }
    }


}
