package Queue;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName test.java
 * @Description TODO
 * @createTime 2021年06月08日 14:46:00
 */
public class test {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>(20);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.InQueue("a");
        queue.InQueue("b");
        queue.InQueue("c");
        queue.InQueue("d");
        queue.InQueue("e");
        queue.InQueue("f");
        queue.InQueue("g");
        queue.InQueue("h");
        queue.InQueue("i");
        queue.InQueue("j");
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.OutQueue());
        System.out.println(queue.OutQueue());
        System.out.println(queue.OutQueue());
        System.out.println(queue.OutQueue());
        System.out.println(queue.OutQueue());
        System.out.println(queue.OutQueue());
        System.out.println(queue.OutQueue());
        System.out.println(queue.OutQueue());
        System.out.println(queue.OutQueue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.InQueue("xxx");
        System.out.println(queue.OutQueue());
    }
}
