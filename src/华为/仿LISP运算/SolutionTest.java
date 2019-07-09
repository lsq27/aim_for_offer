package 华为.仿LISP运算;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals("error", solution.emuLISP("(add 11 22 (div 1 0) -1)"));
        assertEquals("33", solution.emuLISP("(add 11 22 1 -1)"));
        assertEquals("23", solution.emuLISP("(add (div (mul 5 5) 22) 22)"));
        assertEquals("1", solution.emuLISP("(div (mul 5 5) 22)"));
    }
}