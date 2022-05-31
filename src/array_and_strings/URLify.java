package array_and_strings;

public class URLify {
    public static String solution(String s, int length) {
        char[] content = s.toCharArray();
        int countSpaces = 0, index = 0;

        for(int i = 0; i < length; i++) {
            if(content[i] == ' ') countSpaces++;
        }

        index = length + countSpaces*2;

        for(int i = length-1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                content[index-1] = '0';
                content[index-2] = '2';
                content[index-3] = '%';
                index -= 3;
            }
            else {
                content[--index] = s.charAt(i);
            }
        }
        return new String(content);
    }

    public static void main(String[] args) {
        System.out.println(URLify.solution("Hello world  ",11));
        System.out.println(URLify.solution("Mr John Smith    ",13));
    }
}
