class Car : Vehicle, B, C
{
    override var brand = "default";
    override var model = "default";
    override var mpg = 0.0;
    override var maxSpeed = 0;

    //implementing the interface methods
    override fun start()
    {
        println("~brr-brrr~");
    }

    override fun stop()
    {
        println("~putter-putter~");
    }

    override fun getLocation()
    {
        println("In these streets!");
    }

    override fun hello()
    {
        //calls only B
        //super<B>.hello();
        //calls only A
        //both are here, so both are called and overridden
    }
    override fun bread()
    {
        println("hehe bread");
    }
}