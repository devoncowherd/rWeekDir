package textstorage;
import java.io.*;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("...Script Loaded!");
    
        FileScanner scan = new FileScanner();
        FileGenerator gen = new FileGenerator();
        String userInput;    
        String print;
        File currentFile;
        boolean run = true;

       
        while(run)
        {
            gen.prompt();
            for(int x = 0; x < 50; x++)
            {
                System.out.print("-");
            }
            System.out.println("");

            userInput = gen.getInput();
            switch(userInput)
            {

                case "1":
                    gen.writeFile();
                    break;
                case "2":
                    System.out.println("\n...this part of the program wasn't built yet\n");
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    System.out.println("\nNo valid inputs received.\n");
                    break;
            }
        }
    }

}
