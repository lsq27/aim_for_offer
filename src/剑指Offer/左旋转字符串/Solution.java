package 剑指Offer.左旋转字符串;

public class Solution {
    public String LeftRotateString(String str, int n) {
        if (str.isEmpty())
            return str;
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder1.append(str.charAt(n - i - 1));
        }
        for (int i = n; i < str.length(); i++) {
            stringBuilder2.append(str.charAt(str.length() - i + n - 1));
        }
        stringBuilder1.append(stringBuilder2);
        StringBuilder stringBuilder3 = new StringBuilder();
        for (int i = 0; i < stringBuilder1.length(); i++) {
            stringBuilder3.append(stringBuilder1.charAt(stringBuilder1.length() - i - 1));
        }
        return new String(stringBuilder3);
    }
}
