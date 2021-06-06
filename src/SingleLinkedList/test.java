package SingleLinkedList;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName test.java
 * @Description TODO
 * @createTime 2021年06月04日 16:46:00
 */
public class test {
    public static void main(String[] args) {
        NodeMethod<String> node = new NodeMethod<>();
        //System.out.println(node.isEmpty());
        node.addHead("i0");
        for (int i = 1; i <= 5; i++) {
            node.addTail("i" + i);
        }
        node.addMiddle("x10000", 6);
        NodeMethod.Node node1 = node.getHead();
        System.out.println(node.toString());
        //for (int i = 1; i <= node.getSize(); i++){
        //    System.out.println(node1.value);
        //    node1 = node1.next;
        //}
        //System.out.println(node.getNode("x10000"));
        //System.out.println(node.getNodeIndex(5));
        //System.out.println(node.getHead().value);
        //System.out.println(node.isEmpty());
        node.clear();
        System.out.println(node.toString());
    }
}
