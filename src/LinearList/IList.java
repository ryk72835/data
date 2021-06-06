package LinearList;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName IList.java
 * @Description TODO
 * @createTime 2021年06月03日 15:55:00
 */
public interface IList {
    /**
     * 将一个已经存在的线性表置成空表
     */
    public void clear();
    /**
     * 判断当前线性表中的数据元素个数是否为0,若为0则函数返回true，否则返回false
     */
    public boolean isEmpty();
    /**
     * 求线性表中的数据元素个数并由函数返回其值
     */
    public int length();
    /**
     * 读取到线性表中的第i个数据元素并由函数返回其值。其中i取值范围为：0≤i≤length()-1,如果i值不在此范围则抛出异常
     */
    public Object get(int i);
    /**
     * 在线性表的第i个数据元素之前插入一个值为x的数据元素。其中i取值范围为：0≤i≤length()。如果i值不在此范围则抛出异常,当i=0时表示在表头插入一个数据元素x,当i=length()时表示在表尾插入一个数据元素x
     */
    public void insert(int i, Object x) ;
    /**
     * 将线性表中第i个数据元素删除。其中i取值范围为：0≤i≤length()- 1,如果i值不在此范围则抛出异常
     */
    public boolean remove(int i) ;
    /**
     * 返回线性表中首次出现指定元素的索引，如果列表不包含此元素，则返回 -1
     */
    public int indexOf(Object x);
    /**
     * 输出线性表中的数据元素
     */
    public void display();

}
