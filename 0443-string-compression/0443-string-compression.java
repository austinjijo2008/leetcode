class Solution {
    public int compress(char[] chars) {
        int write = 0; // Pointer to write the compressed characters
        int read = 0;  // Pointer to read through the array

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count the number of consecutive repeating characters
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the frequency digits if count > 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write; // Returns the new length of the array
    }
}