package 经典算法.排序;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void testInsertSort() {
        Solution solution = new Solution();
        int[] array1 = {120, 60, 40, 30, 24};
        int[] result1 = {24, 30, 40, 60, 120};
        solution.insertSort(array1);
        assertArrayEquals(result1, array1);
        int[] array2 = {};
        int[] result2 = {};
        solution.insertSort(array2);
        assertArrayEquals(result2, array2);
        int[] array3 = {24};
        int[] result3 = {24};
        solution.insertSort(array3);
        assertArrayEquals(result3, array3);
    }

    @Test
    void testBubbleSort() {
        Solution solution = new Solution();
        int[] array1 = {120, 60, 40, 30, 24};
        int[] result1 = {24, 30, 40, 60, 120};
        solution.bubbleSort(array1);
        assertArrayEquals(result1, array1);
        int[] array2 = {};
        int[] result2 = {};
        solution.bubbleSort(array2);
        assertArrayEquals(result2, array2);
        int[] array3 = {24};
        int[] result3 = {24};
        solution.bubbleSort(array3);
        assertArrayEquals(result3, array3);
    }

    @Test
    void testSelectionSort() {
        Solution solution = new Solution();
        int[] array1 = {120, 60, 40, 30, 24};
        int[] result1 = {24, 30, 40, 60, 120};
        solution.selectionSort(array1);
        assertArrayEquals(result1, array1);
        int[] array2 = {};
        int[] result2 = {};
        solution.selectionSort(array2);
        assertArrayEquals(result2, array2);
        int[] array3 = {24};
        int[] result3 = {24};
        solution.selectionSort(array3);
        assertArrayEquals(result3, array3);
    }

    @Test
    void testShellSort() {
        Solution solution = new Solution();
        int[] array1 = {120, 60, 40, 30, 24};
        int[] result1 = {24, 30, 40, 60, 120};
        assertArrayEquals(result1, solution.shellSort(array1));
        int[] array2 = {};
        int[] result2 = {};
        assertArrayEquals(result2, solution.shellSort(array2));
        int[] array3 = {24};
        int[] result3 = {24};
        assertArrayEquals(result3, solution.shellSort(array3));
    }

    @Test
    void testMergeSort() {
        Solution solution = new Solution();
        int[] array1 = {120, 60, 40, 30, 24};
        int[] result1 = {24, 30, 40, 60, 120};
        assertArrayEquals(result1, solution.mergeSort(array1));
        int[] array2 = {};
        int[] result2 = {};
        assertArrayEquals(result2, solution.mergeSort(array2));
        int[] array3 = {24};
        int[] result3 = {24};
        assertArrayEquals(result3, solution.mergeSort(array3));
    }

    @Test
    void testQuickSort() {
        Solution solution = new Solution();
        int[] array1 = {1, 2, 3, 3, 4, 3, 2, 1, 1, 2, 3};
        int[] result1 = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4};
        assertArrayEquals(result1, solution.quickSort(array1));
        int[] array2 = {};
        int[] result2 = {};
        assertArrayEquals(result2, solution.quickSort(array2));
        int[] array3 = {24};
        int[] result3 = {24};
        assertArrayEquals(result3, solution.quickSort(array3));
    }

    @Test
    void testQuickSort2() {
        Solution solution = new Solution();
        int[] array1 = {1, 2, 3, 1, 3, 4, 3, 2, 1, 1, 2, 3};
        int[] result1 = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4};
        assertArrayEquals(result1, solution.quickSort2(array1));
        int[] array2 = {};
        int[] result2 = {};
        assertArrayEquals(result2, solution.quickSort2(array2));
        int[] array3 = {24};
        int[] result3 = {24};
        assertArrayEquals(result3, solution.quickSort2(array3));
    }

    @Test
    void testHeapSort() {
        Solution solution = new Solution();
        int[] array1 = {120, 60, 40, 30, 24};
        int[] result1 = {24, 30, 40, 60, 120};
        assertArrayEquals(result1, solution.heapSort(array1));
        int[] array2 = {};
        int[] result2 = {};
        assertArrayEquals(result2, solution.heapSort(array2));
        int[] array3 = {24};
        int[] result3 = {24};
        assertArrayEquals(result3, solution.heapSort(array3));
    }

    @Test
    void testTopk() {
        Solution solution = new Solution();
        int[] array1 = {120, 60, 40, 30, 24};
        int[] result1 = {40, 60, 120};
        assertArrayEquals(result1, solution.topk(array1, 3));
/*        int[] array2 = {};
        int[] result2 = {};
        assertArrayEquals(result2, solution.topk(array2));
        int[] array3 = {24};
        int[] result3 = {24};
        assertArrayEquals(result3, solution.topk(array3));*/
    }

    @Test
    void testTopk2() {
        Solution solution = new Solution();
        int[] array1 = {120, 60, 24, 30, 40};
        int[] array2 = {120, 60, 120, 120, 120};
        int[] result1 = {40, 60, 120};
        solution.randomSelect(array2, 4);
    }
}