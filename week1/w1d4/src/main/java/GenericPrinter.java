package src.main.java;

public class GenericPrinter<T> 
{
    T data;

    public void print(T data)
    {
        this.data = data;
        System.out.println(data);
    }
}
