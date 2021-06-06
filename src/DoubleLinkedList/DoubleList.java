package DoubleLinkedList;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName DoubleList.java
 * @Description TODO
 * @createTime 2021年06月06日 18:50:00
 */
public class DoubleList<T> {

    private Node<T> head;

    private int size;

    public DoubleList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * 向头部添加结点
     * @param t
     */
    public void addHead(T t){
        Node newNode = new Node();
        newNode.value = t;
        if (head != null) {
            head.pre = newNode;
            newNode.next = head;
        }
        head = newNode;
        this.size++;
    }

    /**
     * 在链表尾部添加结点
     * @param t
     */
    public void addTail(T t){
        Node newNode = head;
        while(newNode.next != null){
            newNode = newNode.next;
        }
        Node node = new Node();
        node.value = t;
        newNode.next = node;
        node.pre = newNode;
        this.size++;
    }

    /**
     * 按索引添加节点
     * @param t
     * @param index
     */
    public void addIndex(T t, int index){
        if (index == 1){
            addHead(t);
            return;
        }
        if (index == (size + 1)){
            addTail(t);
            return;
        }
        Node node = new Node();
        node = head;
        Node newNode = new Node();
        newNode.value = t;
        int position = 1;
        while(node != null){
            if (position == index){
                node.pre.next = newNode;
                newNode.pre = node.pre;
                newNode.next = node;
                node.pre = newNode;
                this.size++;
                return;
            }
            position++;
            node = node.next;
        }
    }

    /**
     * 删除尾结点
     */
    public void removeTail(){
        if (head == null){
            System.out.println("空表，删除的结点不存在");
        }else {
            Node newNode = head;
            int position = 1;
            while (position < size){
                newNode = newNode.next;
                position++;
            }
            Node node = newNode.pre;
            node.next = null;
            newNode.pre = null;
            this.size--;
        }
    }

    /**
     * 删除头结点
     */
    public void removeHead(){
        if (head == null){
            System.out.println("空表，删除的结点不存在");
        }else {
            Node newNode = head;
            Node node = newNode.next;
            newNode.next = null;
            node.pre = null;
            head = node;
            this.size--;
        }
    }

    /**
     * 按照指定的索引删除
     * @param index
     */
    public  void removeIndex(int index){
        if (head == null){
            System.out.println("空表，删除的结点不存在");
            return;
        }else {
            if (index > size || index < 1){
                System.out.println("输入超过链表长度");
                return;
            }else {
                if (index == 1){
                    removeHead();
                }else if (index == size){
                    removeTail();
                }else {
                    Node newNode = head;
                    int position = 1;
                    while (newNode != null){
                        if (position == index){
                            newNode.pre.next = newNode.next;
                            newNode.next.pre = newNode.pre;
                            this.size--;
                            return;
                        }
                        position++;
                        newNode = newNode.next;
                    }
                }
            }
        }
    }

    /**
     * 更改节点的值
     * @param index
     * @param t
     */
    public void updateNode(int index, T t){
        if (head == null){
            System.out.println("空表，更改的结点不存在");
            return;
        }else {
            if (index > size || index < 1){
                System.out.println("输入超过链表长度");
                return;
            }else {
                Node newNode = head;
                int position = 1;
                while(newNode != null){
                    if (position == index){
                        newNode.value = t;
                        return;
                    }
                    newNode = newNode.next;
                    position++;
                }
            }
        }
    }

    /**
     * 判空
     * @return
     */
    public boolean isEmpty(){
        if (head == null){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 输出
     * @return
     */
    public String toString(){
        Node newNode = head;
        StringBuilder str = new StringBuilder();
        while(newNode != null){
            str.append(newNode.value).append("\n");
            newNode = newNode.next;
        }
        return str.toString();
    }
}
