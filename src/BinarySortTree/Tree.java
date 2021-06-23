package BinarySortTree;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName Tree.java
 * @Description TODO
 * @createTime 2021年06月18日 22:07:00
 * 二叉排序树
 * 就是若它的左子树不空，则左子树上所有节点的值均小于它的根节点的值
 * 若它的右子树不空，则右子树上所有节点的值均大于其根节点的值
 */
public class Tree {

    Tree left;
    Tree right;
    int value;

    public Tree(){
        this.left = null;
        this.right = null;
        this.value = 0;
    }

    public Tree(int value){
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
