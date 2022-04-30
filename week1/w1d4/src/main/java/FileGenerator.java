package src.main.java;
import java.io.*;
import java.util.Scanner;

public class FileGenerator<T> 
{
    Scanner scan = new Scanner(System.in);   
    T storage;
    String path;
    FileGenerator next;

    
    public void prompt()
    {

        System.out.println("Would you like to make a new list or use an existing one?");
    }

    public String makeFile(String fileName)
    {
        path = "./" + fileName + ".txt";
        return path;
    }

    public T getFile(String fileName)
    {
        path = "./" + fileName + ".txt";

        try
        {
            
        }
        catch(Exception e)
        {
            System.out.println("Error:" + e);
        }
        return path;
    }
}
