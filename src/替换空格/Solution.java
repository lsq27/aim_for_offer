package 替换空格;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        /**
         * StringBuilder、StringBuffer区别
         */
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                s.append("%20");
            } else {
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
}
