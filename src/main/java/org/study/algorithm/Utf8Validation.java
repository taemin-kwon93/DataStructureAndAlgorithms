package org.study.algorithm;

public class Utf8Validation {
    /**
     * 24.11.07 첫번째 풀이, 성능향상을 위한 리팩토링 필요
     */
    public boolean validUtf8(int[] data) {
        int flag = 0;
        for (int i = 0; i < data.length; i = flag) {
            // Get the binary representation of the current byte
            String binary = String.format("%8s", Integer.toBinaryString(data[i])).replace(' ', '0');

            // If a byte starts with "10" but is not part of any sequence, it's invalid
            if (binary.startsWith("10")) return false;

            // Calculate bitCount to determine how many continuation bytes are needed
            int bitCount = bitCounter(binary);

            // Check if bitCount is valid (non-zero and within UTF-8 limits) and there are enough bytes left
            if (bitCount == 0 || i + bitCount > data.length) return false;

            // Validate the continuation bytes
            for (int j = i + 1; j < i + bitCount; j++) {
                String tmp = String.format("%8s", Integer.toBinaryString(data[j])).replace(' ', '0');
                if (!tmp.startsWith("10")) return false;
            }
            flag += bitCount;
        }
        return true;
    }

    public int bitCounter(String binary) {
        int count = 0;

        // Single-byte character (if starting with '0')
        if (binary.charAt(0) == '0') return 1;

        // Count leading '1's for multibyte character
        for (char c : binary.toCharArray()) {
            if (c == '0') break;
            count++;
        }

        // UTF-8 allows only up to 4 leading '1's for multibyte characters
        if (count > 4) return 0; // Return 0 for invalid leading byte
        return count;
    }
}