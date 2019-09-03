package com.mycompany.app;

import com.mycompany.app.App;
import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;



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

    @Test
    public void listDiffernceMatchesExpected(){
        ArrayList<String> sentence1 = new ArrayList<String>();
        sentence1.add("first");
        sentence1.add("sentence");

        ArrayList<String> sentence2 = new ArrayList<String>();
        sentence2.add("second");
        sentence2.add("sentence");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("second");

        sentence2.removeAll(sentence1);
        assertEquals(sentence2, expected);
    }

    @Test
    public void listDiffernceIsNotExpected(){
        ArrayList<String> sentence1 = new ArrayList<String>();
        sentence1.add("first");
        sentence1.add("sentence");

        ArrayList<String> sentence2 = new ArrayList<String>();
        sentence2.add("first");
        sentence2.add("sentence");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("second");

        sentence2.removeAll(sentence1);
        assertThat(sentence2, not(expected));
    }

    @Test
    public void listDiffernceIsSame(){
        ArrayList<String> sentence1 = new ArrayList<String>();
        sentence1.add("first");
        sentence1.add("sentence");

        ArrayList<String> sentence2 = new ArrayList<String>();
        sentence2.add("first");
        sentence2.add("sentence");

        ArrayList<String> expected = new ArrayList<String>();

        sentence2.removeAll(sentence1);
        assertThat(sentence2, is(expected));
    }

    @Test
    public void listDiffernceIsEmpty(){
        ArrayList<String> sentence1 = new ArrayList<String>();
        sentence1.add("first");
        sentence1.add("sentence");

        ArrayList<String> sentence2 = new ArrayList<String>();
        sentence2.add("first");
        sentence2.add("sentence");

        ArrayList<String> expected = new ArrayList<String>();

        sentence2.removeAll(sentence1);
        assertThat(sentence2, is(expected));
    }

    @Test
    public void listDiffernceIsAsExpected(){
        ArrayList<String> sentence1 = new ArrayList<String>();
        sentence1.add("first");
        sentence1.add("first");

        ArrayList<String> sentence2 = new ArrayList<String>();
        sentence2.add("first");
        sentence2.add("first");
        sentence2.add("sentence");

        ArrayList<String> expected = new ArrayList<String>();
        sentence2.add("sentence");

        sentence2.removeAll(sentence1);
        assertThat(sentence2, is(expected));
    }




}