public class SubSequenceBrute {
    public static boolean isSubsequence(String s, String t) {
        int i = 0;

        for (int j = 0; j < t.length(); j++) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        return i == s.length();
    }

    static void main() {
        String s = "abc";
        String t = "ABCDE";
        t = t.toLowerCase();
        boolean c = isSubsequence(s,t);
        System.out.println(c);
    }
}