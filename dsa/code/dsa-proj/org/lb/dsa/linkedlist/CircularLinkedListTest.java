package org.lb.dsa.linkedlist;

public class CircularLinkedListTest {
    public static void main(String[] args) {
        //testLength();
        //testToString();
        //testPrint();
        //testInsertAtTheBeginning();
        //testInsertAtTheEnd();
        //testRemoveFromTheBeginning();
        //testRemoveAtTheEnd();
        //testRemoveMatchingNode();
        testContains();
    }

    public static void testLength() {
        System.out.println("Testing the length() method...");
        CLLNode first = new CLLNode(4);
        CLLNode second = new CLLNode(7);
        CLLNode third = new CLLNode(91);
        CLLNode fourth = new CLLNode(21);
        CLLNode fifth = new CLLNode(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(first);

        CircularLinkedList cll = new CircularLinkedList();
        cll.setHead(first);

        System.out.println("Length of CLL: " + cll.length());
    }

    public static void testToString() {
        System.out.println("Testing the toString() method...");
        CLLNode first = new CLLNode(4);
        CLLNode second = new CLLNode(7);
        CLLNode third = new CLLNode(91);
        CLLNode fourth = new CLLNode(21);
        CLLNode fifth = new CLLNode(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(first);

        CircularLinkedList cll = new CircularLinkedList();
        cll.setHead(first);

        System.out.println("String rep of CLL: " + cll.toString());
    }

    public static void testPrint() {
        System.out.println("Testing the print() method...");
        CLLNode first = new CLLNode(4);
        CLLNode second = new CLLNode(7);
        CLLNode third = new CLLNode(91);
        CLLNode fourth = new CLLNode(21);
        CLLNode fifth = new CLLNode(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(first);

        CircularLinkedList cll = new CircularLinkedList();
        cll.setHead(first);
        System.out.println("Printing the CLL elements...");
        cll.print();
        System.out.println("");
    }

    public static void testInsertAtTheBeginning() {
        System.out.println(" Testing insertAtTheBeginning() method");

        CLLNode first = new CLLNode(4);
        CLLNode second = new CLLNode(7);
        CLLNode third = new CLLNode(91);
        CLLNode fourth = new CLLNode(21);
        CLLNode fifth = new CLLNode(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(first);

        CircularLinkedList cll = new CircularLinkedList();
        cll.setHead(first);
        System.out.println("Length of the CLL before insertion: " + cll.length());
        System.out.println("Printing the CLL elements before insertion...");
        cll.print();

        CLLNode newNode = new CLLNode(35);
        cll.insertAtTheBeginning(newNode);

        System.out.println("Length of the CLL after insertion: " + cll.length());
        System.out.println("Printing the CLL elements after insertion...");
        cll.print();
    }

    public static void testInsertAtTheEnd() {
        System.out.println(" Testing insertAtTheEnd() method");

        CLLNode first = new CLLNode(24);
        CLLNode second = new CLLNode(7);
        CLLNode third = new CLLNode(1);
        CLLNode fourth = new CLLNode(21);
        CLLNode fifth = new CLLNode(28);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(first);

        CircularLinkedList cll = new CircularLinkedList();
        cll.setHead(first);
        System.out.println("Length of the CLL before insertion: " + cll.length());
        System.out.println("Printing the CLL elements before insertion...");
        cll.print();

        CLLNode newNode = new CLLNode(75);
        cll.insertAtTheEnd(newNode);

        System.out.println("Length of the CLL after insertion: " + cll.length());
        System.out.println("Printing the CLL elements after insertion...");
        cll.print();
    }

    public static void testRemoveFromTheBeginning() {
        System.out.println("Testing removeFromTheBeginning() method");

        CLLNode first = new CLLNode(24);
        CLLNode second = new CLLNode(7);
        CLLNode third = new CLLNode(1);
        CLLNode fourth = new CLLNode(21);
        CLLNode fifth = new CLLNode(28);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(first);

        CircularLinkedList cll = new CircularLinkedList();
        cll.setHead(first);
        System.out.println("Length of the CLL before removal: " + cll.length());
        System.out.println("Printing the CLL elements before removal...");
        cll.print();

        cll.removeFromTheBeginning();

        System.out.println("Length of the CLL after removal: " + cll.length());
        System.out.println("Printing the CLL elements after removal...");
        cll.print();
    }

    public static void testRemoveAtTheEnd() {
        System.out.println("Testing removeAtTheEnd() method");

        CLLNode first = new CLLNode(24);
        CLLNode second = new CLLNode(7);
        CLLNode third = new CLLNode(1);
        CLLNode fourth = new CLLNode(21);
        CLLNode fifth = new CLLNode(28);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(first);

        CircularLinkedList cll = new CircularLinkedList();
        cll.setHead(first);
        System.out.println("Length of the CLL before removal: " + cll.length());
        System.out.println("Printing the CLL elements before removal...");
        cll.print();

        cll.removeAtTheEnd();

        System.out.println("Length of the CLL after removal: " + cll.length());
        System.out.println("Printing the CLL elements after removal...");
        cll.print();
    }

    public static void testRemoveMatchingNode() {
        System.out.println("Testing removeMatchingNode() method");

        CLLNode first = new CLLNode(24);
        CLLNode second = new CLLNode(7);
        CLLNode third = new CLLNode(1);
        CLLNode fourth = new CLLNode(21);
        CLLNode fifth = new CLLNode(28);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(first);

        CircularLinkedList cll = new CircularLinkedList();
        cll.setHead(first);
        System.out.println("Length of the CLL before removal: " + cll.length());
        System.out.println("Printing the CLL elements before removal...");
        cll.print();

        CLLNode nodeToRemove = new CLLNode(7);
        System.out.println("Node to remove: " + nodeToRemove);

        cll.removeMatchingNode(nodeToRemove);

        System.out.println("Length of the CLL after removal: " + cll.length());
        System.out.println("Printing the CLL elements after removal...");
        cll.print();
    }

    public static void testContains() {
        System.out.println("Testing contains() method");

        CLLNode first = new CLLNode(24);
        CLLNode second = new CLLNode(7);
        CLLNode third = new CLLNode(1);
        CLLNode fourth = new CLLNode(21);
        CLLNode fifth = new CLLNode(28);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(first);

        CircularLinkedList cll = new CircularLinkedList();
        cll.setHead(first);
        System.out.println("Printing the CLL elements...");
        cll.print();

        CLLNode nodeToCheck = new CLLNode(32);
        System.out.println("Node to check: " + nodeToCheck);

        System.out.println("The CLL contains the given node: " + cll.contains(nodeToCheck));
    }
}
