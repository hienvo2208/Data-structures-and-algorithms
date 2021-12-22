import java.util.List;

public class Main {
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
          int minIndex = i;
          for(int j=i+1;j<n;j++){
              if (arr[minIndex] > arr[j]){
                  minIndex = j;
              }
          }
          if(minIndex != i){
              int temp = arr[i];
              arr[i]=arr[minIndex];
              arr[minIndex]=temp;
          }

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
        SelectionSort(a);
    }
}
