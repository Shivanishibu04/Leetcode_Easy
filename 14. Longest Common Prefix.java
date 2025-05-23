class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder prefix = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix.toString())) {
                prefix.deleteCharAt(prefix.length() - 1);
                if (prefix.length() == 0) {
                    return "";
                }
            }
        }

        return prefix.toString();

    }
}
