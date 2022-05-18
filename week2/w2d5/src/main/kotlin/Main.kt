import kotlin.math.*;

fun main(args : Array<String>)
{
    //doesn't work because it's abstract ---> var s1 = MySeal(); CANNOT MAKE AN OBJECT

    //indirectly accessing the seal by calling the nested classes
    val obj1 = Monitor.A();
    obj1.display();
    val obj2 = Monitor.B();
    obj2.display();
}


/*
fun main(args : Array<String>)
{
    println("...Script Loaded");

    var genericCar = Car();

    genericCar.start();
    genericCar.stop();
    genericCar.getLocation();
    println("${genericCar.maxSpeed},${genericCar.model},${genericCar.mpg},${genericCar.brand}");
    genericCar.bread();

    //very common data manipulation in Kotlin
    data class MyData(var name : String);

    var d1 = MyData("Snarfie");
    var d3 = MyData("Testterinoo")
    println(d1.toString());
    var d2 = d1.copy(name="reeEEE");
    var d4 = d1.copy();

    println("d1: ${d1.toString()} d2 ${d2.toString()}");

    var hash1 = d1.hashCode();
    var hash2 = d1.hashCode();
    var hash3 = d3.hashCode();
    println(hash1);
    println(hash2)
    println(hash3);
    println(hash1.equals(hash2));
    println(d1.equals(d4));
    println(d1.equals(d2));
    d1.name = "replaced";
    println(d1.name);
}
*/



// actual code:
// interfaces
// abstract class
// data class
// sealed class
// kotlin objects
// nested and inner classes


//sealed class
sealed class Monitor //can only have a bounded set of classes
{
    class A:Monitor()
    {
        fun display()
        {
            println("width: 1920, height: 1080");
        }

    }
    //implicitly abstract
    //fixed number of subclasses

    class B:Monitor()
    {
        fun display()
        {
            println("width: 2560, Height: 1440");
        }
    }


}


//interfaces can only implement only other interfaces
//You don't need to set it as open  - you can override the properties without declaring open
//D
abstract class Magstract
{
    abstract var fireMagic : String;
    abstract var iceMagic : String;
    abstract var electricMagic : String;
    abstract var iceMult : Double;
    abstract var fireMult : Double;
    abstract var electricMult : Double;

    abstract fun castFire(targetHealth : Double) : Double;
    abstract fun castIce(targetHealth : Double) : Double;
    abstract fun castElectricity(targetHealth : Double) : Double;
}

class Magic : Magstract()
{
    var baseMagicDmg = 30.0;
    override var fireMagic = "Fira";
    override var iceMagic = "Blizzra";
    override var electricMagic = "Thundara";
    override var iceMult = Math.random()2.5;
    override var fireMult = 3.5;
    override var electricMult = 4.5;

    override fun castFire(targetHealth : Double) : Double
    {
        var currentHealth = targetHealth;
        currentHealth = targetHealth - (baseMagicDmg)*(iceMult);
        return currentHealth;
    }
    override fun castIce(targetHealth : Double) : Double
    {
        var currentHealth = targetHealth;
        currentHealth = targetHealth - (baseMagicDmg)*(fireMult);
        return currentHealth;
    }
    override fun castElectricity(targetHealth : Double) : Double
    {
        var currentHealth = targetHealth;
        currentHealth = targetHealth - (baseMagicDmg)*(electricMult);
        return currentHealth;
    }
}
/*
The below is not failing?
=========================
class TestSeal: Monitor()
{
    class Subclass : Monitor()
    {

    }
}

 */