class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> required = new HashMap<>();

        for (char ch : t.toCharArray()) {
            required.put(ch, required.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();

        int left = 0;
        int formed = 0;

        int bestStart = 0;
        int bestLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (required.containsKey(ch)
                    && window.get(ch).equals(required.get(ch))) {
                formed++;
            }

            while (formed == required.size()) {

                // Current window is valid
                if (right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    bestStart = left;
                }

                char leftChar = s.charAt(left);

                if (required.containsKey(leftChar)) {

                    if (window.get(leftChar).equals(required.get(leftChar))) {
                        formed--;
                    }

                    window.put(leftChar, window.get(leftChar) - 1);
                }

                left++;
            }
        }

        if (bestLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(bestStart, bestStart + bestLen);
    }
}