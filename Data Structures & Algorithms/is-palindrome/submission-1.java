class Solution {
    public boolean isPalindrome(String s) {

        // Two pointers:
        // left starts at the beginning
        // right starts at the end
        int l = 0;
        int r = s.length() - 1;

        // Keep comparing until the pointers meet
        while (l < r) {

            // If the left character isn't a letter or digit,
            // ignore it and move the left pointer.
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;

            // Otherwise, if the right character isn't valid,
            // ignore it and move the right pointer.
            } else if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;

            // Both characters are valid.
            // Compare them ignoring uppercase/lowercase.
            } else if (Character.toLowerCase(s.charAt(l))
                    != Character.toLowerCase(s.charAt(r))) {

                // Characters don't match -> not a palindrome.
                return false;

            } else {

                // Characters match.
                // Move both pointers inward and continue checking.
                l++;
                r--;
            }
        }

        // We compared every valid character without finding
        // a mismatch, so the string is a palindrome.
        return true;
    }
}