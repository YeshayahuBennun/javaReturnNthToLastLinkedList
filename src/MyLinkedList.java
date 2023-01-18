public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        //Empty
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void createLinkedList(int nodeValue) {
        Node newNode = new Node();
        head = new Node();
        tail = new Node();
        newNode.setValue(nodeValue);
        tail.setNext(null);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        if (head == null) {
            createLinkedList(nodeValue);
        } else {
            Node newNode = new Node();
            newNode.setValue(nodeValue);
            tail.setNext(newNode);
            tail = newNode;
            newNode.setNext(null);
            size++;
        }
    }

    public void traversalLinkedList() {
        if (head != null) {
            Node currentNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(currentNode.getValue());

                if (i < size - 1) {
                    System.out.print(" -> ");
                }
                currentNode = currentNode.getNext();
            }
            System.out.println("\n");
        } else {
            System.out.println("The linked list does not exist");
        }
    }

    public Node nthTolast(MyLinkedList mll, int n) {

        Node currentNode = mll.head;
        Node head2 = new Node();
        int count = 0;


        while (currentNode != null) {
            if (count == n) {
                System.out.println(currentNode.getValue());
            }
            count++;
            currentNode = currentNode.getNext();
        }

        return null;
    }
}
