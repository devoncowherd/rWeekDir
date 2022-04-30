package src.main.java;
import java.io.*;

public class Driver
{
    public static void main(String[] args) throws IOException
    {
        
        GenericPrinter printer = new GenericPrinter();

        String cat = "meow";
        Integer age = 99;
        printer.print(cat);
        printer.print(age);

    }
}