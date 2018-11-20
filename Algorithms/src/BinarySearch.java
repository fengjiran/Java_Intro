import java.util.Arrays;

public class BinarySearch {
    // 假设数组是递增序列
    // 一般情况下的二分查找，经典的二分查找
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

    // 假设数组是递增序列
    // 寻找重复key中第一个出现的位置
    public static int rankFirst(int key, int[] a) {
        int l = 0;
        int h = a.length - 1;
        int m;
        while (l <= h) {
            m = l + (h - l) / 2;
            if (key < a[m])
                h = m - 1;
            else if (key > a[m])
                l = m + 1;
            else {
                while (m >= 0 && key == a[m])
                    m--;
                m++;
                return m;
            }
        }

        return -1;
    }

    // 假设数组是递增序列
    // 寻找重复key中最后一个出现的位置
    public static int rankLast(int key, int[] a) {
        int l = 0;
        int h = a.length - 1;
        int m;
        while (l <= h) {
            m = l + (h - l) / 2;
            if (key < a[m])
                h = m - 1;
            else if (key > a[m])
                l = m + 1;
            else {
                while (m <= a.length - 1 && key == a[m])
                    m++;
                m--;
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 3, 3, 3, 3, 4, 5};
        int loc1 = rank(3, a);
        int loc2 = rankFirst(3, a);
        int loc3 = rankLast(3, a);
        System.out.println(loc1);
        System.out.println(loc2);
        System.out.println(loc3);

    }
}
