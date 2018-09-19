package org.home.dsa.linkedlist;

public class LinkedList {

    private Node head;

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insertIntoASortedLL(Node node) {
        Node temp;
        if(head == null || head.getData() >= node.getData()) {
            node.setNext(head);
            head = node;
        }
        else {
            temp = head;
            while(temp.getNext() != null && temp.getNext().getData() < node.getData()) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    public void deleteNodeFromALL(Node node) {
        Node prev;
        // if the LL does not have any nodes
        if(head == null) {
            System.out.println("The LL does not have any nodes!");
        }
        // if the LL contains a single node only
        else if(head.getNext() == null) {
            System.out.println("The LL has only one node!");
        }
        // if the LL contains multiple elements but the given node is the first node
        else if(head.getData() == node.getData()) {
            head = head.getNext();
            node = null;
        }
        // if the LL contains multiple elements but the given node is not the first node
        else {
            prev = head;
            while(prev.getNext() != null && prev.getNext().getData() != node.getData()) {
                prev = prev.getNext();
            }
            prev.setNext(prev.getNext().getNext());
            //prev.getNext().setNext(null);
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }
}
