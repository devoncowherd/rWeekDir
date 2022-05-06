fun main(args : Array<String>)
{

    //Question 1: write a program to print the area and perimeter of a triangle having sides of 3,4, and 5
    //units by creating a class named Triangle without any perimeter
    var basic = Shape(5.0,6.0);

    println("Basic Height: ${basic.hei}\nBasic Width: ${basic.wid}");

    var tri1 = Triangle(3.toDouble(),4.toDouble(),5.toDouble());

    println("The perimeter with leg lengths 3,4, and 5 is ${tri1.getPerimeter()}. The area is ${tri1.getArea()}");
    //Question 2: Kotlin progress to add two complex numbers by passing class to a function
    //create a class ComplexNumber - 2 objects for the class - pass that to a function that return the sum
    // create some fun in the class - that does arithmetic operations on complex numbers


    var comAdder = ComplexNumber();

    var result = comAdder.addComplex("25i","14i");


    println("The sum of 25i and 14i is ${result}");

    //Question 3: Create a class Car
    //With arg car name, car model, and price, create 3 car objects assign them different values
    // pass array of objects to a function that will calculate the total price of all the 3 cars


    var tesla = Car("Tesla", "Y",50000.00);
    var f150 = Car("Ford","F-150", 35000.00);
    var vw = Car("Volkswagon", "Beetle", 30000.00);

    var carArray = arrayOf(tesla,f150,vw);

    fun getCarFacts(arr : Array<Car>)
    {
        for(i in 0..carArray.size - 1)
        {
            println("The price of ${carArray[i].name1} is ${carArray[i].price1}");
        }
    }


    getCarFacts(carArray);

    //Question 4:
    //Implement tree data type
    //Have a class called tree / binary tree
    //Methods to create tree, insert element, search element (BST - Binary Search Tree)
    // In-order traversal, pre-order traversal, and post-order traversal



    //Question 5:
    //Implement hash table data type
    //Create hash table, insert, and handle collisions

    //Question 6: //Create a Calculator - any number of args -  add, sub, mul, div, mod
    // you should be able to mix arthmetic operations



    //Question 7: Create a class named -  "Arithmetic" - add(a,b) function returns sum
    //  class Adder --> child class of Arithmetic ( "Adder" inherits Arithmetic )
    //classes are not public -- ?
    // child (Adder) to override the Add of parent - square the result of parent and print it

    //Question 8:
    // Create a School - with all the necessary different classes thats needed to construct a school if possible bring in the relationships
    // School, Teacher, Student, Subject

}

    //each object occupies its own space in memory that does not intersect with other objects unless manually set

    //1. Create a class with at least a variable and/or a function
    //2. Create an object
    //3. Access the variables and functions using dot notation at the appropriate time
/*
    var car1 = Car();

    var tesla = Car("Tesla", 200, "White", 405);


    car1.specs();
    tesla.specs();

    tesla.maxSpeed = 300;
    tesla.specs();

    var load1 = SuperLoaded(5);
    var load2 = SuperLoaded(5, 55.55);
    var load3 = SuperLoaded(5, 55.55, "AYAYA");
    var load4 = SuperLoaded(true);

    var dude = Children();

    dude.getName("Cowherd");

    var steveJobs = CEO("Steve Jobs", 1234, 1.00);


    var yepper = YepTwo();


    yepper.shareYep();
*/
    //this won't work because it's in a different file, but this can work within te the same file
    //var nope = Nope();








//OOP

//Signature? = Syntax
//keyboard class ClassName