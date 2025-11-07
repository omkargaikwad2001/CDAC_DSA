package com.DoublyCircularLL;

public class DoublyCircularLL {

    private Node head;

    public DoublyCircularLL() {
        head = null;
    }

    // create node
    public Node createNode(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        return newNode;
    }

    // display
    public void display() {
        if (head == null) {
            System.out.println("LL is empty...");
            return;
        }

        Node temp = head;
        System.out.print("HEAD <-> ");
        do {
            System.out.print(temp.getData() + " <-> ");
            temp = temp.getNext();
        } while (temp != head);
        System.out.println("HEAD");
    }

    // add at start
    public void addAtStart(int data) {
        Node newNode = createNode(data);

        if (head == null) {
            head = newNode;
            head.setNext(head);
            head.setPrev(head);
        } else {
            Node last = head.getPrev();

            newNode.setNext(head);
            newNode.setPrev(last);
            last.setNext(newNode);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    // add at end
    public void addAtEnd(int data) {
        Node newNode = createNode(data);

        if (head == null) {
            head = newNode;
            head.setNext(head);
            head.setPrev(head);
        } else {
            Node last = head.getPrev();

            newNode.setNext(head);
            newNode.setPrev(last);
            last.setNext(newNode);
            head.setPrev(newNode);
        }
    }

    // count
    public int countLength() {
        if (head == null)
            return 0;

        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.getNext();
        } while (temp != head);

        return count;
    }

    // add by position
    public void addByPosition(int data, int pos) {
        int len = countLength();
        Node newNode = createNode(data);

        if (pos <= 1) {
            addAtStart(data);
        } else if (pos > len) {
            addAtEnd(data);
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.getNext();
            }
            Node nextNode = temp.getNext();
            temp.setNext(newNode);
            newNode.setPrev(temp);
            newNode.setNext(nextNode);
            nextNode.setPrev(newNode);
        }
    }

    // add by value
    public void addByValue(int data, int val) {
        if (head == null) {
            System.out.println("LL is empty...");
            return;
        }

        Node newNode = createNode(data);
        Node temp = head;
        boolean found = false;

        do {
            if (temp.getData() == val) {
                found = true;
                break;
            }
            temp = temp.getNext();
        } while (temp != head);

        if (!found) {
            System.out.println(val + " not found in LL");
            return;
        }

        Node nextNode = temp.getNext();
        temp.setNext(newNode);
        newNode.setPrev(temp);
        newNode.setNext(nextNode);
        nextNode.setPrev(newNode);
    }

    // delete at start
    public void deleteAtStart() {
        if (head == null) {
            System.out.println("LL is empty...");
            return;
        }

        if (head.getNext() == head) {
            head = null;
        } else {
            Node last = head.getPrev();
            head = head.getNext();
            head.setPrev(last);
            last.setNext(head);
        }
    }

    // delete at end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("LL is empty...");
            return;
        }

        if (head.getNext() == head) {
            head = null;
        } else {
            Node last = head.getPrev();
            Node secondLast = last.getPrev();

            secondLast.setNext(head);
            head.setPrev(secondLast);
        }
    }

    // delete by data
    public void deleteByData(int data) {
        if (head == null) {
            System.out.println("LL is empty...");
            return;
        }

        Node temp = head;
        boolean found = false;

        do {
            if (temp.getData() == data) {
                found = true;
                break;
            }
            temp = temp.getNext();
        } while (temp != head);

        if (!found) {
            System.out.println("Data not found!");
            return;
        }

        if (temp == head && head.getNext() == head) {
            head = null;
        } else if (temp == head) {
            deleteAtStart();
        } else {
            Node prev = temp.getPrev();
            Node next = temp.getNext();
            prev.setNext(next);
            next.setPrev(prev);
        }
    }

    // print reverse
    public void printRev() {
        if (head == null) {
            System.out.println("LL is empty...");
            return;
        }

        Node last = head.getPrev();
        Node temp = last;
        System.out.print("HEAD <-> ");
        do {
            System.out.print(temp.getData() + " <-> ");
            temp = temp.getPrev();
        } while (temp != last);
        System.out.println("HEAD");
    }
}
