class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            if (s.isEmpty()) {
                s.push(asteroids[i]);
            }

            else if (s.peek() > 0 && asteroids[i] < 0) {

                while (!s.isEmpty()
                        && s.peek() > 0
                        && s.peek() < Math.abs(asteroids[i])) {

                    s.pop();
                }

                // Stack became empty
                if (s.isEmpty()) {
                    s.push(asteroids[i]);
                }

                // Same size -> both disappear
                else if (s.peek() == Math.abs(asteroids[i])) {
                    s.pop();
                }

                // Top is negative -> no collision, current survives
                else if (s.peek() < 0) {
                    s.push(asteroids[i]);
                }

                // Top is bigger positive -> current disappears
            }

            // No collision
            else {
                s.push(asteroids[i]);
            }
        }

        int[] ans = new int[s.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }

        return ans;
    }
}