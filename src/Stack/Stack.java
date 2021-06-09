package Stack;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName Stack.java
 * @Description TODO
 * @createTime 2021年06月08日 14:03:00
 */
public class Stack<T> {

    private T [] array = (T[]) new Object[10000];

    private int index = 0;

    public Stack() {
    }

    public void push(T t){
        array[index] = t;
        index++;
    }

    public T pop(){
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException("The array is Empty");
        }else {
            T t = array[index - 1];
            index--;
            return t;
        }
    }

    public T peek(){
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException("The array is Empty");
        }else {
            T t = array[index - 1];
            return t;
        }
    }

    public boolean isEmpty(){
        if (index - 1 < 0){
            return true;
        }else {
            return false;
        }
    }
}
