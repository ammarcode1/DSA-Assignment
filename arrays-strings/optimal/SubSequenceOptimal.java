public class SubSequenceOptimal {
        public static boolean isSubsequence(String s, String t) {
            // optimal solution using two pointer approach
            int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

    static void main() {
        String s = "abc";
        String t = "ABDEF";
        t = t.toLowerCase();
        boolean c = isSubsequence(s,t);
        System.out.println(c);
    }
}