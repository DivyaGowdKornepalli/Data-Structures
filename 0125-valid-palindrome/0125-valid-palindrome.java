class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
            if (!Character.isLetterOrDigit(a[i])) {
                i++;
            }
            else if (!Character.isLetterOrDigit(a[j])) {
                j--;
            }
            else if (a[i] != a[j]) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna