package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}

/**
 * A double linked list (DLL).
 * Used by class {@link IntLinkedList}
 * @see #value
 * @see #prev
 * @see #next
 */
class Node {
    /**
     * Values that the node holds.
     */
    private final int value;
    /**
     * Previous node in DLL.
     */
    private Node prev;
    /**
     * Next node in DLL.
     */
    private Node next;

    /**
     * Constructor of this class, takes a value as a parameter.
     * @param i
     */
    public Node(int i) {
        value = i;
    }

    /**
     * @return Value that the Node holds.
     */
    public int getValue() {
        return value;
    }
    /**
     * @return Previous Node in the DLL.
     */
    public Node getPrev() {
        return prev;
    }
    /**
     * Links another Node as a previous Node.
     * @params prev
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    /**
     * @return Next Node in the DLL.
     */
    public Node getNext() {
        return next;
    }
    /**
     * Links another Node as a next Node.
     * @params prev
     */
    public void setNext(Node next) {
        this.next = next;
    }
}

