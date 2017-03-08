/**
 * Created by yaoyi on 2017/3/6.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Iterator;
public class MatchParenthesis {
static int k = 0;
    public static void main(String args[]) {
        String str = "(((()))))";

        int result = longestValidParentheses(str);
        System.out.println(2*k);
    }

  /*  public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        String str = "(())()";

    }*/

/*    public static int  validParenthesis(String str) {
        Stack stack = new Stack();
        int k = 0;      //k 判断(的个数
        int p = 0;      //p 判断pair的个数
        if(str.length() == 0){
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
                k++;
            } else if (str.charAt(i) == ')') {
                if (k > 0) {
                    stack.pop();
                    k--;
                    p++;
                } else  continue;
            }
        }
        return 2*p;
    }*/


    public static int  longestValidParentheses(String str) {
        int base = 0;
        int next = 1;
        if(str.length()<=1) {
            return 0;
        }
        if(!(str.charAt(base) == '(' && str.charAt(next) == ')') && k>0)
        {
            return 2*k;
        }
        if (str.charAt(base) == '(' && str.charAt(next) == ')') {
            k++;
            base++;
        }
        return longestValidParentheses(str.substring(++base));
    }
}
