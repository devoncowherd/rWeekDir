//Devon Cowherd
//
fun main() 
{
    
    //Question 1:
 	//Question 2:
    fun checkEven(a : Int)
    {
        if(a%2 == 0)
        {
            println("a is even");
        }
        else
        {
            println("a is odd");
        }
    }
    
    var a = 10;
    checkEven(a);
    
    a = 7;   
    checkEven(a);
    
    //Question 3:
    
    val two = 2;
    val three = 3;
    val five = 5;
    val input = 3432
    
    fun checkDivisible(value : Int)
    {
        if(value % two == 0 && value % three == 0 && value % five == 0)
        {
            println("${input} is divisible by two, three, five");
        }
        else
        {
          println("${input} is not divisible by two, three, five");
        }
    }
    
    checkDivisible(input);
    
    
    //Question 4:
    a = 5324
    
    fun checkThreeFive(check : Int)
    {
        if(check % 2 == 0 && check % 3 == 0 || check % 5 == 0)
        {
            println("A is even or divisible by 3 or 5")
        }
        else
        {
    		println("A is even or divisible by 3 or 5")
        }        
    }
    
    
    checkThreeFive(a);
    
    
    //Question 5:
    
    val e = 30;
    val f = 20;
    val g = 50;
    
    if(e > f && e > g)
    {
        println("e is the largest");
    }
    else if(f > e && f > g)
    {
        println("f is the largest");
    }
    else 
    {
        println("g is the largest");
    }
    
    //Question 6:
    //
    
    a = 99;
    
    if(a < 10)
    {
     	println("a is smaller than 10");
    }
    else if(a < 20)
    {
     println("a is smaller than 10");
    }
     else if(a < 30)
    {
     println("a is smaller than 30");
    }
     else if(a < 40)
    {
     println("a is smaller than 40");
    }
     else if(a < 50)
    {
     println("a is smaller than 50");
    }else
    {
        println("a is smaller than 100")
    }
    
    /*
    var a = -5
	var x = 1;
    var b = 0;
    
    var result = if(x < a || x > 0)
    {
        println("X is either greater than a or less than 0.");	        

        if(x > b && x==1)
        {
                    
            println("x is greater than b and therefore equal to 1.");

        }
        else if(x == 1000)
        {
            println("There's no way that happened...");
        }
        else
        {
            println("You did something wrong...");
        }
        
    }
    else
    {
        println("You did something wrong...");
    }
    */

  
}