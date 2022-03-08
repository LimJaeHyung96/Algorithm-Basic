public class Main {
    public static void main(String[] args){
        DoubleLinkedList<Integer> myLinkedList = new DoubleLinkedList<Integer>();

        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);
        myLinkedList.addNode(6);
        myLinkedList.addNode(7);
        myLinkedList.addNode(8);

        myLinkedList.insertToFront(1,999);
        myLinkedList.insertToFront(6,999);
        myLinkedList.insertToFront(8,999);
        myLinkedList.printAll();
    }
}
