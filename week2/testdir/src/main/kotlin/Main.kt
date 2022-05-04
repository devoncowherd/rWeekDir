fun main()
{
    println("...Script Loaded");

    val a = 25.00;
    val b = 36.00;
    var c = 0.00;
    var label = "";

    fun printer(c : Double, label : String)
    {
        println(label + c);
    }

    c = a.div(b);
    label = "a / b = "

    printer(c, label);

    c = a.plus(b);
    label = "a + b = ";

    printer(c, label);

    c = a.times(b);
    label = "a * b = ";

    printer(c, label)

    System.out.println("What are a and b?");
}