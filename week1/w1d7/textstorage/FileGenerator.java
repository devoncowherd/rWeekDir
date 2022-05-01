package textstorage;

import java.io.*;

public class FileGenerator extends FileScanner
{
    File currentFile;
    File[] fileList;
    boolean exists;
    String path;
    String userInput;

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
}