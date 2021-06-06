package Offer;

import java.util.Stack;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName offer_06_printLinkedList.java
 * @Description TODO
 * @createTime 2021年06月06日 20:12:00
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 来源：（力扣）https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class offer_06_printLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode node = head;
            int count = 0;
            while (node != null){
                count++;
                node = node.next;
            }
            int [] ints = new int[count];
            int i =0;
            while (head != null){
                ints[i] = head.val;
                head = head.next;
                i++;
            }
            int [] array = new int[count];
            i = 0;
            for (int j = count - 1; j >= 0; j--) {
                array[i] = ints[j];
                i++;
            }
            return array;
        }
        //使用栈
        public int[] reversePrint1(ListNode head){
            Stack stack = new Stack();
            int tmp = 0;
            while (head != null){
                stack.push(head.val);
                tmp++;
                head = head.next;
            }
            int [] array = new int[tmp];
            tmp = 0;
            while (!stack.isEmpty()){
                array[tmp] = (int) stack.pop();
                tmp++;
            }
            return array;
        }
    }
}
