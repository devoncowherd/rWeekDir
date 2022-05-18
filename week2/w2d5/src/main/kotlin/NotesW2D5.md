# Notes W2D5

---

### Interfaces

---

- Signature (Syntax)

> `Interface Interfacename 
 {
   //abstract property
   //abstract methods
   //default property and method
 }`

- class **inherits** - interface **implements**
- For **classes**, you must **implement and initialize** the properties and methods
- For **interfaces**, you may declare but not initialize them
- *Meta Note: GET THOSE GETTERS AND SETTERS DOWN FOR INTERFACES*

---

Data Classes
-

---

- Whenever you want to store data, you create a data class
- (similar to model class)
- Data classes give you the following set of functions:
     - `toString(); //turns the whole class and its arguments into a string`
     - `copy();`
     - `equals();`
     - `hashCode();`
- *Meta Note: `copy()` replaces deepcopy*

>` data class ClassName (val name)
 {
    //copy
 }`
- Even identical hashes are allocated different memory at the use of `copy()`

---

### Sealed Class

--- 

- Implicitly Abstract
- Has a bounded number of subclasses (a set of subclasses)
- *Meta Note: Abstract = cannot be instantiated*
- Sealed classes cannot be extended(inherited from)
- Sealed class subclasses can be inherited from

---

### Abstract Classes

---

- Very similar to other classes
- May be extended/ overridden without the open keyword
- You cannot create an abstract child object
- Has no implementation
- Parent class will be in the child class when you make an obj

---

### Singleton

---

- Singletons are a class that can only have one object/instance

> `object Test 
 {
    var a: Int = 0;
    var b: Int = 1;
    fun sum() : Int {return a+b}//returns 1
 }`
- This is quite similar to JSON in that there's only one instance of this object
- Meta Note: Project Idea - 

---

### App Development

---
- Begin...UML = Unified Modeling Language
- Getting Requirements
- SOTA! State-of-the-art analysis (compare to existing and successful apps)
- Identify Entities
- User Journey Mapping
- AS-IS[existing] vs TO-BE [suggestions] (Redefine the flow/journey)
- UI/UX - Figma, Adobe Xd, Sketch (Design Team)
- **DEVELOPMENT TEAM STARTS - BACKEND**
- Look at all the jouerneys, UX, Forms
- Step 1 = ER (Entity Relationship) Diagram (backend database)
- Identifying API endpoints (i.e. accesing menu data, login data, etc) functionality that goes inside the list
- Decide design pattern (MVC,MVP, MVVM, MVI) [architecture of the app]
- OOP 

---

- food ordering app
- note/scheduling app
- alarm app


---

Entity   - Class
Property – Member Variables
Functions - Member Function
Relationships - Inheritance
One class needs other - Dependency Injection (whenever one class contains another class)

---

Hyperskill Challenge

--- 

Making coffee
Medium 2 minutes
5054 users solved this stage. Latest completion was about 1 hour ago.
0 / 5 Prerequisites
Computer programming
Introduction to Kotlin
Basic literals
Overview of the basic program
Standard output
Description

Let's start with a program that makes you a coffee – virtual coffee, of course. But in this project, you will implement functionality that simulates a real coffee machine. It can run out of milk, it can run out of coffee beans, it can make different varieties of coffee, and it can take the money for making a coffee.

The first version of the program just makes you a coffee. It prints to the standard output what it is doing as it makes a coffee.
Output example

Using the "Hello, World!" program, write the program that prints all lines as in the example below.

Starting to make a coffee
Grinding coffee beans
Boiling water
Mixing boiled water with crushed coffee beans
Pouring coffee into the cup
Pouring some milk into the cup
Coffee is ready!