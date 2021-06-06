package SingleLinkedList;

import java.util.Stack;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName ReversalLinkedList.java
 * @Description TODO
 * @createTime 2021年06月06日 01:12:00
 */
public class ReversalLinkedList {
    public Node solutions(Node node){
        if (node == null){
            return node;
        }
        Node pre = node;
        Node cur = node.next;
        Node tmp;
        while(cur != null){
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        node.next = null;
        return pre;
    }
    public Node solutions1(Node node){
        if (node == null || node.next == null){
            return node;
        }
        Node begin = node;
        Node middle = node.next;
        node.next = null;
        Node end = middle.next;
        while(true){
            middle.next = begin;
            if (end == null){
                break;
            }
            begin = middle;
            middle = end;
            end = end.next;
        }
        node = middle;
        return node;
    }
    public Node solutions3(Node node){
        if (node == null){
            return node;
        }
        Stack stack = new Stack();
        Node pre = node;
        while(pre != null){
            stack.push(pre);
            pre = pre.next;
        }
        Node newPre = (Node) stack.pop();
        Node cur = newPre;
        while(!stack.isEmpty()){
            Node node1 = (Node) stack.pop();
            //node1.next = null;
            cur.next = node1;
            cur = cur.next;
        }
        cur.next = null;
        return newPre;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ReversalLinkedList reversalLinkedList = new ReversalLinkedList();
        Node node = reversalLinkedList.solutions1(a);
        Node ref = node;
        for (int i = 1; i <= 5; i++){
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
