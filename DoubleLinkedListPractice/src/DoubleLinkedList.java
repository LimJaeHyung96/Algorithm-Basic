import org.w3c.dom.Node;

public class DoubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T>{
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(this.head == null){
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else{
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll(){
        if(this.head == null){
            System.out.println("아무런 노드가 존재하지 않습니다");
        } else{
            Node<T> node = this.head;
            while (node != null){
                System.out.println(node.data + "가 있습니다");
                node = node.next;
            }
        }
    }

    public T searchFromHead(T isData){
        if(this.head == null){
            return null;
        } else{
            Node<T> node = this.head;
            while(node != null){
                if(node.data == isData){
                    return node.data;
                }
                node = node.next;
            }
            return null;
        }
    }

    public T searchFromTail(T isData){
        if(this.tail == null){
            return null;
        } else{
            Node<T> node = this.tail;
            while (node != null){
                if(node.data == isData) {
                    return node.data;
                }
                node = node.prev;
            }
            return null;
        }
    }

    public boolean insertToFront(T existedData, T addData){
        Node<T> newNode = new Node<T>(addData);
        if(this.head == null) {
            this.head = new Node<T>(addData);
            this.tail = this.head;
            return true;
        }else if(this.head.data == existedData){
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
            return true;
        } else{
            Node<T> node = this.head;
            while (node.next != null){
                if(node.next.data == existedData){
                    newNode.next = node.next;
                    newNode.next.prev = newNode;
                    newNode.prev = node;
                    node.next = newNode;
                    return true;
                } else{
                    node = node.next;
                }
            }
            return false;
        }
    }
}
