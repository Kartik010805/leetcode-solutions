class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String c : strs) {

            int[] count = new int[26];

            for (char ch : c.toCharArray()) {
                count[ch - 'a']++;
            }

            String key = Arrays.toString(count);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(c);
        }

        return new ArrayList<>(map.values());
    }
}