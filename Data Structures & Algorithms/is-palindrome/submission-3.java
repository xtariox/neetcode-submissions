class Solution {
    public boolean isPalindrome(String s) {

        // Two pointers:
        // l starts at the beginning of the string.
        // r starts at the end of the string.
        int l = 0;
        int r = s.length() - 1;

        // Continue checking until the pointers meet or cross.
        while (l < r) {

            // Skip every non-alphanumeric character on the left.
            // Keep moving until we find a valid letter or digit.
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            // Skip every non-alphanumeric character on the right.
            // Keep moving until we find a valid letter or digit.
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            // Both pointers are now on valid characters.
            // Compare them while ignoring uppercase/lowercase.
            // If they don't match, the string cannot be a palindrome.
            if (Character.toLowerCase(s.charAt(l))
                    != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            // The current pair matches.
            // Move inward and compare the next pair.
            l++;
            r--;
        }

        // Every valid pair matched,
        // so the string is a palindrome.
        return true;
    }
}