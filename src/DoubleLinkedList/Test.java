package DoubleLinkedList;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2021年06月06日 19:33:00
 */
public class Test {
    public static void main(String[] args) {
        DoubleList<Integer> doubleList = new DoubleList<>();
        System.out.println(doubleList.isEmpty());
        doubleList.addIndex(1, 1);
        doubleList.addIndex(2, 2);
        doubleList.addIndex(3, 3);
        doubleList.addIndex(4, 4);
        doubleList.addIndex(5, 5);
        doubleList.addHead(10);
        doubleList.addTail(9);
        doubleList.removeTail();
        doubleList.removeHead();
        doubleList.removeIndex(3);
        System.out.println(doubleList.isEmpty());
        System.out.println(doubleList.toString());
    }
}
