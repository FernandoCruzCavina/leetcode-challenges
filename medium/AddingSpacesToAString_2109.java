package medium;

public class AddingSpacesToAString_2109 {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int size = s.length();
        int index = 0;
        int count = 0;

        while (index < size) {
            if(index == spaces[count]){
                result.append(' ');

                if(count < spaces.length - 1){
                    count++;
                }
            }

            result.append(s.charAt(index));
            index++;
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};
        System.out.println(addSpaces(s, spaces));
    }
}
