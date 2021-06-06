package SingleLinkedList;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName MergeLinkedList.java
 * @Description TODO
 * @createTime 2021年06月06日 00:03:00
 */
public class MergeLinkedList {

    public Node solutions(Node list1, Node list2){
        Node cur = new Node(0);
        Node node = cur;
        while (list1 != null && list2 != null){
            if (list1.value > list2.value){
                node.next = list2;
                list2 = list2.next;
            }else{
                node.next = list1;
                list1 = list1.next;
            }
            node = node.next;
        }
        /**
         * 此处在上面最后一行代码中执行了以下代码
         * node = node.next;
         * 此时node是一个新的节点，同时node的值为null
         * 在下面的复制过程中，node的原本结构时“ value + next ”的方式
         * 在if语句中实现了node.next = list1/list2。
         * 此时，对node来说，在node后的next不为null
         * 所以在最后面node = node.next中，只是到了node的最后一个节点上
         * 所以在node的遍历过程中是不会出现一个空值的
         */
        if (list1 != null){
            node.next = list1;
        }else {
            node.next = list2;
        }
        return cur.next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node nodea = new Node(6);
        Node nodeb = new Node(11);
        node1.next = nodea;
        nodea.next = nodeb;
        Node node2 = new Node(5);
        Node nodec = new Node(9);
        Node noded = new Node(15);
        Node nodee = new Node(21);
        node2.next = nodec;
        nodec.next = noded;
        noded.next = nodee;
        MergeLinkedList mergeLinkedList = new MergeLinkedList();
        Node node = mergeLinkedList.solutions(node1, node2);
        Node node3 = node;
        for (int i = 1; i <= 7; i++) {
            System.out.println(node3.value);
            node3 = node3.next;
        }
    }

}
