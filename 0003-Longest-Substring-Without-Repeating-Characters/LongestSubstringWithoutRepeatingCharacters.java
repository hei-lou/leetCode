import java.util.HashMap;
import java.util.Map;

/**
 * @author tan
 * @version 1.0
 * @description:
 * @date 2021/4/9 11:31
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepeatingCharacters("abcbadc"));
    }

    public static int longestSubstringWithoutRepeatingCharacters(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (; end < str.length(); end++) {
            char alpha = str.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha) + 1, start);
            }
            map.put(alpha, end);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }


}
