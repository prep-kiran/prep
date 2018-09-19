package org.lb.dsa.linkedlist;

public class CircularLinkedList {
    private CLLNode head;

    public CircularLinkedList() {

    }

    public CLLNode getHead() {
        return this.head;
    }

    public void setHead(CLLNode node) {
        this.head = node;
    }

    public int length() {
        int length = 0;
        CLLNode temp = head;
        while(temp.getNext() != head) {
            length++;
            temp = temp.getNext();
        }
        return length + 1;
    }

    public String toString() {
        StringBuilder cllBuilder = new StringBuilder("");
        CLLNode temp = head;
        while(temp.getNext() != head) {
            cllBuilder.append(temp + " ");
            temp = temp.getNext();
        }
        return (cllBuilder.append(temp.toString())).toString();
    }

    public void print() {
        System.out.println(toString());
    }

    public void insertAtTheBeginning(CLLNode node) {
        CLLNode temp = head;
        while(temp.getNext() != head) {
            temp = temp.getNext();
        }
        node.setNext(head);
        temp.setNext(node);
        head = node;
    }

    public void insertAtTheEnd(CLLNode node) {
        CLLNode temp = head;
        while(temp.getNext() != head) {
            temp = temp.getNext();
        }
        node.setNext(head);
        temp.setNext(node);
    }

    public void removeFromTheBeginning() {
        CLLNode temp = head;
        while(temp.getNext() != head) {
            temp = temp.getNext();
        }
        temp.setNext(head.getNext());
        head = head.getNext();
    }

    public void removeAtTheEnd() {
        CLLNode temp = head;
        CLLNode prev = temp;
        while(temp.getNext() != head) {
            prev = temp;
            temp = temp.getNext();
        }
        prev.setNext(head);
        temp = null;
    }

    public void removeMatchingNode(CLLNode node) {
        CLLNode temp = head;
        CLLNode prev = temp;
        while(temp.getNext() != head) {
            if(node.getData() == temp.getData()) {
                prev.setNext(temp.getNext());
                break;
            }
            prev = temp;
            temp = temp.getNext();
        }
    }

    public boolean contains(CLLNode node) {
        boolean containsNode = false;
        CLLNode temp = head;
        while(temp.getNext() != head) {
            if(temp.getData() == node.getData()) {
                containsNode = true;
            }
            temp = temp.getNext();
        }
        if(temp.getData() == node.getData()) {
            containsNode = true;
        }
        return containsNode;
    }
}
