package org.lb.dsa.linkedlist;

public class LinkedListTest {
    public static void main(String [] args) {
        //testLength();
        //testGetNodePosition();
        //testPrint();
        //testInsertAtTheBeginning();
        //testInsertAtTheEnd();
        //testInsertAtAGivenPosition();
        //testRemoveFromTheBeginning();
        //testRemoveAtTheEnd();
        //testRemoveTheFirstMatchingNode();
        //testRemoveAtAGivenPosition();
        //testToString();
        //testGetMiddleNodeData();
        //testGetMiddleNodeDataAlternateApproach();
        //testGetKthElementFromTheEnd();
        //testGetTheIntersectionPointBetweenTwoLinkedLists();
        //testCheckIfALoopExistsHashTechnique();
        //testCheckIfALoopExistsFloyd();
        //testCountLoopNodes();
        //testRemoveLoop();
        //testMoveOddPositionNodesToBeginning();
        testReverseNodes();
    }

    public static void testLength() {
        Node first = new Node(9);
        Node second = new Node(56);
        Node third = new Node(12);
        Node fourth = new Node(21);
        Node fifth = new Node(32);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length: " + ll.length());
    }

    public static void testGetNodePosition() {
        Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(91);
        Node fourth = new Node(21);
        Node fifth = new Node(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        int data = 71;
        int requireNodePosition = ll.getNodePosition(data);
        System.out.println("Given data: " + data);
        System.out.println("Node position returned: " + requireNodePosition);
    }

    public static void testPrint() {
        Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(91);
        Node fourth = new Node(21);
        Node fifth = new Node(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        ll.print();
        System.out.println("");
    }

    public static void testInsertAtTheBeginning() {
        Node first = new Node(4);
        //Node second = new Node(7);
        Node third = new Node(91);
        Node fourth = new Node(21);
        Node fifth = new Node(18);

        first.setNext(third);
        //second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length before insertAtTheBeginning: " + ll.length());
        ll.print();

        Node newNode = new Node(25);
        ll.insertAtTheBeginning(newNode);
        System.out.println("\nLength after insertAtTheBeginning: " + ll.length());
        ll.print();
        System.out.println("");
    }

    public static void testInsertAtTheEnd() {
        System.out.println("Testing insertion of a node at the end of an LL");
        Node first = new Node(4);
        //Node second = new Node(7);
        Node third = new Node(91);
        Node fourth = new Node(21);
        Node fifth = new Node(18);

        first.setNext(third);
        //second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length before insertAtTheBeginning: " + ll.length());
        ll.print();

        Node newNode = new Node(67);
        ll.insertAtTheEnd(newNode);
        System.out.println("\nLength after insertAtTheEnd: " + ll.length());
        ll.print();
        System.out.println("");

    }

    public static void testInsertAtAGivenPosition() {
        System.out.println("Testing insertion of a node at the given position");

        int position = 2;
        Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(14);
        Node fourth = new Node(41);
        Node fifth = new Node(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length before insertAtAGivenPosition: " + ll.length());
        ll.print();

        System.out.println("\nGiven position: " + position);

        Node newNode = new Node(67);
        ll.insertAtAGivenPosition(newNode, position);
        System.out.println("\nLength after insertAtAGivenPosition: " + ll.length());
        ll.print();
        System.out.println("");
    }

    public static void testRemoveFromTheBeginning() {
        System.out.println("Testing removal of a node from the beginning");

        //Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(14);
        Node fourth = new Node(41);
        Node fifth = new Node(18);

        //first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(second);

        System.out.println("Length before removeFromTheBeginning: " + ll.length());
        ll.print();

        ll.removeFromTheBeginning();
        System.out.println("\nLength after removeFromTheBeginning: " + ll.length());
        ll.print();
        System.out.println("");
    }

    public static void testRemoveAtTheEnd() {
        System.out.println("Testing removal of a node at the end");

        Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(14);
        Node fourth = new Node(41);
        //Node fifth = new Node(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(null);
        //fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length before removeAtTheEnd: " + ll.length());
        ll.print();

        ll.removeAtTheEnd();
        System.out.println("\nLength after removeAtTheEnd: " + ll.length());
        ll.print();
        System.out.println("");
    }

    public static void testRemoveTheFirstMatchingNode() {
        System.out.println("Testing removal of the first matching node");

        Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(14);
        Node fourth = new Node(41);
        //Node fifth = new Node(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(null);
        //fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length before removeTheFirstMatchingNode: " + ll.length());
        ll.print();

        Node node = new Node(14);
        System.out.println("\nGiven node: " + node);
        ll.removeTheFirstMatchingNode(node);
        System.out.println("\nLength after removeTheFirstMatchingNode: " + ll.length());
        ll.print();
        System.out.println("");
    }

    public static void testRemoveAtAGivenPosition() {
        System.out.println("Testing removal of node at the given position");

        Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(14);
        Node fourth = new Node(41);
        //Node fifth = new Node(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(null);
        //fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length before removeAtAGivenPosition: " + ll.length());
        ll.print();

        int position = 1;
        System.out.println("\nGiven position: " + position);
        ll.removeAtAGivenPosition(position);
        System.out.println("\nLength after removeAtAGivenPosition: " + ll.length());
        ll.print();
        System.out.println("");
    }

    public static void testToString() {
        System.out.println("Testing toString()");

        Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(14);
        Node fourth = new Node(41);
        //Node fifth = new Node(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(null);
        //fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length: " + ll.length());
        System.out.println("Printing using print() method...");
        ll.print();

        String llString = ll.toString();

        System.out.println("\nPrinting the toString(): " + llString);
    }

    public static void testGetMiddleNodeData() {
        System.out.println("Testing getMiddleNodeData() method");

        Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(14);
        Node fourth = new Node(41);
        //Node fifth = new Node(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(null);
        //fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length: " + ll.length());
        System.out.println("Printing elements... ");
        ll.print();

        int middleNodeData = ll.getMiddleNodeData();

        System.out.println("\nMiddle node data: " + middleNodeData);
    }

    public static void testGetMiddleNodeDataAlternateApproach() {
        System.out.println("Testing getMiddleNodeData() method");

        Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(14);
        Node fourth = new Node(41);
        Node fifth = new Node(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length: " + ll.length());
        System.out.println("Printing elements... ");
        ll.print();

        int middleNodeData = ll.getMiddleNodeDataAlternateApproach();

        System.out.println("\nMiddle node data: " + middleNodeData);
    }

    public static void testGetKthElementFromTheEnd() {
        System.out.println("Testing getKthElementFromTheEnd() method");

        Node first = new Node(4);
        Node second = new Node(7);
        Node third = new Node(14);
        Node fourth = new Node(41);
        Node fifth = new Node(18);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(null);
        //fifth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);

        System.out.println("Length: " + ll.length());
        System.out.println("Printing elements... ");
        ll.print();

        int k = 2;
        System.out.println("\nk: " + k);

        int kthElementFromTheEnd = ll.getKthElementFromTheEnd(k);
        System.out.println("Kth element from the end data: " + kthElementFromTheEnd);
    }

    public static void testGetTheIntersectionPointBetweenTwoLinkedLists() {
        System.out.println("Testing getTheIntersectionPointBetweenTwoLinkedLists() method");

        Node first = new Node(3);
        Node second = new Node(6);
        Node third = new Node(9);
        Node fourth = new Node(15);
        Node fifth = new Node(30);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(null);

        LinkedList llOne = new LinkedList();
        llOne.setHead(first);
        System.out.println("\nLength of LL one: " + llOne.length());
        System.out.println("Printing elements of LL one... ");
        llOne.print();

        Node eleventh = new Node(10);
        eleventh.setNext(fourth);

        LinkedList llTwo = new LinkedList();
        llTwo.setHead(eleventh);

        System.out.println("\nLength of LL two: " + llTwo.length());
        System.out.println("Printing elements of LL two... ");
        llTwo.print();

        Node headOne = first;
        Node headTwo = eleventh;

        LinkedList ll = new LinkedList();

        int intersectingElementData = ll.getTheIntersectionPointBetweenTwoLinkedLists(headOne, headTwo);
        System.out.println("\nintersectingElementData: " + intersectingElementData);
    }

    public static void testCheckIfALoopExistsHashTechnique() {
        System.out.println("Testing checkIfALoopExistsHashTechnique() method");

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        Node ninth = new Node(9);
        Node tenth = new Node(10);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        seventh.setNext(eighth);
        eighth.setNext(ninth);
        ninth.setNext(tenth);
        tenth.setNext(fourth);

        LinkedList ll = new LinkedList();
        ll.setHead(first);
        //System.out.println("\nLength of LL: " + ll.length());
        //System.out.println("Printing elements of LL... ");
        //ll.print();

        System.out.println("\nLoop exists in this LinkedList: " +  ll.checkIfALoopExistsHashTechnique());
    }

    public static void testCheckIfALoopExistsFloyd() {
        System.out.println("Testing checkIfALoopExistsFloyd() method");

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        Node ninth = new Node(9);
        Node tenth = new Node(10);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        seventh.setNext(eighth);
        eighth.setNext(ninth);
        ninth.setNext(second);
        //tenth.setNext(fifth);
        System.out.println("Finished setting up the nodes!");

        LinkedList ll = new LinkedList();
        ll.setHead(first);
        System.out.println("Finished setting up the LL!");

        //System.out.println("\nLength of LL: " + ll.length());
        //System.out.println("Printing elements of LL... ");
        //ll.print();

        System.out.println("\nLoop exists in this LinkedList: " +  ll.checkIfALoopExistsFloyd());
    }

    public static void testCountLoopNodes() {
        System.out.println("Testing countLoopNodes() method");

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        Node ninth = new Node(9);
        Node tenth = new Node(10);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        seventh.setNext(eighth);
        eighth.setNext(ninth);
        ninth.setNext(tenth);
        tenth.setNext(fifth);
        System.out.println("Finished setting up the nodes!");

        LinkedList ll = new LinkedList();
        ll.setHead(first);
        System.out.println("Finished setting up the LL!");

        System.out.println("No. of nodes in the loop: " +  ll.countLoopNodes());
    }

    public static void testRemoveLoop() {
        System.out.println("Testing removeLoop() method");

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        Node ninth = new Node(9);
        Node tenth = new Node(10);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        seventh.setNext(eighth);
        eighth.setNext(ninth);
        ninth.setNext(tenth);
        tenth.setNext(fifth);
        System.out.println("Finished setting up the nodes!");

        LinkedList ll = new LinkedList();
        ll.setHead(first);
        System.out.println("Finished setting up the LL!");

        ll.removeLoop();
        System.out.println("Checking if loop still exists..." + ll.checkIfALoopExistsFloyd());
    }

    public static void testMoveOddPositionNodesToBeginning() {
        System.out.println("Testing moveOddPositionNodesToBeginning() method");

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        Node ninth = new Node(9);
        Node tenth = new Node(10);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        seventh.setNext(eighth);
        eighth.setNext(ninth);
        ninth.setNext(tenth);
        tenth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);
        System.out.println("Finished setting up the LL!");
        ll.print();

        ll.moveOddPositionNodesToBeginning();
        System.out.println("Reordering the loop...");
        ll.print();
    }

    public static void testReverseNodes() {
        System.out.println("Testing reverseNodes() nethod");

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eighth = new Node(8);
        Node ninth = new Node(9);
        Node tenth = new Node(10);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        seventh.setNext(eighth);
        eighth.setNext(ninth);
        ninth.setNext(null);
        //tenth.setNext(null);

        LinkedList ll = new LinkedList();
        ll.setHead(first);
        System.out.println("Finished setting up the LL!");
        ll.print();

        ll.reverseNodes();
        System.out.println("Reversing the nodes...");
        ll.print();
    }
}
