package com.mycompany.app;

import com.mycompany.app.App;
import static org.junit.Assert.*;



import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    App appUnderTest = new App();

    @Test
    public void shouldAnswerWithTrue(){
        String str1 = "This   .,is .a      test.";
        String str2 = "This/ is /a =test].";

        String[] result = App.cleanUp(str1, str2);
        //System.out.println(result);
        assertTrue(result[0].equals(result[1]));
    }

    @Test
    public void shouldAnswerWithFalse(){
        String str1 = "This sentence is not the same.";
        String str2 = "This sentence is not the same as this";

        String[] result = App.cleanUp(str1, str2);
        System.out.println(result);
        assertFalse(result[0].equals(result[1]));
    }

    @Test
    public void emptyStringAreTheSame(){
        String str1 = " ";
        String str2 = " ";

        String[] result = App.cleanUp(str1, str2);
        System.out.println(result);
        assertTrue(result[0].equals(result[1]));
    }

    // @Test
    // public void returnDifferenceValues(){

    //     String str1 = "This is string";
    //     String str2 = "This is a string";

    //     String[] result = App.main(args);
    //     System.out.println(result);
    //     //assertTrue(result[0].equals(result[1]));
    // }



}