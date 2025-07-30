// Last updated: 7/31/2025, 12:52:29 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
             if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                // Reduce the prefix by one character
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }
        }
    
