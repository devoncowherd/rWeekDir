class Triangle( legA : Double, legB : Double, base: Double, height: Double = 3.3, width: Double = 2.2) : Shape(height,width)
{
    var base1 = base;
    var leg1 = legA;
    var leg2 = legB;

    fun getPerimeter() : Double
    {
        return leg1 + leg2 + base1;
    }

    fun getArea() : Double
    {
        return ((super.hei * base1)/2);
    }
}