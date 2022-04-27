package main;

import java.io.*;

//URL = Uniform Resource Locator
//ClassLoader = Native Java Object Child Class
//https://docs.oracle.com/javase/7/docs/api/javax/swing/JFileChooser.html
/*
Introduction to Java
First java program
JVM, JRE, JDK
methods and parameters
method overloading and overriding
File I/O
Exceptions
Control flow (while, if)
Primitive types / first objects
Intro to Git (clone, init, add, commit, push, pull)
Count the amount of words in a file..
Count the amount of sentences in a file..
Ceasar cipher - shift all letters n amount of letters forwards or backwards..
katacoda.com - for git and linux VM commands practice
*/
public class Main
{
    public static void main(String[] args) throws Exception
    {
        StringBuilder quote = new StringBuilder();
        
        //Creates a FileReader object that has a class object in it with the method getClassLoader which allows me to retrieve the text file's path wherever it's stored. Then the spaces are replaced with %20 due to URLs being incompatible with spaces
        File text = new File("./devQuote.txt");
        System.out.println(text.getAbsolutePath());
        
        BufferedReader byteBuff = new BufferedReader(new FileReader(text));

        int charByte = 0;

        while(charByte != -1)
        {
            charByte = byteBuff.read();
            quote.append((char)charByte);    
        }

        int index = quote.length();
        int wordCount = 0;
        int charCount = 0;
        int sentenceCount = 0;
        char period = '.';
        char colon = ';';

        System.out.println("\n(The quote is " + index + " characters long.)\n");

        for(int x = 0; x < index - 1; x++)
        {

            if((int)quote.charAt(x) == 32 || (int)quote.charAt(x) == 13)
            {
                ++wordCount;
            }
            else
            {
                ++charCount;
            }

            if((int)quote.charAt(x) == period || (int)quote.charAt(x) == colon)
            {
                ++sentenceCount;
            }
        }
        
  

        System.out.println(quote);
        System.out.println("\nThe number of words in the quote are: " + wordCount);
        System.out.println("\nThe number of letters in the quote are: " + charCount);
        System.out.println("\nThe number of sentences in the quote are: " + sentenceCount);


        int gap =  0;
        while(gap <= 10)
        {
            gap++;
            System.out.print("-");
        }

        for(int z = 0; z < quote.length() -10; z++)
        {
            quote.setCharAt(z + 1,quote.charAt(z + 2));
        }

        System.out.println("\n\tBelow, all letters are shifted to the right 2 positions in a new String up to the the String length -10 (hence the typo)\n\n" + quote);

  

        byteBuff.close();
    }
}