package 替换空格;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void addition() {
        StringBuffer str = new StringBuffer("We Are Happy");
        assertEquals("We%20Are%20Happy", solution.replaceSpace(str));
    }
}