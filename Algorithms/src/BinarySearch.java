import java.util.Arrays;

public class BinarySearch {
    // 一般情况下的二分查找
    // 没有考虑数组中具有多个重复的key的情况
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;  // 直接平均可能会溢出
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    //寻找重复key中第一个出现的位置
    public static int rankFirst(int key, int[] a) {
        int l = 0;
        int h = a.length - 1;
        int m;

        return -1;
    }

    public static void main(String[] args) {

    }
}
