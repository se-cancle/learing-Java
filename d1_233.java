//import static java.util.Arrays.binarySearch;

public class d1_233 {
    public static void main(String[] args) {
//        给定一个有序整型数组, 实现二分查找
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int pos = binarySearch(arr, 6);
        System.out.println(pos);
    }
    private static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
                right = mid - 1;
            } else if (toFind > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

