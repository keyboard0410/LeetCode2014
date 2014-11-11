package leetcode;

import java.util.HashMap;

public class RomantoInteger {

	public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int value = 0;
        if(s.length() == 1) {
        	value += map.get(s.charAt(0));
        	return value;
        }
        for(int i = s.length() -1; i > 0; i--) {
        	if(map.get(s.charAt(i)) <= map.get(s.charAt(i-1))) {
        		value += map.get(s.charAt(i));
        		if(i==1) {
        			value += map.get(s.charAt(0));
        		}
        	}
        	else {
        		value = value + map.get(s.charAt(i)) - map.get(s.charAt(i-1));
        		i--;
        		if(i==1) {
        			value += map.get(s.charAt(0));
        		}
        	}
        }
        return value;
    }
	public static void main(String[] args) {
		String s = "MMXIV";
		System.out.println(romanToInt(s));

	}

}
