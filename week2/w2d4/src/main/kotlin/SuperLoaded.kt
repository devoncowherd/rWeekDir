class SuperLoaded
{
    //this is actually all overriding since the methods have the same internal method names and attributes as well as the same method name
    constructor(a : Boolean)
    {
        println(a);
    }

    constructor(a : Int)
    {
        println("Constructor 1: ${a}");
    }

    constructor(a : Int, b : Double)
    {
        println("Constructor 2: ${a} , ${b}");
    }

    constructor(a : Int, b : Double, c : String)
    {
        println("Constructor 3: ${a} , ${b}, ${c}");
    }
}