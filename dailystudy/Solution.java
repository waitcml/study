/**
 * @author chenmingliang
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.complexNumberMultiply("1+1i", "1+1i");
        System.out.println(s);
    }

    public String complexNumberMultiply(String num1, String num2) {
        String[] split1 = num1.split("\\+");
        String[] split2 = num2.split("\\+");
        Integer s1 = Integer.valueOf(split1[0]);
        Integer s2 = Integer.valueOf(split2[0]);
        Integer x1 = Integer.valueOf(split1[1].split("i")[0]);
        Integer x2 = Integer.valueOf(split2[1].split("i")[0]);
        int s3;
        int x3;
        s3 = s1 * s2 - x1 * x2;
        x3 = s1 * x2 + s2 * x1;
        return s3 + "+" + x3 + "i";
    }
}
