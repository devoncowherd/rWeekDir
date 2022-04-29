package src.main.java;
import java.util.LinkedList;

//Linked List Object
public class Node<T>
{
    T data;
    Node next;

    public Node(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }

    

}