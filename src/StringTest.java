/**
 * Created by yaoyi on 2017/3/2.
 * 要求给出一个字符串，得出一个整型数组，该数组中每个数字对应的英文字母 1-26 对应a-z。如str="1231",得出1,2,3,1,12,23
 */
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class StringTest {
/*    static String str = "1211234abc";
    static int[] result = new int[str.length() * 2];
    static int k = 0;

    public static void main(String args[]) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                result[k++] = str.charAt(i) - 48;
            }
        }
        result = getNum(str);
        String re = "";
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                char c = (char) (result[i] + 96);
                re += c;
            }
        }
        System.out.print(re);
    }

    public static int[] getNum(String str) {
        int base = 0;
        int next = 1;
        int[] re = result;
        if (str.length() < 2) {
            return re;
        } else if (str.length() >= 2) {
            if (str.charAt(base) >= '1' && str.charAt(base) < '2' || (str.charAt(base) == '2' && str.charAt(next) >= '0' && str.charAt(next) <= '6')) {
                result[k++] = (str.charAt(base) - 48) * 10 + (str.charAt(next) - 48);
            }
            base++;
            next++;
        }
        return getNum(str.substring(base));
    }
}*/
  static String str = "1211228abc";
  static String temp = "";
  static List<Integer> list = new LinkedList<Integer>();
  public static void main(String args[]){
      for(int i=0;i<str.length();i++){
          if(str.charAt(i)>='1' && str.charAt(i) <= '9'){
                 list.add(str.charAt(i)-48);
                 temp += str.charAt(i);
          }
      }
      list = getNum(temp);
      Iterator<Integer> ite = list.iterator();
      while(ite.hasNext()){
          int i = ite.next();
          char c = (char)(i+96);
          System.out.print(c);
      }
  }
  static List<Integer> getNum(String str){
      int base = 0;
      int next = 1;
      List<Integer> re = list;
      if(str.length()<2){
          return re;
      }
      if (str.charAt(base) >= '1' && str.charAt(base) < '2' || (str.charAt(base)=='2' && str.charAt(next) >='0' && str.charAt(next) <='6')) {
          list.add((str.charAt(base) - 48) * 10 + (str.charAt(next) - 48));
      }
      base++;
      next++;
      return getNum(str.substring(base));
  }
}