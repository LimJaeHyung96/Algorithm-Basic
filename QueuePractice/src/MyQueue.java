import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T a){
        queue.add(a);
    }

    public T dequeue(){
        if(queue.isEmpty())
            return null;
        return queue.remove(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
