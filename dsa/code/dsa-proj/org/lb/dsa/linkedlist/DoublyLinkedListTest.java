package org.lb.dsa.linkedlist;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        //testLength();
        testToString();
    }

    public static void testLength() {

        System.out.println("Testing the length() method...");
        DLLNode first = new DLLNode(4);
        DLLNode second = new DLLNode(7);
        DLLNode third = new DLLNode(91);
        DLLNode fourth = new DLLNode(21);
        DLLNode fifth = new DLLNode(18);

        first.setNext(second);
        first.setPrev(null);
        second.setNext(third);
        second.setPrev(first);
        third.setNext(fourth);
        third.setPrev(second);
        fourth.setNext(fifth);
        fourth.setPrev(third);
        fifth.setNext(null);
        fifth.setPrev(fourth);

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.setHead(first);

        System.out.println("Length: " + dll.length());
        //dll.print();
    }

    public static void testToString() {
        System.out.println("Testing the toString() method");
        DLLNode first = new DLLNode(4);
        DLLNode second = new DLLNode(7);
        DLLNode third = new DLLNode(91);
        DLLNode fourth = new DLLNode(21);
        DLLNode fifth = new DLLNode(18);

        first.setNext(second);
        first.setPrev(null);
        second.setNext(third);
        second.setPrev(first);
        third.setNext(fourth);
        third.setPrev(second);
        fourth.setNext(fifth);
        fourth.setPrev(third);
        fifth.setNext(null);
        fifth.setPrev(fourth);

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.setHead(first);
        String dllString = dll.toString();
        System.out.println("Printing the String form of dll: " + dllString);
    }

    public static void testPrint() {

    }

    public static void testGet() {

    }

    public static void testGetPosition() {

    }

    public static void testGetNodePosition() {

    }

    public static void testInsertAtTheBeginning() {

    }

    public static void testInsertAtAGivenPosition() {

    }

    public static void testInsertAtTheEnd() {

    }

    public static void testRemoveFromTheBeginning() {

    }

    public static void testRemoveAtTheEnd() {

    }

    public static void testRemoveAtAGivenPosition() {

    }

    public static void testRemoveMatchedNode() {

    }
}
