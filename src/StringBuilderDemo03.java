
    public class StringBuilderDemo03 {
        public static void main(String[] args) {

            //StringBuilder转换为String
            StringBuilder sb1 = new StringBuilder();
            sb1.append("hello");
            //String s = sb; //这个是错误的做法
            //public String toString ():通过toString() 就可以实现把StringBuilder 转换为String
            String s = sb1.toString();
            System.out.println(s);

            //String转换为StringBuilder
            String ss = "hello";
            //StringBuilder sb = s; //这个是错误的做法
            //public StringBuilder(String s): 通过构造方法就可以实现把String 转换为StringBuilder
            StringBuilder sb2 = new StringBuilder(s);
            System.out.println(sb2);
        }
    }

