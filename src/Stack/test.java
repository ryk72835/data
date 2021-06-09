package Stack;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName test.java
 * @Description TODO
 * @createTime 2021年06月08日 14:10:00
 */
public class test {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.isEmpty());
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        //System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }
}
