package BinaryTree;

import java.util.LinkedList;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName ergodic.java
 * @Description TODO
 * @createTime 2021年06月14日 21:04:00
 * 二叉树的遍历
 */
public class ergodic {

    /**
     * 先序遍历
     * @param tree
     */
    public static void PreOrderTree(Tree tree){
        if (tree == null){
            return;
        }else {
            System.out.println(tree.value);
            PreOrderTree(tree.left);
            PreOrderTree(tree.right);
        }
    }

    /**
     * 中序遍历
     * @param tree
     */
    public static void InorderTree(Tree tree){
        if (tree == null){
            return;
        }else {
            InorderTree(tree.left);
            System.out.println(tree.value);
            InorderTree(tree.right);
        }
    }

    /**
     * 后序遍历
     * @param tree
     */
    public static void PostOrderTree(Tree tree){
        if (tree == null){
            return;
        }else {
            PostOrderTree(tree.left);
            PostOrderTree(tree.right);
            System.out.println(tree.value);
        }
    }

    /**
     * 层次遍历
     * @param tree
     */
    public static void LevelTree(Tree tree){
        if (tree == null){
            return;
        }else {
            LinkedList<Tree> linkedList = new LinkedList<>();
            linkedList.add(tree);
            Tree cur = null;
            while (!linkedList.isEmpty()){
                cur = linkedList.pop();
                System.out.println(cur.value + "-->");
                if (cur.left != null){
                    linkedList.add(cur.left);
                }
                if (cur.right != null){
                    linkedList.add(cur.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree(0);
        tree.value = 1;
        Tree tree1 = tree;
        Tree tree2 = new Tree(2);
        tree1.left = tree2;
        Tree tree3 = new Tree(3);
        tree1.right = tree3;
        Tree tree4 = new Tree(4);
        Tree tree5 = new Tree(5);
        Tree tree6 = new Tree(6);
        Tree tree7 = new Tree(7);
        tree2.left = tree4;
        tree2.right = tree5;
        tree3.left = tree6;
        tree3.right = tree7;
        //InorderTree(tree);
        //PreOrderTree(tree);
        PostOrderTree(tree);
        //LevelTree(tree);
    }
}
