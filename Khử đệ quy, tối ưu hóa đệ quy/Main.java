public class Main {
    public static void printString(String s, int i) {
        if (s.charAt(i) < 0) {
            return;
        }
        printString(s, i - 1);
        System.out.println(s.charAt(i) + " ");
    }

    public static int Fibonaci(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        return Fibonaci(n - 1) + Fibonaci(n - 2);
    }

    static int[] F = new int[1000];

    public static int FibonaciVer2(int n) {
        if (F[n] != 0) {
            return F[n];
        }
        System.out.println("Can tinh F [" + n + "]");
        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        return F[n] = FibonaciVer2(n - 1) + FibonaciVer2(n - 2);

    }

    public static int GiaiThua(int n) {
        if (n == 0) return 1;
        return n * GiaiThua(n - 1);
    }

    public static void printElement(int[] arr, int index) {
        if (index < 0) {
            return;
        }

        printElement(arr, index - 1);
        System.out.print(arr[index] + " ");

    }
    // De quy co nho

    // Khử đẹ quy
//    public static void main(String[] args) {
//        int[] Fibo = new int[11];
//        // Bai toan co so
//        Fibo[0] = 0;
//        Fibo[1] = 1;
//        Fibo[2] = 1;
//        for (int i = 3; i < 11; i++) {
//            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
//        }
//        System.out.println("fibo[" + 10 + "]" + Fibo[10]);
//    }
    public static int Binary(int[] a, int key){
        int iL = 0;
        int iR = a.length-1;
        while(iL<=iR){
            if(a[(iL+iR)/2] > key){
                iR = (iL+iR)/2-1;
            }else if (a[(iL+iR)/2] < key){
                iL = (iL+iR)/2+1;
            }else{
                return (iL+iR)/2;
            }
        }
        return -1;
    }
    public static int BinaryRecursion(int[] a, int key){

    }

    public static void main(String[] args) {
        int[] arr = {1,7,9,12,17,21,26,30,39,41,51,55,64,69,72,81,86};

        System.out.println(Binary(arr, 26));
    }
}
