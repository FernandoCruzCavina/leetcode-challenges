package medium;

public class ZigzagConversion_6 {

    // P   P   A   H
    // A P L S I I G
    // Y   I   R

    // P     P     I
    // A   L S   I G
    // Y A   H R
    // P     I

    //p    h
    //a   si
    //y  i r
    //p l  i g
    //a    n


    //p     r
    //a    ii
    //y   h n
    //p  s  g
    //a i
    //l

    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            int pos = i;
            int step1 = 2 * (numRows - i - 1);
            int step2 = 2 * i;
            boolean useStep1 = true;

            while (pos < s.length()) {
                result.append(s.charAt(pos));

                if (step1 == 0) {
                    pos += step2;
                } else if (step2 == 0) {
                    pos += step1;
                } else {
                    pos += useStep1 ? step1 : step2;
                    useStep1 = !useStep1;
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
