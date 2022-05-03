---

Intro - 10 Commandments of Programming
-

---

Arrays
-

---

- AYAYA

---

Conditional Statements
-

---

- Flow Control
- If/Else
- Dependin on the conditions, different decisions will be made
- Loops (ex. You need the alarm every morning - until your schedule changes, at which point you will exit the loop)
- While(alive){eat()}
- while(), for(), do{}while(), if(), else()

---

Numbers
-

---

- Primitive types
- Mathematical objects

---

Functions
-

---

- A functions is a reusable small block of code that can be used to solve a problem.


---

Syntax
-

---

`fun sum(a: Int, b: Int) Int`
`{`
`   return a + b`
`}`

- Kotlin was built atop Java
- Should save us countless lines of code and thusly time
- Software is all about solving a real world problem

---

Object Oriented Programming (OOP)
-

---

- Kotlin is an OOP
- Encapsulization
- Polymorphism
- Inheritance
- Arranging Objects (Store/Retrieve [book store analogy])
- Think file systems

---

Data Structures

---

- Queue
- Stack
- Tree
- LinkedList
- Nodes
- Arrays
- Database = stored in persistent memory
- Data Structure = stored in temporary memory

---

Testing
- 

---

---

IO
-

---


-

---

jetbrains vs android studio

Ultimate Goal
-

- MAKE APPS!
- Frontend and Backend
- Potential iOS in the future

---

Kotlin
-

---

- What is Kotlin?
   - Kotlin is a programming language that is built for efficiency and speed! It is built atop Java
- Kotlin, like all languages, needs an environment to run in
     - Java Runtime Environment(JRE), JVM(Java Virtual Machine), JDK(Java Development Kit)
- Kotlin takes a Mobile-First approach
- Kotlin is a multiplatform language since Java is the base - EVEN MAC OS


---

10 Commandments of Programming Summary
-

1. Data Types
2. Conditionals
3. Control Structure and Loops
4. Functions
5. OOP
6. Imports and Exports (I/O)
7. File Systems
8. Data Structure
9. Database
10. Testing


---

Math Refresher
-

---

- Values:
     - Bit = 1
     - Byte = 8 bits (max 256 units)
     - int = 32 bits
     - long = 64 bits
     - **Keep these values in mind for effective programming! Try your best not to store values or encounter exceptions by using the appropriate types!**
- Unicode integrates multiple languages

---

Typing - Mutable vs Immutable - Operators
-

---

- Pure Functions {} The insides cannot be changed
     - If the state is immutable, it is extremely useful since in mobile apps it is important to always know the state
     - Root Cause Analysis - When debugging app-hang, for instance, it would be much easier to find immutable functions and values
     - Val is immutable / Var is mutable
- Nullable types must be declared explicitly. This is a way Kotlin avoids file exceptions
- Operators:
     - Arithmetic (%,-,+,*,**)
     - Relation
     - Assignment
     - Unary
     - Logical Operator 
     - Bitwise

*Think of programming as a normal language)*

*Modulo is EXTREMELY useful! It perfectly bounds object, hashing, and gaming(collisions)*

- Short circuit = 0 && 0 = 0 < first input checked as false, so there's no point in checking the second condition>

- || table

- bitwise - Learn this later today
- Bitwise is useful for reducing memory usage
- Refactor = simplifyig code and making it more elegant