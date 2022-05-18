//this guarantees we have the basic properties in the class we're developing
//best for the absolute

//interfaces, in the physical world, are how objects essentially interact with users and their environment

//interfaces cannot inherit classes - only vice versa
interface Vehicle
{
    //study getters and setters more
    //val name : String get() = "Tesla";

    var brand : String;
    var model : String;
    var mpg : Double;
    var maxSpeed : Int;


    //this signature is impossible in regular classes
    fun start();
    fun stop();
    fun getLocation();
}

//Kotlin getters and setters!
interface A
{
    fun hello()
    {
        println("ambiguityA");
    }
}

interface B
{
    fun hello()
    {
        println("AmbiguityB");
    }
}

interface C : A
{
    fun bread();

}