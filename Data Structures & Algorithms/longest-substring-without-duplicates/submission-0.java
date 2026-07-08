class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Stores the characters currently inside our window.
        // The window must always contain UNIQUE characters.
        HashSet<Character> set = new HashSet<>();

        // Left pointer (start of the window)
        int left = 0;

        // Stores the length of the longest valid window found so far.
        int maxLen = 0;

        // Right pointer expands the window one character at a time.
        for (int right = 0; right < s.length(); right++) {

            // If the current character already exists in the window,
            // the window is invalid because it contains duplicates.
            //
            // Keep shrinking the window from the left until
            // the duplicate is removed.
            while (set.contains(s.charAt(right))) {

                // Remove the leftmost character from the window.
                set.remove(s.charAt(left));

                // Move the left boundary inward.
                left++;
            }

            // The window is valid again.
            // Add the new character.
            set.add(s.charAt(right));

            // Current window length:
            // right - left + 1
            //
            // Compare it with the best answer so far.
            maxLen = Math.max(maxLen, right - left + 1);
        }

        // Return the largest valid window found.
        return maxLen;
    }
}