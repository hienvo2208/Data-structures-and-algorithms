import java.util.Arrays;

public class MyCTDL {
    //    public static int heightChecker(int[] heights) {
//        int n = heights.length;
//        int[] arrCopied = Arrays.copyOf(heights,n);
//
//        // Selection Sort
//        for (int i = 0; i < n; i++) {
//            int minIndex = i;
//            for (int j = i+1; j < n; j++) {
//                if (arrCopied[j] < arrCopied[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            if (minIndex != i) {
//                int temp = arrCopied[i];
//                arrCopied[i] = arrCopied[minIndex];
//                arrCopied[minIndex] = temp;
//            }
//        }
//        int count = 0;
//        for (int i = 0; i < heights.length; i++) {
//            if (arrCopied[i] != heights[i]) {
//                count++;
//            }
//        }
//        return count;
//    }
//    public int fib(int n) {
//        int[] F = new int[n];
//        F[0] = 0;
//        F[1] = 1;
//        F[2] = 1;
//        for (int i = 3; i < n; i++) {
//            F[i] = F[i - 1] + F[i - 2];
//        }
//        return F[n-1];
//    }0,
//    public static void reverseString(char[] s) {
//
//       String s1 = s.toString();
//       int n = s1.length();
//       String result ="";
//       for(int i=0;i<n;i++){
//           result += s1.substring(n-i-1,n-i);
//       }
//       s = s1.toCharArray();
//    }

    //    public static void main(String[] args) {
//        char[] s = {'h','e','l','l','o'};
//
//        reverseString(s);
//    }
    public static void duyetMang(int[] arr, int i) {
        // Công thức dừng

        if (i == 0) {
            System.out.println(arr[i]);
            return;
        }
        // Công thức quy nạp
        System.out.println(arr[i]);
        duyetMang(arr, i - 1);
    }

    //
//    public static void DuyetString(String s, int i) {
//        if (i == 0) {
//            System.out.print(s.charAt(i));
//            return;
//        }
//        DuyetString(s, i - 1);
//        System.out.print(s.charAt((i)));
//    }
//1234
//4 => (123)
//3 => (12)
//2 => (1)
//1 => ("")
//"" => do nothing
//    public static void DuyetStringNonAug(String s) {
//        if (s.isEmpty()) {
//            return;
//        }
//        char lastString = s.charAt(s.length() - 1);
//        String boLastString = s.substring(0, s.length() - 1);
//        DuyetStringNonAug(boLastString);
//        System.out.print(lastString);
//    }
    public static int search(int[] nums, int target) {
        int iL = 0;
        int iR = nums.length - 1;
        while (iL <= iR) {
            int mid = (iL + iR) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                iR = mid - 1;
            } else if (nums[mid] < target) {
                iL = mid + 1;
            }

        }
        return -1;
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                max = nums[i];
                count = 1;
            }
        }
        return max;
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int start = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[nums.length - 1] != nums.length) {
                return nums.length;
            }
            if (nums[i] == start) {
                start++;
            } else {
                result = start++;
                return result;
            }
        }
        return result;
    }

    public static boolean isSubsequence(String s, String t) {

        int i = 0; //  cua s abc
        int j = 0; // cua t ahbgdc
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;

        }
        return i == s.length();
    }

    public static void main(String[] args) {
        String t = "abc";
        String s = "ahbgdc";
        isSubsequence(t, s);
    }
}
