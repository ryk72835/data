package BinaryTree;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName Cueing.java
 * @Description TODO
 * @createTime 2021年06月15日 01:25:00
 * 对二叉树进行线索化
 */
public class Cueing {

    public static TBTree pre ;

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
     * 中序线索化二叉树
     * @param tree
     */
    public static void InorderTreeCueing(TBTree tree){
        if (tree == null){
            return;
        }
        InorderTreeCueing(tree.left);
        if (tree.left == null){
            tree.left = pre;
            tree.lTag = 1;
        }
        if (pre != null && pre.right == null){
            pre.right = tree;
            pre.rTag = 1;
        }
        pre = tree;
        InorderTreeCueing(tree.right);
    }

    /**
     * 中序遍历线索化二叉树
     * @param tree 线索二叉树的根节点
     */
    public static void InorderTree(TBTree tree){
        while (tree != null){
            while (tree.lTag == 0){
                tree = tree.left;
            }
            System.out.println(tree.value);
            while (tree.rTag == 1){
                tree = tree.right;
                System.out.println(tree.value);
            }
            tree = tree.right;
        }
    }

    public static void main(String[] args) {
        TBTree root = new TBTree(1);
        TBTree tree = root;
        TBTree node1 = new TBTree(2);
        TBTree node2 = new TBTree(3);
        TBTree node3 = new TBTree(4);
        TBTree node4 = new TBTree(5);
        TBTree node5 = new TBTree(6);
        TBTree node6 = new TBTree(7);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        System.out.println("================中序线索化二叉树================");
        //InorderTreeCueing(root);
        //PreOrderCueing(root);
        PostOrderCueing(tree);
        System.out.println("================中序遍历二叉树================");
        //InorderTree(tree);
        //PreOrderTree(tree);
        PostOrderTree(tree);
    }

    /**
     * 先序线索化二叉树
     * @param tree
     */
    public static void PreOrderCueing(TBTree tree){
        if (tree == null){
            return;
        }
        if (tree.left == null){
            tree.left = pre;
            tree.lTag = 1;
        }
        if (pre != null && pre.right == null){
            pre.right = tree;
            pre.rTag = 1;
        }
        pre = tree;
        if (tree.lTag == 0){
            PreOrderCueing(tree.left);
        }
        if (tree.rTag == 0){
            PreOrderCueing(tree.right);
        }
    }

    /**
     * 先序遍历线索化二叉树
     * @param tree 线索二叉树的根节点
     */
    public static void PreOrderTree(TBTree tree){
        while (tree != null){
            while (tree.lTag == 0){
                System.out.println(tree.value);
                tree = tree.left;
            }
            System.out.println(tree.value);
            tree = tree.right;
        }
    }

    /**
     * 后序线索化二叉树
     * @param tree
     */
    public static void PostOrderCueing(TBTree tree){
        if (tree == null){
            return;
        }
        PostOrderCueing(tree.left);
        PostOrderCueing(tree.right);
        if (tree.left == null){
            tree.left = pre;
            tree.lTag = 1;
        }
        if (pre != null && pre.right == null){
            pre.right = tree;
            pre.rTag = 1;
        }
        pre = tree;
    }

    /**
     * 先序遍历线索化二叉树
     * @param tree 线索二叉树的根节点
     */
    public static void PostOrderTree(TBTree tree){

    }
}
