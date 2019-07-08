package 华为.消除重复数字;

public class Solution {
    int removeRepeatedNum(int num) {
        StringBuilder str = new StringBuilder(Integer.toString(num));
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    if (str.charAt(i) < str.charAt(i + 1)) {
                        str.deleteCharAt(i);
                        i--;
                        break;
                    } else {
                        str.deleteCharAt(j);
                        j--;
                    }
            }
        }
        return new Integer(str.toString());
    }
}
