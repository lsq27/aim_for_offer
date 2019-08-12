package 经典算法.二分法查找;

public class Solution {
    //二分查找
    public static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (value == arr[mid])
                return mid;
            if (value > arr[mid])
                low = mid + 1;
            if (value < arr[mid])
                high = mid - 1;
        }
        return -1;
    }

    //二分查找,返回最接近value的小值
    public static int binarySearch2(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        int mid = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (value == arr[mid])
                return mid;
            if (value > arr[mid])
                low = mid + 1;
            if (value < arr[mid])
                high = mid - 1;
        }
        if (arr[mid] < value)
            return mid;
        else return mid - 1;
    }
}
