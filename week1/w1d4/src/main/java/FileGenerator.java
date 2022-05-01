package src.main.java;
import java.io.*;
import java.util.Scanner;

public class FileGenerator<T> 
{
    Scanner scan = new Scanner(System.in);   
    BufferedReader read;
    File file;
    T storage;
    String path;
    FileGenerator next;
    String userInput;
    String yesNo = "\n(Enter Yes or No)\n";


    //prompts the user on the main menu
    public void prompt()
    {

        System.out.println("Would you like to make a new list or use an existing one?");
    }

    //makes a file if it does not exist
    public BufferedReader makeFile(String fileName)
    {
        path = "./" + fileName + ".txt";
        file = new File(path);
        boolean fileExists = false;

        if(fileExists)
        {
            System.out.println("A list of this type already exists. Would you like to load it?" + yesNo);
            userInput = scan.nextLine();
            
            if(userInput.toUpperCase().equals("YES"))
            {
                read = getFile(path);
            }
            else
            {
                return read;
            }
        }
        else
        {  
            try
            {
                File file = new File(path);
                read = new BufferedReader(new FileReader(file));
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return read;

    }

    public File getFile(String fileName)
    {
        path = "./" + fileName + ".txt";

        try
        {
            file = new File(path);
        }
        catch(Exception e)
        {
            System.out.println("A list by that name could not be found.");
            System.out.println("Error: " + e);
        }

        return file;
    }
}
