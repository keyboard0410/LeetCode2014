package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
	public static ArrayList<String> anagrams(String[] strs) {
		ArrayList<String> result = new ArrayList<String>();
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		if (strs == null || strs.length == 0) {
			return result;
		}
 
		for (String str : strs) {			
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String key = new String(charArray);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
 
			map.get(key).add(str);
		}
 
		for (ArrayList<String> temp : map.values()) {
			if (temp.size() > 1) {
				result.addAll(temp);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String[] strs = {"abc", "bca", "cab", "efg", "fge"};
		System.out.println(anagrams(strs));
	}
}