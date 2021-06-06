package SingleLinkedList;


import org.w3c.dom.Node;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName Singlelinkedlist.java
 * @Description TODO
 * @createTime 2021年06月04日 15:31:00
 */
public class NodeMethod<T> {

    private Node head;

    private int size;

    public class Node{
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
            next = null;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public NodeMethod() {
        this.head = null;
        this.size = 0;
    }

    /**
     * 添加头结点
     * @param t
     */
    public void addHead(T t) {
        Node node = new Node(t);
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    /**
     * 添加尾节点
     * @param t
     */
    public void addTail(T t) {
        addMiddle(t, size);
    }

    /**
     * 按索引添加节点
     * @param t
     * @param index
     */
    public void addMiddle(T t, int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index is error!");
        }
        if (index == 0){
            addHead(t);
            return;
        }
        Node node = new Node(t);
        //前一个结点
        Node preNode = head;
        for (int i = 0; i < index - 1; i++) {
            preNode = preNode.next;
        }
        node.next = preNode.next;
        preNode.next = node;
        this.size++;
    }

    /**
     * 删除链表中的指定索引的值
     * @param index
     */
    public void removeIndex(int index){
        //头节点
        if (index == 1){
            head = head.next;
            this.size--;
            return;
        }
        Node cur = head.next;
        int position = 2;
        if (index == this.size){
            while (position < this.size - 1){
                position++;
                cur = cur.next;
            }
            cur.next = null;
            this.size--;
            return;
        }

        while (cur != null){
            if (position == index){
                cur.next = cur.next.next;
                this.size--;
                return;
            }
            cur = cur.next;
            position++;
        }
    }

    /**
     * 删除指定链表中值
     * @param t
     */
    public void remove(T t) {
        if (head == null){
            System.out.println("无元素可删除");
            return;
        }
        //删除的是头节点
        while(head.value.equals(t)){
            head = head.next;
            this.size--;
            return;
        }
        Node cur = head;
        while(cur.next != null){
            if (cur.next.value.equals(t)){
                this.size--;
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
    }

    /**
     * 获取链表中指定value的索引
     * @param t
     * @return
     */
    public Number getNode(T t) {
        Node cur = head;
        int position = 1;
        while (cur != null){
            if (cur.value.equals(t)){
                return position;
            }
            position++;
            cur = cur.next;
        }
        return null;
    }

    /**
     * 获取链表中指定索引的值
     * @param index
     * @return
     */
    public T getNodeIndex(int index){
        Node cur = head;
        int position = 1;
        if (index < 1 || index > size){
            return (T)"false";
        }
        while (cur != null){
            if (position == index){
                return cur.value;
            }
            position++;
            cur = cur.next;
        }
        return (T)"false";
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 清空链表
     */
    public void clear(){
        head.value = null;
        head.next = null;
        size = 0;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        Node cur = head;
        for (int i = 1; i <= size; i++) {
            str.append(cur.value).append("\n");
            cur = cur.next;
        }
        return str.toString();
    }
}
