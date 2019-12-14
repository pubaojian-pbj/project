/**
 * 
 */
package 面试算法题;

public class QuickSort {

    public static void quickSort(int[] a, int low, int high) {
        if (low >= high) return;

        int i = low;
        int j = high;
        int index = a[i];

        while (i < j) {
            while (i < j && a[j] >= index) {
                j--;
            }
            if (i < j) {
                a[i++] = a[j];
            }
            while (i < j && a[i] < index) {
                i++;
            }
            if (i < j) {
                a[j--] = a[i];
            }
        }

        a[i] = index;
        quickSort(a, low, i - 1);
        quickSort(a, i + 1, high);
    }

    public static void main(String[] args) {
        int[] a = {56, 35, 88, 44, 34, 65, 1, 8};
        quickSort(a, 0, a.length - 1);
        for (int i : a) System.out.print(i + " ");
    }
}
