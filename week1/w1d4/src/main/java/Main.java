package src.main.java;

import java.util.Scanner;
import java.io.*;
import java.util.LinkedList;

public class Main 
{

    public static LinkedList add(LinkedList list, String userInput)
    {   
        boolean exists = false;

        for(int y = 0; y < list.size(); y++)
        {
            if(list.get(y).equals(userInput))
            {
                exists = true;                
            }
        }
        if(exists)
        {
            System.out.println("You already added this element to the list");
        }
        else
        {
            list.add(userInput);
        }
        return list;
    }

    public static LinkedList remove(LinkedList list, String userInput)
    {
        for(int x = 0; x < list.size(); x++ )
        {
            if(list.contains(userInput))
            {
                if(userInput.equals(list.get(x)))
                {
                    list.remove(list.get(x));
                }
            }
            else
            {
                System.out.println("Element not found. Here's the current list:" + list);
            }
        }
            
       
        return list;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //initial variables
        LinkedList<String> strings = new LinkedList();
        String listName = "What kind of list do you need?";
        String userInput;
        String enter = "";
        String instruct = "Instructions:\n\n1: Add Element\n2: Remove Element\n3: Show Entire list\n4: Exit Program\n";
        boolean run = true;
        String which = "Which element do you want to remove?";

        System.out.println(listName);
        listName = "\n" + scan.nextLine() + "List:\n";

        while(run)
        {
            for(int z = 0; z <= 15; z++)
            {
                System.out.print("-");
            }
            System.out.println("\n" + instruct);
            userInput = scan.nextLine();
            switch(userInput)
            {
                case "1":
                    userInput = scan.nextLine();
                    strings = add(strings,userInput);
                    System.out.println(listName + strings);
                    break;
                case "2":
                    userInput = scan.nextLine();
                    strings = remove(strings, userInput);
                    System.out.println(listName + strings);
                    break;
                case "3":
                    System.out.println(listName + strings);
                    break;
                case "4":
                    run = false;
                default:
                    System.out.println(instruct);
            }
        }
    }    
}

/*
linkedlist add at index, linked list contains, 
linked list .equals(another linked list)
contains returns true/false if the LL contains 
a certain value caveat: using == on objects doesn't 
work! why? == actually just compares memory references 
with objects...you have to implement .equals in whatever 
object you're comparing..luckily, because the original 
object class contains .equals, even generics can use it
even when generics usually can't use object specific 
methods (unless you're using interfaces)
*/