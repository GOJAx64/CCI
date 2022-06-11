package array_and_strings;

public class PalindromePermutation {
    public static boolean solution(String s) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        boolean isOdd = false;

        int val;
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        for(char c: s.toCharArray()) {
            val = Character.getNumericValue(c);
            if(a <= val && val <= z) {
                table[Character.getNumericValue(c) - Character.getNumericValue('a')]++;
            }
        }

        for(int i = 0; i < table.length; i++) {
            if(table[i] % 2 == 1) {
                if(isOdd) {
                    return false;
                }
                isOdd = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(PalindromePermutation.solution("hello world"));
        System.out.println(PalindromePermutation.solution("mr john smith"));
        System.out.println(PalindromePermutation.solution("tact coa"));
    }
}
