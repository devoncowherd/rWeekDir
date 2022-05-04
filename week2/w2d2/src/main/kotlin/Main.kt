import java.util.Scanner;
import kotlin.math.roundToInt;

//draws a funny squiggle
fun squiggle(y : String)
{
        var length = y.length -1;
        for(i in 1..length)
        {
                print("~");
        }
        println();
}

//multiplies two numbers
fun multiply(a : Double, b : Double) : Double
{
        var c = a * b;
        return c;
}

//adds two Integers
fun add(a : Int, b : Int) : Int
{
        var c = b + a;
        return c;
}


//gets ASCII values based on the integer a user inputs
fun getASCII(a : Int)
{
        var character = a.toChar();
        println("${character}");
}

//Main Program
fun main(args : Array<String>)
{
        var scan = Scanner(System.`in`);
        //Question 1: skipped
        //Question 2: n = 10, get factorial n\
        var fact10 = 1;
        for(i in 1..10)
        {
                fact10 *= i;
        }
        println("Factorial 10 when complete is: ${fact10}");

        //Question 3: Generate a multiplication table using for loops (1-10)

        squiggle("///////////////////////")
        println("\nMultiplication Table:")
        var result : Int;
        for(i in 1..10)
        {
                result = i * i;
                println("${i} X ${i} = ${result}");
        }



        //Question 4: Display Fibbnacci series to 100
        var n = 0;

        fun doFib(n : Int) : Int
        {
                var current = (n - 1) + (n - 2)
                return current;
        }

        for(i in 1..100)
        {
                n = doFib(i);
                if(n > 1 && n <= 100)
                {
                        println(n);
                }
                else if(n >=99)
                {
                        break;
                }
        }
        //Question 5: Print 1 2 3 6 4 2 0 using a for loop

        val dineshArray = arrayOf(1,2,3,6,4,2,0);
        print("Dinesh Array: ");
        for(num in dineshArray)
        {
                print(" ${num}");
        }

        //Question 6: Find the largest element in an array [Use the following elements in the array  [(23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5)]


        println("\nLet's find the largest of the following: 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5");
        val largestArray = arrayOf(23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5)

        var temp = 0.00;
        for(num in largestArray)
        {
                println("\t...scanning");
                if(temp < num)
                {
                        temp = num;
                        println("New Largest: ${temp}");
                }
        }
        println("The absolute largest num = ${temp}");

        //Calculate the average using an array (45.3, 67.5, -45.6, 20.34, 33.0, 45.6)

        var avgArray = arrayOf(45.3, 67.5, -45.6, 20.34, 33.0, 45.6);

        var elements = 0.00;
        var sum = 0.00;
        for(i in avgArray)
        {
                ++elements;
                sum = sum + i;
        }

        var avg : Double;
        avg = (sum)/(elements);
        avg = avg.roundToInt().toDouble();

        println("The average of 45.3, 67.5, -45.6, 20.34, 33.0, and 45.6 is ${avg}");

        //Exercise 8:Print ASCII values and their equivalent characters. ASCII value vary from 0 to 255.

        var run = true;
        while(run)
        {
                println("Input an integer to get the ASCII character or input exit to close the program");
                var userInput = scan.nextLine();

                if(userInput.toInt() is Int)
                {
                        println(getASCII(userInput.toInt()))
                }
                else
                {
                     if(userInput == "exit")
                     {
                             run = false;
                     }
                     else
                     {
                        println("Enter exit or an integer");
                     }
                }
        }

        /*
        var scan = Scanner(System.`in`);

        println("Enter 5 numbers to add together:");

        var myArray = Array<Int>(5){scan.nextInt()};
        var total = 0;

        for(num in myArray)
        {
                total += num;
        }

        var result = "The total from all the numbers you enetered is: ${total}";

        squiggle(result);
        println(result);
        squiggle(result);

        */
        //stack overflow = ran out of memory
        /*
        //Stream Open
        var scan = Scanner(System.`in`);
        var a : Int;
        var b : Int = 0;
        var init = false

        val instructions = "Starting from 0, add Integer values until you reach 20!"
        squiggle(instructions);
        println(instructions);
        squiggle(instructions);
        while(b < 20)
        {

                try {

                        if (!init) {
                                init = true;
                                println("Start adding!");
                        }
                        else
                        {
                                println("...We're not quite there!\nCurrent Total:${b}");
                                a = scan.nextInt();
                                b = add(a, b);
                        }
                }
                catch(e : Exception)
                {
                        println("Error: ${e}\nPlease ensure you're inputting integers!\n\t...resetting counter to 0\nEnter a new input below:");
                        b = 0;
                }
        }

        println("Final Total: ${b}");


        */
        //my myIntArr - Array<Int>(5){readLine().toInt()}


        /*
        println("...Script Loaded!");

        var num1 = 0.00;
        var num2 = 0.00;
        val instructions = "Enter any two numbers you'd like to multiply.\nEnter \"exit\" without the quotation marks to end the program.";
        var run = true;

        var userInput = readLine();

        while(run)
        {
                println(instructions)
                if(userInput == "exit")
                {
                        println("...Closing App");
                        run = false;
                }
                else
                {
                        try
                        {
                                println("Enter the first number:");
                                num1 = (readLine()).toDouble();
                                num2 = (readLine()).toDouble();
                        }
                        catch(e : Exception)
                        {
                                e.printStackTrace();
                        }
                }
        }
        */
    /*
    var myStr = "This isn't nullable";
    var nullableStr : String? = "This is nullabe";

    myStr = "This can only be set to a new String";
    nullableStr = null;

    println("String One: ${myStr}\nString Two: ${nullableStr}");
    */
    /*
    var exists = false;
    var myArray = arrayOf(1, 2, 7, 2, 60, 23)
    var b = 7;

    fun checkArray(b: Int)
    {
        for((index,value) in myArray.withIndex()) {
            if (b == value) {
                exists = true;
                print("${b} was found within myArray at index ${index}")
                break;
            }
            else
            {
                exists = false;
            }
        }
        if(!exists)
        {
            println("${b} was not found in myArray");
        }
    }

    checkArray(b);

    */

    //Time Complexity
    //Collections (Arrays, Lists)
    //String
    //Array - O(1) - finite - contiguous memory - index[] - simplest data structure - Arrays must be of the same element in order to guarantee that the memory necessary fits within the array
    //

    /*
    fun countEven()
    {
        for (i in 0..10 step 2)
        {
            println("Even: ${i}");
        }
    }

    fun countOdd()
    {
        for(i in 0..10 step 2)
        {
            println("Odd: ${i + 1}");
        }
    }

    var kWoman = arrayOf("Kelsey", "Kaley", "karen", "Kiara! ", "Kaia!", "Krystal");

    //you may use multiple variables
    for(k in kWoman)
    {
        println(k);

    }

    val permArray = arrayOf(1,2,3,4,5,6,7,8,9,10);

    //index and value can't escape the 420 no scope
    for((index,value) in permArray.withIndex())
    {
        println("Index:${index} , Value:${value}");
    }

    val name = "Devon";

    for(letter in name)
    {
        print(letter + "\t");
    }
    println("");
    countEven();
    countOdd();

    var myList = listOf("String", 1,25.00,'a');

    for(item in myList)
    {
        print(item);
    }
    */
}