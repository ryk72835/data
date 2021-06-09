package Queue;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName Queue.java
 * @Description TODO
 * @createTime 2021年06月08日 14:21:00
 */
public class Queue<T> {

    public class Node<T>{

        T val;
        Node next;

        public Node(){
            this.val = null;
            this.next = null;
        }

    }

    private Node head;

    private Node tail;

    private int maxsize = 0;

    private int length;

    public Queue(int length){
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        this.length = length;
    }

    /**
     * 入队列
     * @param t
     */
    public void InQueue(T t){
        if (isEmpty()){
            head.val = t;
            maxsize++;
        }else if (isFull()){
            try {
                throw new Exception("队列已满");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            tail.val = t;
            Node node = new Node();
            tail.next = node;
            tail = tail.next;
            maxsize++;
        }
    }

    /**
     * 出队列
     * @return
     */
    public T OutQueue(){
        if (isEmpty()){
            try {
                throw new Exception("队列为空");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            T t = (T) head.val;
            head = head.next;
            maxsize--;
            return t;
        }
        return null;
    }

    /**
     * 判空
     * @return
     */
    public boolean isEmpty(){
        if (head.val == null){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 判满使用链表长度
     * @return
     */
    public boolean isFull(){
        if (maxsize >= length){
            return true;
        }
        else {
            return false;
        }
    }

}
