package HomeworkWeek11.Problem3;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.stream.Stream;

public class JUnitTests {
    StringGenerator sg =  new StringGenerator();
    ByteArrayOutputStream baos = new ByteArrayOutputStream();

    @Test
    public void generated_string_should_not_be_empty()
    {
        Assert.assertFalse(sg.generateString().isEmpty());
    }

    @Test
    public void the_length_of_the_generated_string_should_be_greater_than_3()
    {
        Assert.assertTrue(sg.generateString().length()>3);
    }

    @Test
    public void the_length_of_the_generated_string_should_be_less_than_13()
    {
        Assert.assertTrue(sg.generateString().length()<13);
    }

    @Test
    public void all_characters_in_generated_string_should_be_letters()
    {
        Assert.assertTrue((sg.generateString()).matches("[a-zA-Z]+"));
    }

    @Test
    public void when_checking_if_HelloWorld_has_at_least_1_vowel_at_each_3_letters_it_should_be_false()
    {
        Assert.assertFalse( sg.hasAtLeastOneVowel("HelloWorld"));
    }

    @Test
    public void when_checking_if_howareyou_has_at_least_1_vowel_at_each_3_letters_it_should_be_true(){
        Assert.assertTrue( sg.hasAtLeastOneVowel("howareyou"));
    }

    @Test
    public void ensure_at_least_1_in_every_3_letters_is_a_vowel()
    {
        String word = sg.generateString();
        boolean result =
                Stream.iterate(0, i -> i + 1)
                        .limit(word.length() - 2)
                        .allMatch(it -> word.substring(it, it + 3).matches(".*[aeiou].*"));

        Assert.assertTrue(result);
    }

    @Test
    public void when_printing_empty_string_the_result_should_be_empty_string()
    {
        System.setOut(new PrintStream( baos));

        (new StringsProcessorImplementations("")).StringsPrinter();

        Assert.assertEquals("", baos.toString() );
    }

    @Test
    public void when_printing_HelloWorld_the_result_should_be_HelloWorld()
    {
        System.setOut(new PrintStream( baos));

        (new StringsProcessorImplementations("HelloWorld")).StringsPrinter();

        Assert.assertEquals("HelloWorld", baos.toString() );
    }

    @Test
    public void when_counting_the_vowels_in_a_string_without_vowels_should_be_printed_0()
    {
        System.setOut( new PrintStream( baos) );

        (new StringsProcessorImplementations("BRD")).VowelsCounter();

        Assert.assertEquals("0",baos.toString());
    }

    @Test
    public void when_counting_the_vowels_in_a_string_with_3_vowels_should_be_printed_3()
    {
        System.setOut( new PrintStream( baos) );

        (new StringsProcessorImplementations("HelloWorld")).VowelsCounter();

        Assert.assertEquals("3",baos.toString());
    }

    @Test
    public void when_counting_the_consonants_in_a_string_without_consonants_should_be_printed_0()
    {
        System.setOut( new PrintStream( baos) );

        (new StringsProcessorImplementations("ieeeeeei")).ConsonantsCounter();

        Assert.assertEquals("0",baos.toString());
    }

    @Test
    public void when_counting_the_consonants_in_a_string_with_7_consonants_should_be_printed_7()
    {
        System.setOut( new PrintStream( baos) );

        (new StringsProcessorImplementations("HelloWorld")).ConsonantsCounter();

        Assert.assertEquals("7",baos.toString());
    }

    @Test
    public void when_getting_the_length_of_HelloWorld_should_be_printed_10()
    {
        System.setOut(new PrintStream( baos));

        (new StringsProcessorImplementations("HelloWorld")).StringsLength();

        Assert.assertEquals("10",baos.toString());
    }

    @Test
    public void when_getting_the_length_of_StringProcessor_should_be_printed_15()
    {
        System.setOut(new PrintStream( baos));

        (new StringsProcessorImplementations("StringProcessor")).StringsLength();

        Assert.assertEquals("15",baos.toString());
    }

    @Test
    public void when_removing_vowels_from_a_string_with_only_vowels_should_be_printed_nothing()
    {
        System.setOut(new PrintStream( baos));

        (new StringsProcessorImplementations("iooooi")).VowelsRemover();

        Assert.assertEquals("",baos.toString());
    }

    @Test
    public void when_removing_vowels_from_a_string_with_3_vowels_should_be_printed_the_string_without_the_3_vowels()
    {
        System.setOut(new PrintStream( baos));

        (new StringsProcessorImplementations("remove")).VowelsRemover();

        Assert.assertEquals("rmv",baos.toString());
    }

    @Test
    public void when_removing_vowels_from_a_string_with_7_vowels_should_be_printed_the_string_without_the_7_vowels()
    {
        System.setOut(new PrintStream( baos));

        (new StringsProcessorImplementations("another test for today")).VowelsRemover();

        Assert.assertEquals("nthr tst fr tdy",baos.toString());
    }
}
