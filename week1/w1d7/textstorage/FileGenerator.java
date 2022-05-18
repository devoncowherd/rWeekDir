package textstorage;

import java.io.*;

public class FileGenerator extends FileScanner
{
    File currentFile;
    File[] fileList;
    boolean exists;
    String path;
    String userInput;
    FileWriter writer;

    public void prompt()
    {
        System.out.println("Instructions: \nThis program allows you to generate text files with your own input! ");
        System.out.println("\nEnter 1 if you want to write to a file.\nEnter 2 if you want to read a file.\nEnter 3 if you want to exit the program.");
    }

    public String listFiles()
    {
        String listString = "";

        try 
        {
            File dir = new File("./textstorage/files");
            fileList = dir.listFiles();
            listString = fileList[0].getName();
            exists = true;
        }
        catch(Exception e)
        {
            System.out.println("\n\tError: " + e);
            System.out.println("\t(You may have no .txt files yet - try making some!)\n");
            exists = false;
        }
        
        if(exists)
        {
            for(int x = 0; x < fileList.length - 1; x++)
            {
                listString = listString + ", " + fileList[x + 1].getName();
            }
        }

        return listString;
    }

 
    public File makeFile()
    {
        System.out.println("\nEnter File Name Below:");
        userInput = getInput();
        
        path = "./textstorage/files/" + userInput;
        currentFile = new File(path);
        try
        {
            if(currentFile.createNewFile())
            {
              System.out.println("File Created:" + path);
            }   
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return currentFile;
    }

    public File getFile()
    {
        System.out.println("\nHere are the current files:\n" + listFiles() + "\nWhich file would you like to load?");
        userInput = getInput();

        path = "./textstorage/files/" + userInput;

        try
        {
            currentFile = new File(path);
            System.out.println("\nFile Retrieved!\n");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return currentFile;
    }

    public FileWriter writeFile()
    {
        boolean choice = true;
        System.out.println("Would you like to write to a current file, or would you like to create a new file?\nEnter 1 to create a new file.\nEnter 2 to write to a new file.");
        userInput = getInput();

        while(choice)
        {
            userInput = getInput();
            System.out.println("Would you like to write to a current file, or would you like to create a new file?\nEnter 1 to create a new file.\nEnter 2 to write to a new file.");
            
            try
            {
                switch(userInput)
                {
                    case "1":
                        currentFile = makeFile();
                        writer = new FileWriter(currentFile);
                        System.out.println("\nEnter what you'd like to write into the file below:\n");
                        userInput = getInput();
                        writer.write(userInput);
                        choice = false;
                        break;
                    case "2":
                        currentFile = getFile();
                        writer = new FileWriter(currentFile);
                        System.out.println("\nEnter what you'd like to write into the file below:\n");
                        userInput = getInput();
                        writer.write(userInput);
                        choice = false;
                        break;
                    default: 
                        System.out.println("Please enter 1 or 2.");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
        return writer;

    }
}