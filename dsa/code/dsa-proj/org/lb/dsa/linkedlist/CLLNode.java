package org.lb.dsa.linkedlist;

public class CLLNode {
    private int data;
    private CLLNode next;

    public CLLNode() {

    }

    public CLLNode(int data) {
        this.data = data;
        next = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CLLNode getNext() {
        return this.next;
    }

    public void setNext(CLLNode next) {
        this.next = next;
    }

    public String toString() {
        return String.valueOf(data);
    }

    public boolean equals(CLLNode anotherNode) {
        if(anotherNode == null) {
            return false;
        }
        else if(anotherNode.getData() == this.data) {
            return true;
        }
        return false;
    }
}
