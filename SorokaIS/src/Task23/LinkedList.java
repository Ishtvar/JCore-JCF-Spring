package Task23;

import java.util.Iterator;

public class LinkedList implements Iterable<Node> {
    private Node head;

    public Node getHead() {
        return head;
    }

    public Node search(String sd) {
        Node thisNode = head;
        while (thisNode.getNext() != null) {
            if (!thisNode.getData().equals(sd)) {
                thisNode = thisNode.getNext();
            } else {
                return thisNode;
            }
        }
        System.out.println("There is no such Data in List");
        return null;
    }

    public boolean contains(String sd) {
        return (search(sd) != null);
    }

    public void add(String sd) {
        Node newNode = new Node(sd);
        newNode.setNext(head);
        head = newNode;
    }

    public String remove(String s) {
        Node thisNode = search(s);
        String res = thisNode.getData();
        remove(thisNode);
        return res;
    }

    public void remove(Node node) {
        Node thisNode = head;
        if (node == head) {
            head = thisNode.getNext();
        } else {
            while (!thisNode.getNext().getData().equals(node)) {
                thisNode = thisNode.getNext();
            }
            if (node.getNext() == null) {
                thisNode.setNext(null);
            } else {
                thisNode.setNext(node.getNext());
            }
        }
    }


    @Override
    public Iterator<Node> iterator() {
        Iterator<Node> iterator = new Iterator<Node>() {
            private Node thisNode = head;

            @Override
            public boolean hasNext() {
                return (thisNode != null);
            }


            @Override
            public Node next() {
                thisNode = thisNode.getNext();
                return thisNode;
            }

            @Override
            public void remove() {
                LinkedList.this.remove(thisNode);
            }
        };
        return iterator;
    }
}
