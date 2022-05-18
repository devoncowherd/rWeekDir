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