package LinearList;

/**
 * 顺序表的初始化
 * @author ryk
 * @version 1.0.0
 * @ClassName InitList.java
 * @Description TODO
 * @createTime 2021年06月03日 16:00:00
 */
public class InitList<T> {

    private Integer length;

    private T [] array;

    public InitList(int max){
        this.array = (T[]) new Object[max];
        this.length = 0;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = (T[]) array;
    }
}
