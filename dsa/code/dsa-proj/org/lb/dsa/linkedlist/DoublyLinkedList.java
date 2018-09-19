package org.lb.dsa.linkedlist;

public class DoublyLinkedList {
    private DLLNode head;

    public DoublyLinkedList() {

    }

    public DLLNode getHead() {
        return this.head;
    }

    public void setHead(DLLNode node) {
        this.head = node;
    }

    // Returns the length of the DoublyLinkedList
    public int length() {
        int length = 0;
        DLLNode temp = head;
        while(temp != null) {
            length++;
            temp = temp.getNext();
        }
        return length;
    }

    // Returns a String representation of the DoublyLinkedList
    public String toString() {
        String dll = "";
        DLLNode temp = head;
        while(temp != null) {
            dll = dll + temp + " ";
            temp = temp.getNext();
        }
        return dll.toString();
    }

    // Prints the elements of the DoublyLinkedList
    public void print() {

    }

    // Gets the node at a given position
    public DLLNode get(int position) {
        //TODO
        return null;
    }

    // Gets the position of the first node containing the given data
    public DLLNode getPosition(int data) {
        //TODO
        return null;
    }

    // Gets the position of the first node matching the given node
    public DLLNode getNodePosition(DLLNode node) {
        //TODO
        return null;
    }

    public void insertAtTheBeginning(DLLNode node) {

    }

    public void insertAtAGivenPosition(DLLNode node, int position) {

    }

    public void insertAtTheEnd(DLLNode node) {

    }

    public void removeFromTheBeginning() {

    }

    public void removeAtTheEnd() {

    }

    public void removeAtAGivenPosition(int position) {

    }

    public void removeMatchedNode(DLLNode node) {

    }

    public void clearList() {

    }
}
