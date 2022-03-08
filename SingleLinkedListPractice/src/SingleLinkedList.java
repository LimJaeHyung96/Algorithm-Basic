public class SingleLinkedList<T>{
    public Node<T> head = null;

    //노드를 생성해주는 클래스
    public class Node<T>{
        T data; // 값
        Node<T> next = null; //가리키는 주소

        public Node(T data){
            this.data = data;
        }
    }

    //노드를 추가하는 함수
    public void addNode(T data){
        if(head == null){
            head = new Node<T>(data);
        } else{
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    //원하는 값을 찾아주는 함수
    public Node<T> search(T data){
        if(this.head == null){
            return null;
        } else{
            Node<T> node = this.head;
            while(node != null){
                if(node.data == data){
                    return node;
                } else{
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void printAll(){
        if(this.head == null){
            System.out.println("노드가 존재하지 않습니다");
        } else{
            Node<T> node = this.head;
            while(node != null){
                System.out.println(node.data.toString() + "이 있습니다");
                node = node.next;
            }
        }
    }

    public boolean deleteNode(T data){
        if(this.head == null){
            System.out.println("노드가 이미 0개입니다.");
            return false;
        } else{
            Node<T> node = this.head;
            if(node.data == data){
                this.head = node.next;
            } else{
                while (node.next != null){
                    if(node.next.data == data){
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
            }
            return false;
        }
    }


    public void addSearchedNode(T data, T searchData){
        Node<T> newNode = new Node<T>(data);
        Node<T> searchedNode = this.search(searchData);

        if(this.head == null){
            this.head = newNode;
        } else if(searchedNode == null){
          System.out.println("찾는 노드가 존재하지 않으므로 제일 뒤에 추가합니다.");
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = newNode;
        } else{
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
        }
    }

}