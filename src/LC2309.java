import java.util.HashSet;
import java.util.Set;

public class LC2309
/*
一般情况下用哈希方法就行   存入该字符串中所有元素
然后从最后往前找  条件是如果该元素在哈希表中即存在大写字母又存在小写字母  则为目标值直接返回
若没有则返回空字符串
 */
{


    public static String greatestLetter(String s) {
        Set<Character> res =new HashSet<Character>();
        for(int i=0;i<s.length();++i){
            char x = s.charAt(i);
            res.add(x);
        }
        for(int i=25;i>=0;i--)
            if (res.contains((char) ('a' + i)) && res.contains((char) ('A' + i))) {
                return String.valueOf((char) ('A' + i));
            }
        return "";
    }

    public static void main(String[] args) {
        String a ="lEeTcOdE";
        greatestLetter(a);
    }
}

