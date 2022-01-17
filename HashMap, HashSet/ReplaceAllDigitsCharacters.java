public class ReplaceAllDigitsCharacters {
    public static String replaceDigits(String s) {
        char[] arrS = s.toCharArray();
        int i = 0;
        while (i < arrS.length) {
            int po =  arrS[i + 1] -'0';
            arrS[i+1]=shift(arrS[i],po);
            i = i + 2;
        }
        String result = "";
        for (int k = 0; k < arrS.length; k++) {
            result += arrS[k];
        }
        return result;
    }

    public static char shift(char c, int p) {
        int temp2 = (int)c;
        int temp = temp2+p;
        return (char) temp;
    }

    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        replaceDigits(s);
    }
}
