package AVL;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName Tree.java
 * @Description TODO
 * @createTime 2021年06月18日 23:34:00
 * 平衡二叉树
 * 在AVL树中，任一节点对应的两棵子树的最大高度差为，同时平衡二叉树也是二叉排序树
 */
public class Tree {

    int depth;
    BinarySortTree.Tree left;
    BinarySortTree.Tree right;
    int value;

    public Tree(){
        this.left = null;
        this.right = null;
        this.value = 0;
    }

    public Tree(int value){
        this.depth =0;
        this.left = null;
        this.right = null;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Tree{" +
                ", value=" + value +
                '}';
    }
}
