package org.lb.dsa.linkedlist;

import java.util.HashSet;

public class LinkedList {
    private Node head;

    public LinkedList() {

    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    // Get the length of the LL
    public int length() {
        int length = 0;
        Node temp = head;
        while(temp != null) {
            length++;
            temp = temp.getNext();
        }
        return length;
    }

    // Gets the position of the first node matching the given data
    public int getNodePosition(int data) {
        int requiredPosition = 0;
        Node temp = head;
        while(temp != null) {
            if(temp.getData() == data) {
                return requiredPosition;
            }
            requiredPosition++;
            temp = temp.getNext();
        }
        System.out.println("The given data does not exist in this LL!");
        return -1;
    }

    // Prints the LL
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getData());
            System.out.print(" ");
            temp = temp.getNext();
        }
    }

    // Inserts a node at the beginning of the LL
    public void insertAtTheBeginning(Node node) {
        Node temp = head;
        node.setNext(temp);
        this.head = node;
    }

    // Inserts a node at the end of the LL
    public void insertAtTheEnd(Node node) {
        Node temp = head;
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        node.setNext(null);
        temp.setNext(node);
    }

    // Inserts a node at the given position
    public void insertAtAGivenPosition(Node node, int position) {
        int currentPosition = 0;
        Node temp = head;
        Node prev = temp;
        while(temp != null) {
            if(currentPosition == position) {
                node.setNext(temp);
                prev.setNext(node);
            }
            prev = temp;
            currentPosition++;
            temp = temp.getNext();
        }
    }

    // Removes the node at the beginning of the LL
    public void removeFromTheBeginning() {
        Node temp = head.getNext();
        head = temp;
    }

    // Removes the node at the end of the LL
    public void removeAtTheEnd() {
        Node temp = head;
        Node prev = temp;
        while(temp.getNext() != null) {
            prev = temp;
            temp = temp.getNext();
        }
        prev.setNext(null);
        temp = null;
    }

    // Remove the first matching Node
    public void removeTheFirstMatchingNode(Node node) {
        Node temp = head;
        Node prev = temp;
        while(temp != null) {
            if(node.equals(temp)) {
                prev.setNext(temp.getNext());
            }
            prev = temp;
            temp = temp.getNext();
        }
    }

    // Remove the node at a given position
    public void removeAtAGivenPosition(int position) {
        Node temp = head;
        Node prev = temp;
        int currentPosition = 0;
        while(temp != null) {
            if(currentPosition == position) {
                prev.setNext(temp.getNext());
            }
            prev = temp;
            currentPosition++;
            temp = temp.getNext();
        }
    }

    // Returns a String representation of this LL
    public String toString() {
        Node temp = head;
        StringBuilder llBuilder  = new StringBuilder("");
        while(temp != null) {
            llBuilder.append(temp + " ");
            temp = temp.getNext();
        }
        return llBuilder.toString();
    }

    // Clears the contents of the LL
    public void clearList() {
        head = null;
    }

    // Find the middle element in a LinkedList
    // If there are odd no. of elements, middle element is straight-forward, if there are even elements in the LinkedList, there can be 2 middle elements. Either is fine or it depends on the person who is asking for import junit.framework.TestCase;
    // There are 3 methods for this - brute force, slow-fast two-pointer technique and odd-counter technique
    // Brute force method is to get the count of nodes in the LL using one iteration and then iterate once again upto floor(count/2) to obtain the middle node
    // The second is to use two pointers -  a slow one and a fast one and traverse through the List. The slow one moves forward one element at a time while the fast one moves two elements at a time. By the time the fast one reaches the last element, the slow one would have reached the middle one
    // The third supposes the head as a middle element and a counter to traverse from the head with an initial value of 0. Every time an element is traversed, the counter is incremented by 1. Every time the counter reaches an odd value, the supposed middle element is moved to its next. So, the supposed middle element would have moved only till half the list b the time the counter reaches the last element.
    // This implementation uses the second approach (fast-slow-pointer technique)
    public int getMiddleNodeData() {
        Node temp_slow = head;
        Node temp_fast = head;
        while(temp_fast != null && temp_fast.getNext() != null) {
            temp_slow = temp_slow.getNext();
            temp_fast = temp_fast.getNext().getNext();
        }
        return temp_slow.getData();
    }

    // This implementation uses the third approach (odd-counter technique)
    public int getMiddleNodeDataAlternateApproach() {
        Node temp_mid = head;
        Node temp = head;
        int counter = 0;
        while(temp != null) {
            if(counter%2 != 0) {
                temp_mid = temp_mid.getNext();
            }
            counter++;
            temp = temp.getNext();
        }
        return temp_mid.getData();
    }

    // Get kth element from the end of the LinkedList
    public int getKthElementFromTheEnd(int k) {
        Node temp_main = head;
        Node temp_ref = head;
        int count = 0;
        while(count <= k) {
            count++;
            temp_ref = temp_ref.getNext();
        }
        while(temp_ref != null) {
            temp_ref = temp_ref.getNext();
            temp_main = temp_main.getNext();
        }
        return temp_main.getData();
    }

    // Get the intersection point of two joined Linked lists
    // Multiple methods exist for this. Brute force ove will iterate through the first list and for every element in the first list, check with every element in the second list. Thus if m is the no. of elements in the first list and n is the no. of elements in the second list, T.C will be O(m*n)
    // Anothe rmethod is to iterate through both the lists separately and find their lengths. One of them could be bigger. Start at the head of bothe the lists. Let the loop pointer on the bigger list traverse by k where k is the difference in length betweeen the two linked lists. From there on, keep incrementing both the loop pointers to the next. COmpare the next of each other. If it is the same, that will be the intersection point
    // This implementation uses the difference-in-lengths technique explained above. T.C = O(m+n); S.C: O(1)
    public int getTheIntersectionPointBetweenTwoLinkedLists(Node headOne, Node  headTwo) {
        int lengthOne = 0;
        int lengthTwo = 0;

        Node tempOne = headOne;
        Node tempTwo = headTwo;

        while(tempOne != null) {
            lengthOne++;
            tempOne = tempOne.getNext();
        }

        while(tempTwo != null) {
            lengthTwo++;
            tempTwo = tempTwo.getNext();
        }

        int lengthDiff = 0;
        if(lengthTwo > lengthOne) {
            lengthDiff = lengthTwo - lengthOne;
            return getTheIntersectionPointBetweenTwoLLsPrivate(headTwo, headOne, lengthDiff);
        }
        else {
            lengthDiff = lengthOne - lengthTwo;
            return getTheIntersectionPointBetweenTwoLLsPrivate(headOne, headTwo, lengthDiff);
        }
    }

    // This assumes that LL containing node_one is greater in length than LL containing node_two by a difference of diff
    private int getTheIntersectionPointBetweenTwoLLsPrivate(Node head_one, Node head_two, int length_diff) {
        Node temp_one = head_one;
        Node temp_two = head_two;

        int temp_diff = 0;
        int intersectingElementData = -1;

        while(temp_diff < length_diff) {
            temp_diff++;
            temp_one = temp_one.getNext();
        }

        while(temp_one != null && temp_two != null) {
            if(temp_one.getData() == temp_two.getData()) {
                intersectingElementData = temp_one.getData();
            }
            temp_one = temp_one.getNext();
            temp_two = temp_two.getNext();
        }
        return intersectingElementData;
    }

    // NOT WORKING
    // Detects if a loop exists in a LinkedList. This has several techniques but the fastest and the best is Floyd's cycle algorithm. This implementation uses the hash technique
    public boolean checkIfALoopExistsHashTechnique() {
        HashSet<Node> hSet = new HashSet<Node>();
        Node temp = head;
        while(temp != null) {
            System.out.println("temp: " + temp);
            if(hSet.contains(temp)) {
                 return true;
            }
            hSet.add(temp);
            temp = temp.getNext();
        }
        return false;
    }

    // This implementation uses Floyd's cycle algorithm
    public boolean checkIfALoopExistsFloyd() {
        int noOfLoopNodes = -1;
        Node temp_fast = head;
        Node temp_slow = head;
        while(temp_slow != null && temp_fast != null && temp_fast.getNext() != null) {
            //System.out.println("temp_slow: " + temp_slow);
            //System.out.println("temp_fast: " + temp_fast);
            temp_slow = temp_slow.getNext();
            temp_fast = temp_fast.getNext().getNext();
            if(temp_fast == temp_slow) {
                System.out.println("Found loop!");
                return true;
            }
        }
        return false;
    }

    // Counts the nodes in the loop for a LInkedList with a loop
    public int countLoopNodes() {
        int noOfLoopNodes = -1;
        Node temp_fast = head;
        Node temp_slow = head;
        while(temp_slow != null && temp_fast != null && temp_fast.getNext() != null) {
            System.out.println("temp_slow: " + temp_slow);
            System.out.println("temp_fast: " + temp_fast);
            temp_slow = temp_slow.getNext();
            temp_fast = temp_fast.getNext().getNext();
            if(temp_fast == temp_slow) {
                System.out.println("Found loop!");
                break;
            }
        }
        Node temp1 = temp_slow;
        Node temp2 = temp_slow   ;
        int k =1;
        while(temp2.getNext() != temp1) {
            k++;
            temp2 = temp2.getNext();
        }
        return k;
    }

    // (1) Detect if a loop exists in a LinkedList
    // (2) If the loop exists, count the number of elements in the loop
    // (3) Break the loop
    // This is a classic problem in LinkedLists. It has many solutions, the best of which is Floyd's Cycle algorithm. Once a loop is found, no. of nodes in the loop can be counted and then the loop can be broken
    public void removeLoop() {
        int noOfLoopNodes = -1;
        Node temp_fast = head;
        Node temp_slow = head;
        while(temp_slow != null && temp_fast != null && temp_fast.getNext() != null) {
            System.out.println("temp_slow: " + temp_slow);
            System.out.println("temp_fast: " + temp_fast);
            temp_slow = temp_slow.getNext();
            temp_fast = temp_fast.getNext().getNext();
            if(temp_fast == temp_slow) {
                System.out.println("Found loop!");
                break;
            }
        }
        Node temp1 = temp_slow;
        Node temp2 = temp_slow;
        int k =1;
        while(temp2.getNext() != temp1) {
            System.out.println("k: " + k);
            System.out.println("temp2: " + temp2);
            k++;
            temp2 = temp2.getNext();
        }
        //System.out.println("temp2 after the while loop: " + temp2);
        Node pointer_1 = head;
        Node pointer_2 = head;
        for(int i = 0; i < k; i++) {

        }
    }

    // Given a LL, bring all the nodes in the odd positions first and then then the nodes in the even positions without losing the sequence within odd and even positions
    // input: 10 -> 11 -> 14 -> 21 -> 25 -> 27
    // output: 10 -> 14 -> 25 -> 11 -> 21 -> 27
    // T.C is O(n)
    // S.C is O(1)
    public void moveOddPositionNodesToBeginning () {
        int count = 0;
        // No reordering to be done in the following cases
        if(head == null || head.getNext() == null || head.getNext().getNext() == null) {
            return;
        }
        Node oddHead = head;
        Node evenHead = head.getNext();
        Node odd = oddHead;
        Node even = evenHead;
        while(odd.getNext().getNext() != null && even.getNext().getNext() != null) {
            odd.setNext(even.getNext());
            odd = even.getNext();
            even.setNext(odd.getNext());
            even = odd.getNext();
        }
        if(odd.getNext().getNext() != null) {
            odd.setNext(even.getNext());
            odd = even.getNext();
            even.setNext(null);
        }
        odd.setNext(evenHead);
    }

    // Reverse the nodes in a given LInkedList
    // Input: 1 -> 2 -> 3 -> 4 -> 5
    // Output: 5 -> 4 -> 3 -> 2 -> 1
    // A straight-forward way is to dump the nodes of the given LL into a Stack and reconstruct a new LL by popping them out. The LIFO principle of Stack naturally reverses the nodes. However its T.C is O(n) and S.C is also O(n)
    // If we can achieve in-place reversal, S.C can be reduced to O(1)
    public void reverseNodes() {
        if(head == null || head.getNext() == null) {
            return;
        }
        Node temp = head;
        Node next = null;
        Node prev = null;
        while(temp != null) {
            next = temp.getNext();
            temp.setNext(prev);
            prev = temp;
            temp = next;
        }
        head = prev;
    }
}
