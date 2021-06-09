package Offer;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName offer_52_FirstSameNode.java
 * @Description TODO
 * @createTime 2021年06月07日 14:00:00
 * 输入两个链表，找出它们的第一个公共节点。
 *
 * 来源：（力扣）https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 */
public class offer_52_FirstSameNode {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    /**
     * 使用了一个类似于下面中的模型,headA = [4,1,8,4,5], headB =[5,0,1,8,4,5]
     * 在下面的语句中遍历了
     *                  4,1,8,4,5,5,0,1,  (共同部分)8,4,5
     *                  5,0,1,8,4,5,4,1,  (共同部分)8,4,5
     * 便利得出结果 8，4，5
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode A = headA;
            ListNode B = headB;
            while (A != B){
                if (A != null){
                    A = A.next;
                }else {
                    A = headB;
                }
                if (B != null){
                    B = B.next;
                }else {
                    B = headA;
                }
            }
            return A;
        }
    }
}
