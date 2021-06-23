package Match;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;

/**
 * @author ryk
 * @version 1.0.0
 * @ClassName KMP.java
 * @Description TODO
 * @createTime 2021年06月09日 14:10:00
 */
public class KMP {

    public static void main(String[] args) {
        String ps = "aaacd";
        System.out.println(Arrays.toString(getNext(ps)));
    }

    public static int[] getNext(String ps) {
        char[] p = ps.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                next[++j] = ++k;
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
