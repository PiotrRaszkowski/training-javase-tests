package pl.jitsolutions.training.javasetests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * String manipulations.
 */
public class Exercise4Test {

    @Test
    public void createStringFromChar() {
        //GIVEN
        char [] stringAsChars = new char[]{'t', 'e', 's', 't'};

        //WHEN
        String content = new String(stringAsChars);

        //THEN
        assertEquals("test", content);
    }

    @Test
    public void checkStringLength() {
        //GIVEN
        String someString = "Some String";

        //WHEN
        int length = someString.length();

        //THEN
        assertEquals(7, length);
    }

    @Test
    public void concatenateString() {
        //GIVEN
        String text1 = "TEXT 1";
        String text2 = "TEXT 2";

        //WHEN
        String result = text1.concat(text2);

        //THEN
        assertEquals("TEXT 1TEXT 2", result);
    }
}
