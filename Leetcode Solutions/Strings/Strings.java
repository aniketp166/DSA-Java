package Strings;

public class Strings {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}

class Main {
    public static void main(String[] args) {
        String[] nums = { "flower", "flow", "flight" };
        Strings arrObj = new Strings();
        System.out.println(arrObj.longestCommonPrefix(nums));

        String[] nums2 = { "dog", "racecar", "car" };
        System.out.println(arrObj.longestCommonPrefix(nums2));
    }
}
