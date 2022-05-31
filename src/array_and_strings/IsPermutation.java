package array_and_strings;

public class IsPermutation {
    public static boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) return false;

        int[] count = new int[128];
        char[] content = a.toCharArray();

        for(char c : content) {
            count[c]++;
        }

        int c;
        for(int i = 0; i < b.length(); i++) {
            c = b.charAt(i);
            count[c]--;
            if(count[c] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsPermutation.isPermutation("abcc","abcc"));
    }
}
