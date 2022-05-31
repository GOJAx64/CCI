package array_and_strings;

public class IsUnique {
    public boolean isUnique(String s) {
        if(s.length() > 128) return false;

        boolean[] characters = new boolean[128];
        int index;

        for(int i = 0; i < s.length(); i++) {
            index = s.charAt(i);
            if(characters[index]){
                return false;
            }
            else characters[index] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        IsUnique s = new IsUnique();
        System.out.println(s.isUnique("helo avc?"));
    }
}
