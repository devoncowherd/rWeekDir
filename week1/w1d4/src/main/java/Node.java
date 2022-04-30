package src.main.java;

//Generic Linked List Object
//Ted's ListNode 

public class Node<T>
{
    //this means we must call the superclass in order to store and retrieve data
    private T data;
    private Node next;

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public String toString()
    {
        return data.toString();    
    }
}