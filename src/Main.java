public class Main {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.insertNode(1);
        ll.insertNode(2);
        ll.insertNode(0);
        ll.insertNode(3);
        ll.insertNode(5);
        ll.traversalLinkedList();
        System.out.println(ll.nthTolast(ll,5).getValue());
    }
}
