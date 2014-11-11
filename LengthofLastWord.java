package leetcode;

public class LengthofLastWord {

	public static int lengthOfLastWord(String s) {
		if(s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        String[] str = s.split("\\s+");
        if(str.length == 0) {
            return 0;
        }
        return str[str.length-1].length();
    }
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("a "));

	}

}
