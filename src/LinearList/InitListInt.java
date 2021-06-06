package LinearList;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName InitListInt.java
 * @Description TODO
 * @createTime 2021年06月04日 15:14:00
 */
public class InitListInt {
    private Integer length;

    private int [] array;

    public InitListInt(int max){
        this.array = new int[max];
        this.length = 0;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
