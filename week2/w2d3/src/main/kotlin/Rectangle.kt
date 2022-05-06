class Rectangle(pointOne : Int, pointTwo : Int, pointThree : Int, pointFour : Int)
{
    var x1 = pointOne;
    var x2  = pointTwo;
    var y1 = pointThree;
    var y2 = pointFour;

    fun checkCollision(rect1 : Rectangle, rect2 : Rectangle) : Boolean
    {
        var collision : Boolean;

        if(rect1.x1 >= rect2.x1 && rect1.x1 <= rect2.x2 && rect1.y1 <= rect2.y1 && rect1.y1 >= rect2.y2)
        {
            collision = true;
            return collision;
        }
        else if(rect1.x2 >= rect2.x1 && rect1.x2 <= rect2.x2 && rect1.y2 <= rect2.y1 && rect1.y2 >= rect2.y2)
        {
            collision = true;
            return collision;
        }
        else
        {
            collision = false;
            return collision;
        }
    }
}