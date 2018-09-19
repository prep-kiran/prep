package org.home.dsa.linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {
        //testInsertIntoASortedLL();
        testDeleteNodeFromALL();
    }

    public static void testInsertIntoASortedLL() {
        Node first = new Node(2);
        Node second = new Node(5);
        Node third = new Node(7);
        Node fourth = new Node(10);
        Node fifth = new Node(15);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(null);

        LinkedList sortedLL = new LinkedList();
        sortedLL.setHead(first);
        System.out.println("Printing the original sorted LL...");
        sortedLL.print();
        System.out.println(" ");

        Node newNode = new Node(11);
        sortedLL.insertIntoASortedLL(newNode);
        System.out.println("Printing the sorted LL after inserting new data...");
        sortedLL.print();
        System.out.println(" ");
    }

    public static void testDeleteNodeFromALL() {
        Node first = new Node(12);
        Node second = new Node(15);
        Node third = new Node(10);
        Node fourth = new Node(11);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(2);
        Node eigth = new Node(3);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        seventh.setNext(eigth);
        eigth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);
        System.out.println("Printing the original LL...");
        ll.print();
        System.out.println(" ");

        //Node nodeToDelete = third;
        ll.deleteNodeFromALL(eigth);
        System.out.println("Printing the LL after deleting the node with value: " + eigth.getData());
        ll.print();
        System.out.println(" ");
    }
}
