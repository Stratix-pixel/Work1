package week9.wordprocessor.refactored;

import org.junit.Assert;
import org.junit.Test;
import week9.wordprocessor.refactored.WordProcessor;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class WordProcessorTest
{
    @Test
    public void empty_string_remains_empty_string( ) throws IOException
    {
        WordProcessor wordProcessor = new WordProcessor( );
        StringWriter  stringWriter  = new StringWriter( );

        wordProcessor.wordWrap3( new StringReader( "" ), stringWriter );

        Assert.assertEquals( "", stringWriter.toString( ) );
    }

    @Test
    public void strings_shorter_than_60_chars_remains_unchanged( ) throws IOException
    {
        WordProcessor wordProcessor = new WordProcessor( );
        StringWriter  stringWriter  = new StringWriter( );

        wordProcessor.wordWrap3( new StringReader( "12313123123" ), stringWriter );

        Assert.assertEquals( "12313123123", stringWriter.toString( ) );
    }

    @Test
    public void strings_of_59_chars_remains_unchanged( ) throws IOException
    {
        WordProcessor wordProcessor = new WordProcessor( );
        StringWriter  stringWriter  = new StringWriter( );

        wordProcessor.wordWrap3( new StringReader( "12313123123123131231231231312312312313123123123131231231231" ), stringWriter );

        Assert.assertEquals( "12313123123123131231231231312312312313123123123131231231231", stringWriter.toString( ) );
    }

    @Test
    public void strings_of_60_chars_remains_unchanged( ) throws IOException
    {
        WordProcessor wordProcessor = new WordProcessor( );
        StringWriter  stringWriter  = new StringWriter( );

        wordProcessor.wordWrap3( new StringReader( "123131231231231312312312313123123123131231231231312312312311" ), stringWriter );

        Assert.assertEquals( "123131231231231312312312313123123123131231231231312312312311", stringWriter.toString( ) );
    }

    @Test
    public void strings_of_61_chars_are_split_into_two_strings( ) throws IOException
    {
        WordProcessor wordProcessor = new WordProcessor( );
        StringWriter  stringWriter  = new StringWriter( );

        wordProcessor.wordWrap3( new StringReader( "123131231231231312312312313123123123131231231231312312312 111" ), stringWriter );

        Assert.assertEquals( "123131231231231312312312313123123123131231231231312312312\n111", stringWriter.toString( ) );
    }

    @Test
    public void strings_with_multiple_words_contain_the_max_number_words_in_60_chars_on_each_line( ) throws IOException
    {
        WordProcessor wordProcessor = new WordProcessor( );
        StringWriter  stringWriter  = new StringWriter( );

        wordProcessor.wordWrap3( new StringReader( "12345 6789012 34567890123 4567890 1234567 8901234567 8901234 567890 1356464" ), stringWriter );

        Assert.assertEquals( "12345 6789012 34567890123 4567890 1234567 8901234567 8901234\n567890 1356464", stringWriter.toString( ) );
    }

    @Test
    public void strings_with_multiple_words_contain_the_max_number_words_in_60_chars_on_each_line2( ) throws IOException
    {
        WordProcessor wordProcessor = new WordProcessor( );
        StringWriter  stringWriter  = new StringWriter( );

        wordProcessor.wordWrap3( new StringReader( "12345 6789012 34567890123 4567890 1234567 8901234567 89012347 567890 1356464" ), stringWriter );

        Assert.assertEquals( "12345 6789012 34567890123 4567890 1234567 8901234567\n89012347 567890 1356464", stringWriter.toString( ) );
    }

    @Test
    public void strings_with_words_of_60_chars_long_at_the_start_of_the_text_are_split_correctly( ) throws IOException
    {
        WordProcessor wordProcessor = new WordProcessor( );
        StringWriter  stringWriter  = new StringWriter( );

        wordProcessor.wordWrap3( new StringReader( "123455678901263456789012364567890212345671890123456768901213 567890 1356464" ), stringWriter );

        Assert.assertEquals( "123455678901263456789012364567890212345671890123456768901213\n567890 1356464", stringWriter.toString( ) );
    }

    @Test
    public void strings_with_words_of_60_chars_long_at_the_middle_of_the_text_are_split_correctly( ) throws IOException
    {
        WordProcessor wordProcessor = new WordProcessor( );
        StringWriter  stringWriter  = new StringWriter( );

        wordProcessor.wordWrap3( new StringReader( "454565 87987979 123455678901263456789012364567890212345671890123456768901213 567890 1356464" ), stringWriter );

        Assert.assertEquals( "454565 87987979\n123455678901263456789012364567890212345671890123456768901213\n567890 1356464", stringWriter.toString( ) );
    }

    @Test
    public void strings_with_words_of_60_chars_long_at_the_end_of_the_text_are_split_correctly( ) throws IOException
    {
        WordProcessor wordProcessor = new WordProcessor( );
        StringWriter  stringWriter  = new StringWriter( );

        wordProcessor.wordWrap3( new StringReader( "454565 87987979 123455678901263456789012364567890212345671890123456768901213" ), stringWriter );

        Assert.assertEquals( "454565 87987979\n123455678901263456789012364567890212345671890123456768901213", stringWriter.toString( ) );
    }
}
