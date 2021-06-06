package LinearList;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName SqList.java
 * @Description TODO
 * @createTime 2021年06月03日 15:57:00
 */
public class SqList implements IList{

    //private int max;

    public SqList(int max) {
        //this.max = min;
        this.initList = new InitList(max);
    }

    private InitList initList;

    /**
     * 清零
     */
    @Override
    public void clear() {
        initList.setLength(0);
    }

    /**
     * 检查是否为空
     * @return true为空，false不为空
     */
    @Override
    public boolean isEmpty() {
        if (initList.getLength() == 0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 返回线性表长度
     * @return 线性表长度
     */
    @Override
    public int length() {
        return initList.getLength();
    }

    /**
     * 获取线性表中指定元素的值
     * @param i 指定个数
     * @return
     */
    @Override
    public Object get(int i) {
        if (i < 1 || i > initList.getLength()){
            return null;
        }
        return initList.getArray()[i-1];
    }

    /**
     * 向指定位置插入元素
     * @param i
     * @param x
     */
    @Override
    public void insert(int i, Object x) {
        if (initList.getLength() == initList.getArray().length){
            return;
        }
        for (int j = initList.getLength() - 1; j >= i - 1; j-- ){
            initList.getArray()[j + 1] = initList.getArray()[j];
        }
        initList.getArray()[i - 1] = x;
        initList.setLength(initList.getLength() + 1);
    }

    /**
     * 移除元素
     * @param i
     */
    @Override
    public boolean remove(int i) {
        if (i == initList.getLength() ){
            initList.setLength(initList.getLength() - 1);
            return true;
        }
        for (int j = i - 1; j < initList.getLength() - 1; j++){
            initList.getArray()[j] = initList.getArray()[j + 1];
        }
        initList.setLength(initList.getLength() - 1);
        return true;
    }

    /**
     *  返回指定元素的索引
     * @param x
     * @return
     */
    @Override
    public int indexOf(Object x) {
        for (int i = 0; i <= initList.getLength() - 1; i++){
            if (initList.getArray()[i] == x){
                return i + 1;
            }
        }
        return 0;
    }

    @Override
    public void display() {
        for (int i = 0; i <= initList.getLength() - 1; i++){
            System.out.println(initList.getArray()[i]);
        }
    }
}
