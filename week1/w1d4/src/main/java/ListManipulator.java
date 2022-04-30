/*
package src.main.java;

//Ted's ListNode 
public class ListManipulator<T>
{
    Node head;

    public ListManipulator()
    {
        head = null;
    }


    public void addToFront(T front)
    {
        Node newNode = new Node();
        newNode.setNext(head);
        head = newNode;
        System.out.println("Added node " + front + " to front");
    }

    public void removeFromFront()
    {
        if(head != null)
        {
            head = head.getNext();
        }
    }

    public T getIndex(int n)
    {
        Node current = head;
        for(int i = 0; i < n; i++)
        {
            current = current.getNext();
        }
        return (T) current.getData();
    }

    public void removeIndex(int n)
    {
        Node current = head;
        Node prev = null;

        for(int i = 0; i < n; i++)
        {
            prev = current;
            current = current.getNext();
        }
        //The garbage collector will automatically remove the null node
        prev.setNext(current.getNext());
    }

    public String toString()
    {
        String out = "";
        Node current = head;
        while(current!= null)
        {
            out = out + current.toString() + ", ";
            current = current.getNext();
        }
        return out;
    }
}
*/