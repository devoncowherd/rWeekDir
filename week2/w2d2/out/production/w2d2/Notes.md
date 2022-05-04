
# Notes - W2D2

---

### Null Safety

- You cannot redeclare variables as null once you've set the type unless you use a question mark after the type declaration
>`var redeclare : String? = "Tacos"; 
 redeclare = null; //this works, but if ? wasn't there, it wouldn't`
- This is important to declare when you would like something to be declared as null which prevents a null exception

---

### Testing

- Boundary Condition Analysis (upper and lower limits)
- Automated Testing
- Solve by method of induction (start for null, test for 1, and then test for k (or r); therefore, it will work for n cases)
- Induction Cases:
     - You've got a textbox, and the user doesn't input anything (error thrown)
     - The user now inputs on input
     - The user inputs any number of inputs greater than one
     - *Meta Note: Review Induction*

---

### QC (Next Week)

---

- Java (secondary focus)
- Kotlin (primary focus)