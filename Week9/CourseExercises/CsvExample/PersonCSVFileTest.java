package CsvExample;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class PersonCSVFileTest {
    @Test
    public void empty_file_produces_empty_file() throws IOException//import un fisier initial si atunci voi testa daca input file este idenitic cu output file
    {
        PersonCSVFile personCSVFile = new PersonCSVFile();
        StringReader reader = new StringReader("");
        StringWriter writer = new StringWriter();
       personCSVFile.parseFile(reader).filterBy("").sortBy("").export(writer);//fluent interface

        Assert.assertEquals("",writer.toString());//
    }


    public void file_with_one_line_and_no_operations_produces_same_file() throws IOException//imoport un fisier initial si atunci voi testa daca input file este idenitic cu output file
    {
        PersonCSVFile personCSVFile = new PersonCSVFile();
        StringReader reader = new StringReader("1,2,3");
        StringWriter writer = new StringWriter();
        personCSVFile.parseFile(reader).filterBy("").sortBy("").export(writer);//fluent interface

        Assert.assertEquals("1,2,3",writer.toString());//
    }




}
