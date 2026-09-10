class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (char c : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        ans.reverse();

        int i = 0;
        while (i < ans.length() - 1 && ans.charAt(i) == '0') {
            i++;
        }

        return ans.substring(i).isEmpty() ? "0" : ans.substring(i);
    }
}