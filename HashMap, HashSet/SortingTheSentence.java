public class SortingTheSentence {
    public static String sortSentence(String s) {
        String arr[] = s.split(" ");
        String newArr[] = new String[arr.length];
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int size = arr[i].length();
            int p = arr[i].charAt(size - 1) - '1';
            newArr[p] = arr[i].substring(0, size - 1);
        }
        int j = 0;
        while (j < newArr.length) {
            result += " " + newArr[j];
            j++;
        }
        return result.substring(1);
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
