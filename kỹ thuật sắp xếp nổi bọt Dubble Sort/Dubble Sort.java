import java.util.List;

public class Main {
    public static void BubbleSort(int[] a) {
        int size = a.length - 1;
        while (size >= 0) {
            boolean isSorted = true;
            for (int i = 0; i < size; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            print(a);
            if (isSorted) {
                break;
            }
            size--;
        }
    }

    public static void print(int[] arr) {
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        int[] a1 = {1, 2, 9, 4, 5, 7, 6};
        BubbleSort(a1);


    }
}
