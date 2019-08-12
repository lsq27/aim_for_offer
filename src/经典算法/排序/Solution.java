package 经典算法.排序;

import java.util.Arrays;

public class Solution {
    private void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    //选择排序
    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index])
                    index = j;
            }
            swap(array, i, index);
        }
    }

    //冒泡排序
    public void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
        }
    }

    //插入排序
    public void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--)
                if (array[j] < array[j - 1])
                    swap(array, j, j - 1);
                else
                    break;
        }
    }

    //希尔排序
    public int[] shellSort(int[] array) {
        //gap每次除以2，直到等于0
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            //s代表不同的分组
            //for (int s = 0; s < gap; s++) {
            //插入排序
            //for (int i = gap + s; i < array.length; i += gap) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i; j >= gap; j -= gap)
                    if (array[j] < array[j - gap])
                        swap(array, j, j - gap);
                    else
                        break;
            }
        }
        return array;
    }

    //归并排序
    public int[] mergeSort(int[] array) {
        if (array.length <= 1)
            return array;
        return merge(mergeSort(Arrays.copyOfRange(array, 0, array.length / 2)),
                mergeSort(Arrays.copyOfRange(array, array.length / 2, array.length)));
    }

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int index = 0;
        for (int i = 0; ; ) {
            for (int j = 0; ; ) {
                if (i == left.length && j != right.length)
                    result[index++] = right[j++];
                else if (i != left.length && j == right.length)
                    result[index++] = left[i++];
                else if (i == left.length)
                    return result;
                else {
                    if (left[i] <= right[j]) {
                        result[index++] = left[i++];
                    } else {
                        result[index++] = right[j++];
                    }
                }
            }
        }
    }

    public int[] quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public void quickSort(int[] array, int left, int right) {
        if (left >= right)
            return;
        int pivot = array[left], i = left, j = right;
        while (i < j) {
            //j指向从右找第一个小于基准的数或等于i
            while (j > left && array[j] >= pivot)
                j--;
            //i指向从左找第一个大于等于基准的数或等于j
            while (i < right && array[i] <= pivot)
                i++;
            if (i < j)
                swap(array, i, j);
        }
        swap(array, left, j);
        quickSort(array, left, j - 1);
        quickSort(array, j + 1, right);
    }

    public int[] quickSort2(int[] array) {
        quickSort2(array, 0, array.length - 1);
        return array;
    }

    //使用一个索引一直指向第一个大数，碰到小的就交换
    private void quickSort2(int[] array, int left, int right) {
        if (left >= right)
            return;
        int idx = left + 1;
        for (int i = left + 1; i <= right; i++) {
            if (array[i] <= array[left]) {
                if (idx != i) {
                    swap(array, i, idx);
                }
                idx++;
            }
        }
        if (idx != left + 1)
            swap(array, idx - 1, left);
        quickSort2(array, left, idx - 2);
        quickSort2(array, idx, right);
    }

    //错误写法，不能从左开始找比如一直碰到大的，突然遇到小的数，产生交换，最后索引左边的数有大有小，分割失败
    private void quickSortWrong(int[] array, int left, int right) {
        if (right - left <= 1)
            return;
        int index = left;
        for (int i = left + 1; i < right; i++) {
            if (array[i] <= array[index]) {
                swap(array, i, index);
                index = i;
            }
        }
        quickSortWrong(array, left, index);
        quickSortWrong(array, index + 1, right);
    }

    public int[] heapSort(int[] array) {
        //形成堆(根比子大)
        for (int i = array.length - 1; i >= 0; i--) {
            heapSort(array, i, array.length);
        }
        //每次把最大的放到最后，不断地确定最大值
        for (int i = 0; i < array.length; i++) {
            swap(array, 0, array.length - 1 - i);
            heapSort(array, 0, array.length - 1 - i);
        }
        return array;
    }

    //向下调整
    public void heapSort(int[] array, int currentRootNode, int size) {
        int left = 2 * currentRootNode + 1;
        int right = 2 * currentRootNode + 2;
        int max = currentRootNode;
        if (left < size) {
            if (array[max] < array[left])
                max = left;
        }
        if (right < size) {
            if (array[max] < array[right])
                max = right;
        }
        if (max != currentRootNode) {
            swap(array, currentRootNode, max);
            heapSort(array, max, size);
        }
    }

    public int[] topk(int[] array, int k) {
        for (int i = k - 1; i >= 0; i--) {
            operateHeap(array, i, k);
        }
        for (int i = k; i < array.length; i++) {
            if (array[i] > array[0]) {
                swap(array, 0, i);
                operateHeap(array, 0, k);
            }
        }
        return Arrays.copyOfRange(array, 0, k);
    }

    public void operateHeap(int[] array, int currentRootNode, int size) {
        int left = 2 * currentRootNode + 1;
        int right = 2 * currentRootNode + 2;
        int min = currentRootNode;
        if (left < size && array[min] > array[left])
            min = left;
        if (right < size && array[min] > array[right])
            min = right;
        if (min != currentRootNode) {
            swap(array, currentRootNode, min);
            operateHeap(array, min, size);
        }
    }

    public void randomSelect(int[] array, int k) {
        partition(array, k, 0, array.length);
    }

    public void partition(int[] array, int k, int start, int end) {
        int idx = start;
        for (int i = start + 1; i < end; i++) {
            if (array[idx] < array[i]) {
                swap(array, i, idx);
                idx = i;
            }
        }
        if (idx < k)
            partition(array, k, idx + 1, end);
        else if (idx > k)
            partition(array, k, start, idx);
    }
}