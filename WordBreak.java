 package leetcode;
 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	
	public static boolean isbreakable(String str, Set<String> dict) {
		boolean[] state = new boolean[(str.length() + 1)];
		//state[0] = true;
		ArrayList<String> list = new ArrayList<String>();
		int i = 0;
		while(i < str.length()) {
			//if(!state[i])
				//continue;
			for(String a : dict) {
				int len = a.length();
				if(len >= str.length())
					continue;
				int end = i + len;
				if(end > str.length())
					continue;
				//if(state[end])
					//continue;
				if(str.substring(i, end).equals(a)){
					state[end] = true;
					list.add(a);
					//System.out.println(list);
					i = end;
				}
			}
			i++;
		}
		if(state[str.length()])
			System.out.println(list);
		return state[str.length()];
	}

	public static void main(String[] args) {
		Set<String> dict = new HashSet<String>();
		dict.add("programcreek");
		dict.add("cat");
		dict.add("programcree");
		dict.add("program");
		dict.add("creek");
		//System.out.println(dict);
		System.out.println(isbreakable("programcreek", dict));

	}

}
    
