package hard;

import java.util.regex.Pattern;

public class RegularExpressionMatching_10 {
    public boolean isMatch(String s, String p) {
        return Pattern.matches(p, s);
    }
}
