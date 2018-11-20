import java.util.Arrays;

public class BinarySearch {
    // 假设数组是非递减序列
    // 一般情况下的二分查找，经典的二分查找
    // 没有考虑数组中具有多个重复的key的情况
    private static int rank(int key, final int[] a) {
        // 判断数组是否为空
        if (a == null || a.length == 0)
            return -1;

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

    // 假设数组是非递减序列
    // 寻找重复key中第一个出现的位置
    private static int rankFirst(int key, final int[] a) {
        // 判断数组是否为空
        if (a == null || a.length == 0)
            return -1;

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

    // 假设数组是非递减序列
    // 寻找重复key中最后一个出现的位置
    private static int rankLast(int key, final int[] a) {
        // 判断数组是否为空
        if (a == null || a.length == 0)
            return -1;

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

    private static int rankFirstII(int key, final int[] a) {
        if (a == null || a.length == 0)
            return -1;

        int l = 0;
        int h = a.length - 1;
        int m;
        while (l <= h) {
            m = l + (h - l) / 2;
            if (key <= a[m])  // 即使key==a[m],也要移动边界
                h = m;
            else
                l = m + 1;

            if (l == h && key == a[m])
                return l;
            if (l == h && key != a[m])
                return -1;
        }

        return -1;
    }

    private static int rankLastII(int key, final int[] a) {
        if (a == null || a.length == 0)
            return -1;

        int l = 0;
        int h = a.length - 1;
        int m;
        while (l <= h) {
            m = l + (h - l + 1) / 2;
            if (key >= a[m])
                l = m;
            else
                h = m - 1;

            if (l == h && key == a[m])
                return h;
            if (l == h && key != a[m])
                return -1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 3, 3, 3, 4, 5};
        int loc1 = rank(1, a);
        int loc2 = rankFirst(3, a);
        int loc3 = rankLast(6, a);
        int loc4 = rankFirstII(6, a);
        int loc5 = rankLastII(6, a);
        System.out.println(loc1);
        System.out.println(loc2);
        System.out.println(loc3);
        System.out.println(loc4);
        System.out.println(loc5);

    }
}
