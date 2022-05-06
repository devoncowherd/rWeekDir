class ComplexNumber
{
    fun addComplex(com1 : String, com2 : String) : String
    {
        var temp1 = com1.dropLast(1);
        var temp2 = com2.dropLast(1);

        var num1 = temp1.toDouble();
        var num2 = temp2.toDouble();

        var result = ((num1 + num2).toString() + "i");
        return(result);
    }
}