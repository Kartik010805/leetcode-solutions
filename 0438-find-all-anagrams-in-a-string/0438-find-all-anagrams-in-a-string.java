class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        HashMap<Character, Integer> pMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> windowMap = new HashMap<>();
        int left = 0, right = 0;
        int matched = 0;
        int required = pMap.size();

        while (right < s.length()) {
            char r = s.charAt(right);
            windowMap.put(r, windowMap.getOrDefault(r, 0) + 1);

            if (pMap.containsKey(r) &&
                windowMap.get(r).equals(pMap.get(r))) {
                matched++;
            }

            if (right - left + 1 > p.length()) {
                char l = s.charAt(left);

                if (pMap.containsKey(l) &&
                    windowMap.get(l).equals(pMap.get(l))) {
                    matched--;
                }

                windowMap.put(l, windowMap.get(l) - 1);
                if (windowMap.get(l) == 0) windowMap.remove(l);
                left++;
            }

            if (matched == required) {
                ans.add(left);
            }

            right++;
        }

        return ans;
    }
}
