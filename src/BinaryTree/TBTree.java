package BinaryTree;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName ThreadedBinaryTree.java
 * @Description TODO
 * @createTime 2021年06月15日 01:16:00
 * 线索二叉树
 */
public class TBTree {

    int value;
    int lTag,rTag;
    TBTree left;
    TBTree right;

    public TBTree(int value){
        this.value = value;
        this.lTag = 0;
        this.rTag = 0;
        this.left = null;
        this.right = null;
    }

}
