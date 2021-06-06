package Offer;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName offer_18_deleteNode.java
 * @Description TODO
 * @createTime 2021年06月06日 20:00:00
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 *
 * 来源：（力扣）https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
public class offer_18_deleteNode {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public class Solution {
        public ListNode deleteNode(ListNode head, int val) {
            ListNode newNode = head;
            if(head.val == val){
                head = head.next;
            }else{
                while (newNode.next != null){
                    if (newNode.next.val == val){
                        newNode.next = newNode.next.next;
                        return head;
                    }
                    newNode = newNode.next;
                }
            }
            return head;
        }
    }
}
