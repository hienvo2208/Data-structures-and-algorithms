import java.util.List;

public class Main {
    //- Cach cua thay cong
    public static void InsertSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n ; i++) {
            int ai = a[i];
            int j=i-1;
            while (j>=0 && a[j]>ai){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=ai; // Cap nhat lai
        }
    }
    //--------------my way------------------
//    public static void InsertSort(int[] a) {
//        int n = a.length;
//        for (int i = 1; i < n ; i++) {
//            for (int j = i - 1; j >=0; j--) {
//                if (a[j] > a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//            print(a);
//        }
//    }
    //--------------my way------------------

    public static void print(int[] arr) {
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        int[] a1 = {1, 2, 9, 4, 5, 7, 6};
        InsertSort(a);

    }
}
