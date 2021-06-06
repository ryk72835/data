package LinearList;


/**
 * @author ryk
 * @version 1.0.0
 * @ClassName test.java
 * @Description TODO
 * @createTime 2021年06月03日 16:32:00
 */
public class test {
    public static void main(String[] args) {
        //LinearList<Integer> list = new LinearList<Integer>(200);
        //for (int i = 1; i <= 100; i++){
        //    list.getArray()[i] = i;
        //}
        //for (Integer integer : list.getArray()) {
        //    System.out.println(integer);
        //}
        SqList sqList = new SqList(200);
        for (int i = 1; i < 200; i++){
            sqList.insert(i, i + "!");
        }
        sqList.display();

    }
}
