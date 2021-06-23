package Match;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName BF.java
 * @Description TODO
 * @createTime 2021年06月08日 15:39:00
 */
public class BF {
    /**
     * 暴力匹配
     * @param str 主串
     * @param sub 子串
     * @param pos 始匹配位置
     */
    public int matchBF(String str, String sub, int pos) {
        int strIndex = pos - 1;
        int subIndex = 0;
        char [] strChar = str.toCharArray();
        char [] subChar = sub.toCharArray();
        while (strIndex < str.length() && subIndex < sub.length() ){
            if (strChar[strIndex] == subChar[subIndex]){
                subIndex++;
                strIndex++;
            }else {
                strIndex = strIndex - subIndex + 1;
                subIndex = 0;
            }
        }
        if (subIndex == sub.length()){
            return strIndex - subIndex + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "abcdefabcdabcgabc";
        String sub = "abcg";
        int pos = 1;
        BF bf = new BF();
        int s = bf.matchBF(str, sub, pos);
        System.out.println(s);
    }
}
