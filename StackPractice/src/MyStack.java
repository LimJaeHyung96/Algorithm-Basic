import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    public T push(T item){
        stack.add(0, item);
        //stack.add(item); 을 한다면 최근에 들어가는 데이터가 뒤에 쌓이고
        return item;
    }

    public T pop(){
        if(stack.isEmpty()) {
            return null;
        }
        return stack.remove(0);
        //return stack.remove(stack.size()-1); 로 가장 뒤에 있는 값(가장 최근에 들어간 값)을 삭제하면서 반환할 수 있다.
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
