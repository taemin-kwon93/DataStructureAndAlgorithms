package study.algorithm;

public class StringContainsChecker {
    public static void main(String[] args) {
        StringContainsChecker checker = new StringContainsChecker();

        int resultUsingBytes = checker.checkUsingBytes("abcde", "bc");
        System.out.println("Result using byte comparison: " + resultUsingBytes);

        int resultUsingStringMethod = checker.checkUsingStringMethod("abcde", "bc");
        System.out.println("Result using string method: " + resultUsingStringMethod);
    }

    /**
     * Check if mainString contains subString using byte comparison.
     *
     * @param mainString the string where subString may be found.
     * @param subString the string to find in mainString.
     * @return 1 if mainString contains subString, otherwise 2.
     */
    public int checkUsingBytes(String mainString, String subString) {
        byte[] mainBytes = mainString.getBytes();
        byte[] subBytes = subString.getBytes();

        for (int i = 0; i <= mainString.length() - subString.length(); i++) {
            boolean isMatch = true;
            for (int j = 0; j < subString.length(); j++) {
                if (mainBytes[i + j] != subBytes[j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                return 1;
            }
        }
        return 2;
    }

    /**
     * Check if mainString contains subString using String's contains method.
     *
     * @param mainString the string where subString may be found.
     * @param subString the string to find in mainString.
     * @return 1 if mainString contains subString, otherwise 2.
     */
    public int checkUsingStringMethod(String mainString, String subString) {
        return mainString.contains(subString)? 1 : 2;
    }
}
