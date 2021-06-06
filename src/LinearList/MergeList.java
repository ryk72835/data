package LinearList;

/**
 * 两个有序顺序表合成一个表
 * @author ryk
 * @version 1.0.0
 * @ClassName MergeList.java
 * @Description TODO
 * @createTime 2021年06月03日 16:58:00
 */
public class MergeList {
    public InitListInt solutions(InitListInt i1, InitListInt i2){
        Integer index1 = 0;
        Integer index2 = 0;
        InitListInt s = new InitListInt(i1.getLength() + i2.getLength());
        Integer index = 0;

        while(index1 < i1.getLength() && index2 < i2.getLength() ){
            if (i1.getArray()[index1] < i2.getArray()[index2]){
                s.getArray()[index] = i1.getArray()[index1];
                index1++;
            }else{
                s.getArray()[index] = i2.getArray()[index2];
                index2++;
            }
            index++;
        }
        while (index1 < i1.getLength()){
            s.getArray()[index] = i1.getArray()[index1];
            index1++;
            index++;
        }
        while (index2 < i2.getLength()){
            s.getArray()[index] = i2.getArray()[index2];
            index2++;
            index++;
        }
        s.setLength(s.getArray().length + 1);
        return s;
    }

    public static void main(String[] args) {
        MergeList mergeList = new MergeList();
        InitListInt i1 = new InitListInt(4);
        i1.setLength(4);
        i1.setArray(new int[]{3,5,8,11});

        InitListInt i2 = new InitListInt(7);
        i2.setLength(7);
        i2.setArray(new int[]{2,6,8,9,11,15,20});
        InitListInt s = mergeList.solutions(i1, i2);
        for (Integer integer : s.getArray()) {
            System.out.println(integer);
        }
    }
}
