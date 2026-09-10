class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("+") ||
                tokens[i].equals("-") ||
                tokens[i].equals("*") ||
                tokens[i].equals("/")) {

                int first = stack.pop();
                int second = stack.pop();

                if (tokens[i].equals("+")) {
                    stack.push(second + first);
                }
                else if (tokens[i].equals("-")) {
                    stack.push(second - first);
                }
                else if (tokens[i].equals("*")) {
                    stack.push(second * first);
                }
                else if (tokens[i].equals("/")) {
                    stack.push(second / first);
                }

            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.peek();
    }
}