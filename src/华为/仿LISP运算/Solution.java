package 华为.仿LISP运算;

import java.util.ArrayList;

public class Solution {
    String emuLISP(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 5; i < str.length(); ) {
            //判断是否为表达式
            if (str.charAt(i) == '(') {
                int count = 1;
                //找到匹配的()
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == '(') {
                        count++;
                    } else if (str.charAt(j) == ')') {
                        count--;
                        if (count == 0) {
                            arrayList.add(emuLISP(str.substring(i, j + 1)));
                            i = j + 2;
                            break;
                        }
                    }
                }
            } else {
                for (int j = i + 1; j < str.length(); j++) {
                    if ((str.charAt(j) == ' ') || (str.charAt(j) == ')')) {
                        arrayList.add(str.substring(i, j));
                        i = j + 1;
                        break;
                    }
                }
            }
        }
        for (String s : arrayList) {
            if (s.equals("error"))
                return "error";
        }
        switch (str.substring(1, 4)) {
            case "add":
                int sum = 0;
                for (String s : arrayList) {
                    sum += Integer.parseInt(s);
                }
                return Integer.toString(sum);
            case "sub":
                return Integer.toString(Integer.parseInt(arrayList.get(0)) - Integer.parseInt(arrayList.get(1)));
            case "mul":
                int result = 1;
                for (String s : arrayList) {
                    result *= Integer.parseInt(s);
                }
                return Integer.toString(result);
            case "div":
                if (Integer.parseInt(arrayList.get(1)) == 0)
                    return "error";
                return Integer.toString(Integer.parseInt(arrayList.get(0)) / Integer.parseInt(arrayList.get(1)));
            default:
                return "error";
        }
    }
}
