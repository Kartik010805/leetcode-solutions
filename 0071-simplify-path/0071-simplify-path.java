class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] arr = path.split("/");

        for (String s : arr) {

            if (s.equals("") || s.equals(".")) {
                continue;
            }

            if (s.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(s);
            }
        }

        if (stack.isEmpty())
            return "/";

        StringBuilder ans = new StringBuilder();

        for (String dir : stack) {
            ans.append("/");
            ans.append(dir);
        }

        return ans.toString();
    }
}