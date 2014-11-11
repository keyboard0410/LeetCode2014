package leetcode;

import java.util.ArrayList;

public class ReverseWordsinaString {
	public static String solution(String s) {
		if(s == null) {
			return s;
		}
		s = s.trim();
		String[] str = s.split("\\s+");
		StringBuffer sb = new StringBuffer();
		
		for(int j = str.length -1; j >= 0; j--) {
			sb.append(str[j]);
			if(j != 0) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = " 1";
		
		System.out.print(solution(s));
		System.out.print(solution(s));

	}

}
