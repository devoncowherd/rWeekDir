package textstorage;
import java.io.*;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("...Script Loaded!");
    
        FileScanner scan = new FileScanner();
        String userInput;    
        String print;
        File currentFile;

        FileGenerator gen = new FileGenerator();

        print = gen.listFiles();
        System.out.println(print);

        gen.makeFile();
        print = gen.listFiles();

        System.out.println(print);        

    }

}
