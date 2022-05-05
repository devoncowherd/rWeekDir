import java.time.LocalDate;
import java.util.Scanner;
//Kotlin automatically imports kotlin.math

fun squiggle()
{
    println();
    for(s in 1..25)
    {
        print("~");
    }
    println();
}
fun main(args : Array<String>)
{

    var scan = Scanner(System.`in`);

    println("...Script Loaded!");
    //Question 1: Find if 2 rectangles overlap one another
    //(rect1x1,rect1y1) // (rect1x2,rect1y2)
    /*
       -----
       |   |
       |   |
       -----
               -----
               |   |
               |   |
               -----
     */


    //Question 2: Check if 2 date ranges overlap //StartDate1, EndDate1 // StartDate2, EndDate2
    // Lines overlap one other (a line can be represented using 2 point)
    //L1 - (x1,y1) //(x2,y2)
    //L2 - (x1,y1) (x2,y2)
    squiggle();
    //Question 3: Program to sort a list of items using for loop

    var unsortedArr = arrayOf(2,1,7,9,23,12,5);
    println("Unsorted Array:");

    for(i in 0..unsortedArr.size - 1)
    {
        print("${unsortedArr[i]} ");
    }

    var temp = 0;

    var c : Int;
    var d : Int;


    for(a in 0..unsortedArr.size - 1)
    {
        for(b in a..unsortedArr.size - 1)
        {
            if(unsortedArr[b] < unsortedArr[a])
            {
                temp = unsortedArr[b];
                unsortedArr[b] = unsortedArr[a];
                unsortedArr[a] = temp;
            }
        }
    }

    println();
    println("\n...Sorted:");

    for(i in 0..unsortedArr.size - 1)
    {
        print("${unsortedArr[i]} ")
    }



    squiggle();
    //Question 4: Kotlin program to multiply two matrices using multidimensional arrays
    var m1 = arrayOf(
        arrayOf(1,1,1,1),
        arrayOf(0,1,0,1)
    );

    var m2 = arrayOf(0,0,0,0);

    for(i in 0..m1[1].size - 1)
    {
        m2[i] = m1[0][i] * m1[1][i];
    }

    println();

    println("\nMultiplied multidimensional array:");

    for(i in 0..m1[0].size - 1)
    {
        print("${m1[0][i]} ");
    }
    println();
    for(i in 0..m1[0].size - 1)
    {
        print("${m1[1][i]} ");
    }
    println();

    for(i in 0..m2.size - 1)
    {
        print("${m2[i]} ");
    }

    squiggle();
    //Question 7: Convert decimal to binary using functions
    println();
    println("Input a number to convert to binary:");

    var userInput = scan.nextLine().toDouble();
    var binarize = {num : Double ->
        println(num.toBits());
    }

    binarize(userInput);



    //Question 8: Find the distance between two points on a map (not linearly [Latitude/Longitude]
    //Google uses Djick's algorithm (node search) and a*
    //haversine formula (great-circle distance)

    //-------------------------------------------
    /*
    squiggle();
    println("Input latitude 1:");
    var lat1 = scan.nextLine();
    println("Input longitude 1:");
    var lon1 = scan.nextLine();

    println("input latitude 2:");
    var lat2 = scan.nextLine();
    println("Input longitude 2:");
    var lon2 = scan.nextLine();

    val eRadius = 6371E3;
    var p1 = lat1.toDouble() * (Math.PI).toInt().toDouble();

    println(p1.toString());
    */
    //------------------------------------------

    //Question 9: Take input of a String and spellcheck it against a dictionary (suggest a word)
    fun spellCheck(x : String) : Boolean
    {
            val cat = "cat";
            val dog = "dog";
            val bat = "rat";
            if (x.length != 3) {
                println("That word was too long!");
            }

            else
            {
                    if(x.lowercase().contains("ca") && x!= "cat")
                    {
                           println("Did you mean cat?")
                    }
            }
    }

    var run = true;


    while(run)
    {
        println("I'm thinking of an animal species that is 3 letters long, furry, and a quadruped. What am I?");
        var input: String = scan.nextLine();
        if(input == "cat" || input == "rat" || input == "dog")
        {
            println("You guessed it!");
            break;
        }

    }
    /*
    //higher order one

    var lmb = { a: Int, b: Int -> a + b}

    fun highMuncher(lmb : (Int, Int) -> Int) : Int
    {
        val a = lmb(2,5);
        return a;
    }

    println(highMuncher(lmb));//outputs 7
    */
    //::maps a normal function to a lambda //passes the reference hof(::addition) not the output of the function
    //I DID IT!!!

    /*
    val lambdaTest = {a : String -> println(a)}

    7,8,9,10(lunch)11,12,1,2,3

    lambdaTest("\t...test");

    val concatenate = fun(num1 : Int, num2 : Int) : String
    {
        return "${num1}${num2}";
    }


    println("The Integer below was made by concatenating 1 and 3:");
    println(concatenate(1,3));

    println(println(println()));
    */
    /*
    val smoochies = {num : Int ->

        for(i in 1..(num))
        {
            print("Chu~💋");
        }
    }

    println("How many smoochies do you want? uwu");

    var scan = Scanner(System.`in`);
    var userInput = scan.nextInt();


    smoochies(userInput);
    */
    /*
    //this demonstrates default values
    fun eat(food : String = "food")
    {
        println("I'm eating ${food}!");
    }
    eat();
    eat("bananas");
    eat("kale");


    fun insertStudentDetails(name: String = "Missing Name", id : Int = 1111 , grade : Char = 'F', age : Int = 18, dob : LocalDate = LocalDate.parse("2000-01-01")) : Boolean
    {
        println();
        println("Student Details:");
        println("Student ID: ${id}");
        println("Student ID: ${name}")
        println("Student ID: ${grade}")
        println("Student ID: ${age}")
        println("Student ID: ${dob}")
        println();
        return true;
    }

    var names = arrayOf("Becky", "Rebecca", "Alexandria");
    var grades = arrayOf('S', 'D', 'A');
    var ages = arrayOf(21,24,22);
    var dobs = arrayOf("2001-05-02", "1888-05-02", "2000-05-02");
    var ids = arrayOf(1234, 5678, 8910);

    for(i in 0..2)
    {
        insertStudentDetails(names[i], ids[i],grades[i],ages[i],LocalDate.parse(dobs[i]));
    }

    insertStudentDetails();
    */

    /*
    fun mult(x : Double, y : Double) : Double
    {
        return (x * y)
    }

    var randomDouble = mult(3.451, 5342.5);

    println(randomDouble);
    */
    /*
    fun sumIntegers(x : Int, y : Int) : Int
    {
        val c = x + y;
        return c;
    }

    val ten = sumIntegers(5,5);

    println(ten);
    */
    /*
    fun returnTwelve() : Int
    {
        return 12;
    }

    val x = returnTwelve();
    println(x);
    */
}