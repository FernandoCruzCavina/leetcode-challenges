package easy;

public class MaximumNumberOfWordsYouCanType_1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s = text.split(" ");
        char[] c = brokenLetters.toCharArray();
        int count = 0;

        for (String v : s) {
            boolean canType = true;  

            for (char broken : c) {
                if (v.indexOf(broken) != -1) {  
                    canType = false;
                    break;
                }
            }

            if (canType) {
                count++;
            }
        }
        
        return count;
    }    
}
