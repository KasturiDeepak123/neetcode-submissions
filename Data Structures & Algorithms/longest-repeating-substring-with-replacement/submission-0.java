class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Update highest frequency
            maxFreq = Math.max(maxFreq, map.get(ch));

            // Shrink window if replacements needed > k
            while ((right - left + 1) - maxFreq > k) {

                char leftChar = s.charAt(left);

                // Remove left character
                map.put(leftChar, map.get(leftChar) - 1);

                // Move left pointer
                left++;
            }

            // Update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}