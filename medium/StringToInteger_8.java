package medium;

public class StringToInteger_8 {
    public static int myAtoi(String s) {
        if(s.isEmpty() || s.isBlank()){
            return 0;
        }

        int index = 0;
        int sign = 1;
        int referenceIndexOfWrongChar = 0;
        long result = 0;

        while (index<s.length() && Character.isWhitespace(s.charAt(index))) {
            index++;
        }

        while(index<s.length() && (s.charAt(index)=='-' || s.charAt(index)=='+')){
        
            if(s.charAt(index)=='-'){
                sign = -1;
                index++;
                referenceIndexOfWrongChar++;
            } else if (s.charAt(index)=='+'){
                index++;
                referenceIndexOfWrongChar++;
            }

            if(referenceIndexOfWrongChar>1){
                return 0;
            }
        }
        
        

        while(index<s.length() && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0';
            result = (result * 10) + digit;

            if((result*sign)<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
    
            if((result*sign)>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            index++;
        }

        return (int)result * sign;
    }

    public static void main(String[] args) {
        // System.out.println(myAtoi("-91283472332"));
        // System.out.println(myAtoi("-+12"));
        System.out.println(myAtoi("9223372036854775808"));
    }
}
