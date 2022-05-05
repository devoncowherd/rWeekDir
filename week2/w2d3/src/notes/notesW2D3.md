# Notes W2D3 

---

### Functions Intro

---

- Functions are reusable blocks of code that are used to complete specific programmatic tasks
- The return type is placed right before the curly braces, and it must match the return type.
- Standard Library Functions: `println()`,`readLine()`,`sqrt()`,`toChar()`;
- *Meta Note: Code Tetris for Mother's Day*

---

### Function Arguments

---

1. Default Arguments - You can declare a default value if you don't have one while declaring a method
     - You can leave some default while others aren't which will require you to add some sort of input (the keywords must match if you attempt to declare it within the argument parenthesis)
     - You cannot mix named and unnamed argument - BEST PRACTICE = *put the named arguments at the end of the function parameter declarations!*
> `fun shareLocation(location : String = "Default Location");
> {
>   println("My current location is ${a}");
> }
> shareLocation(); //prints "Default Location" since no value is passed`
2. Named Arguments

---

### Types

---

1. Lambda Expressions

> `val name : data_type = {arg_list -> // code block}`
> `val myOp = { println("MyOutput"}`
> `MyOp();`
> `val sum = {a : Int, b : Int -> a + b}`

- In the block above, we see a lambda; you can see that the arguments are listed first like in a regular function, but after the arguments, there's an arrow where the block of code is declared
- Variables set to lambda expressions cannot be overloaded
- Benefits: short code, can be inline;

3. Anonymous Functions
    
- functions that do not have names are anonymous
- example:
> `fun(){//some code}`
- How do we call it if there's no name?
- Why would we call an anonymous functions? Higher order functions!

4. Inline Functions

- Makes the compiler place the code inside a function. It uses less memory

> //the below will not be find in the compiler code
>`inline fun higherSum(a : Int, b : Int)
> {
>   //some code
> }`

- *Meta Note: For QC, study this*
- *Meta Note: Unit is a data type like void (returns nothing)*

5. Lambda vs Anon

- `return` in a lambda belongs to the calling (nested) function, but return belongs to the anon function itself

6. Higher Order Functions

- Higher order functions take functions as arguments or output functions themselves

- *Meta Notes: Practice: hackerrank aand leetcode*
