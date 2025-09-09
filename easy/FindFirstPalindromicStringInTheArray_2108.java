package easy;

public class FindFirstPalindromicStringInTheArray_2108 {
    public static String firstPalindrome(String[] words) {
      int size = words.length;
      String result = "";

      for (int i = 0; i < size; i++) {
          String word = words[i];
          int wordLenght =  word.length();
          int j = 0;
          int k = wordLenght - 1;
          boolean isPalindromic = true;
          while (j < k) {
            if(word.charAt(j) != word.charAt(k)){
              isPalindromic = false;
              break;
            }
            j++;
            k--;
          }
          if(isPalindromic == true){
            return words[i];
          }
      }
      
      return result;
    }

    public static void main(String[] args) {
      String[] words = {"abc","car","ada","racecar","cool"};
      System.out.println(firstPalindrome(words));
    }
}
