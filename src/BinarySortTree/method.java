package BinarySortTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName method.java
 * @Description TODO
 * @createTime 2021年06月18日 22:10:00
 */
public class method {

    /**
     * 找到最小的值
     * @param tree
     * @return 返回-1的时候，表示tree为空
     */
    public static int SearchMin(Tree tree){
        if (tree == null){
            return -1;
        }
        while (tree.left != null){
            tree = tree.left;
        }
        return tree.value;
    }
    /**
     * 找到最大的值
     * @param tree
     * @return 返回-1的时候，表示tree为空
     */
    public static int SearchMax(Tree tree){
        if (tree == null){
            return -1;
        }
        while (tree.right != null){
            tree = tree.right;
        }
        return tree.value;
    }

    /**
     * 添加节点
     * @param tree
     * @param node
     */
    public static void insertNode(Tree tree, Tree node){
        if (tree == null){
            tree = node;
            return;
        }
        if (tree.value == node.value){
            return;
        }
        if (tree.value > node.value){
            if (tree.left == null){
                tree.left = node;
            }else {
                insertNode(tree.left, node);
            }
        }
        if (tree.value < node.value){
            if (tree.right == null){
                tree.right = node;
            }else {
                insertNode(tree.right, node);
            }
        }
    }

    /**
     * 找到最小的节点
     * @param tree
     * @return
     */
    public static Tree SearchMinNode(Tree tree){
        if (tree == null){
            return null;
        }
        while (tree.left != null){
            tree = tree.left;
        }
        return tree;
    }

    /**
     * 删除节点
     * 在删除节点中的主要有三种情况：
     * 1.当被删除节点不存在左子树和右子树，直接让双亲结点指向为空
     * 2.当被删除节点存在左子树或者右子树，删除节点后，直接让双亲结点指向被删除节点的左子树还是右子树
     * 3.当被删除节点存在左子树和右子树的时候，删除节点后，让双亲结点指向被删除节点的剩余节点中的最小的结点，然后将剩余结点连接到这个结点上
     *
     */
    static int tag = 0;//tag记录使用的是左子树还是右子树 0为左子树 1为右子树
    static Tree parent;//记录双亲结点
    public static void deleteNode(Tree tree, int value){
        if (tree == null){
            return;
        }
        if (tree.value == value){
            if (tree.right == null && tree.left == null){//无左无右
                if (tag == 0){
                    parent.left = null;
                }else {
                    parent.right = null;
                }
            } else if (tree.right == null && tree.left != null){
                if (tag == 0){
                    parent.left = tree.left;
                }else {
                    parent.right = tree.left;
                }
            } else if (tree.right != null && tree.left == null){
                if (tag == 0){
                    parent.left = tree.right;
                }else {
                    parent.right = tree.right;
                }
            }
            else {
                Tree min = SearchMinNode(tree);
                if (tag == 0){
                    parent.left = min;
                    min.right = tree.right;
                }else {
                    parent.right = min;
                    min.right = tree.right;
                }
            }
        }else if(tree.value > value){
            parent = tree;
            tag = 0;
            deleteNode(tree.left, value);
        }else {
            parent = tree;
            tag = 1;
            deleteNode(tree.right,value);
        }
    }

    /**
     * 层次遍历
     * @param tree
     */
    public static void ergodic(Tree tree){
        if (tree == null){
            return;
        }
        Queue<Tree> queue = new LinkedList<Tree>();
        queue.add(tree);
        Tree cur = null;
        while (!queue.isEmpty()){
            cur = queue.poll();
            System.out.printf(cur.value + "-->");
            if (cur.left != null){
                queue.add(cur.left);
            }
            if (cur.right != null){
                queue.add(cur.right);
            }
        }
    }

    /**
     * 树的结构(上为左子树)
     *                        |-->8
     *                 |-->10
     *                 |      |-->11
     *                 |
     *          |-->12
     *          |      |
     *          |      |       |-->13
     *          |      |-->15
     *          |              |-->16
     *          |
     *    17-->
     *          |
     *          |
     *          |        |-->18
     *          |        |
     *          |        |
     *          |-->19
     *                   |
     *                   |       |-->22
     *                   |-->25
     *
     * @param args
     */

    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree17 = new Tree(17);
        Tree tree12 = new Tree(12);
        Tree tree10 = new Tree(10);
        Tree tree8 = new Tree(8);
        Tree tree11 = new Tree(11);
        Tree tree15 = new Tree(15);
        Tree tree13 = new Tree(13);
        Tree tree16 = new Tree(16);
        Tree tree19 = new Tree(19);
        Tree tree18 = new Tree(18);
        Tree tree25 = new Tree(25);
        Tree tree22 = new Tree(22);
        tree17.left = tree12;
        tree17.right = tree19;
        tree12.left = tree10;
        tree12.right = tree15;
        tree10.left = tree8;
        tree10.right = tree11;
        tree15.left = tree13;
        tree15.right = tree16;
        tree19.left = tree18;
        tree19.right = tree25;
        tree25.left = tree22;
        tree = tree17;
        //System.out.println(SearchMax(tree));
        //System.out.println(SearchMin(tree));
        //Tree tree6 = new Tree(6);
        //insertNode(tree, tree6);
        //insertNode(tree, new Tree(26));
        //insertNode(tree, new Tree(5));
        //insertNode(tree, new Tree(7));
        /**
         * 17-->12-->19-->10-->15-->18-->25-->8-->11-->13-->16-->22-->26-->6-->5-->7-->
         */
        //deleteNode(tree, 15);
        /**
         * before:17-->12-->19-->10-->15-->18-->25-->8-->11-->13-->16-->22-->
         * after:17-->12-->19-->10-->13-->18-->25-->8-->11-->16-->22-->
         */
        //deleteNode(tree, 8);
        /**
         * after:17-->12-->19-->10-->15-->18-->25-->11-->13-->16-->22-->
         */
        //deleteNode(tree, 25);
        /**
         * after:17-->12-->19-->10-->15-->18-->22-->8-->11-->13-->16-->
         */
        ergodic(tree);
    }
}
