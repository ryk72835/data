package BinaryTree;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName Tree.java
 * @Description TODO
 * @createTime 2021年06月14日 21:01:00
 * 二叉树的定义
 */
public class Tree {

    public int value;

    public Tree left;

    public Tree right;

    public Tree(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
