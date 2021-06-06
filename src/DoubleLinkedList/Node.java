package DoubleLinkedList;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName Node.java
 * @Description TODO
 * @createTime 2021年06月06日 18:48:00
 */
public class Node<T> {

    T value;
    Node<T> pre;
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public Node() {
    }
}
