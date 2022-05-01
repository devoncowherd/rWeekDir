package textstorage;

import java.io.*;
import java.util.Scanner;

public class FileScanner 
{
    Scanner scan = new Scanner(System.in);
    String userInput;

    public String getInput()
    {
        userInput = scan.nextLine().toString();
        return userInput;
    }
}
