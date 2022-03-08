public class Main {
    public static void main(String[] args){
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<Integer>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);

        myLinkedList.addSearchedNode(5, 8);

        myLinkedList.printAll();

        myLinkedList.deleteNode(3);
        myLinkedList.deleteNode(5);

        myLinkedList.printAll();
    }
}
