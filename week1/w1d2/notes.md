NOTES
-

---

4/26:
-

- Introduction to Java
- First java program
- JVM, JRE, JDK
- methods and parameters
- method overloading and overriding
- File I/O
- Exceptions
- Control flow (while, if)
- Primitive types / first objects
- Intro to Git (clone, init, add, commit, push, pull)

---

4/27:
-

- Objects,
- Memory (pass-by-reference)
- Arrays
- Control flow (for loops, do while)
- Access modifiers (like public, private, default,protected)
- Packages
- Try/catch
- Method return types
- Static keyword
- Constructors
- 'this' keyword

Prompt:


>What if you made a method that appends a single character, but when the array runs out of space, you double
the size of that array?
What's the process?
method->
before checking, verify if there is space
how do we do that? check if the current number of characters is less that the amount of space in the array
(using something like my length variable in 'word')
if there is space, great, add the character and increment length
if not, you'll have to double the length of the array:
meaning, create an array of 2x the length, and copy the elements of the old array over
and then append the character and increment length