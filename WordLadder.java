package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class WordLadder {
	
	public static int ladderLength(String start, String end, HashSet<String> dict) {
        String st = start.toLowerCase();
        String en = end.toLowerCase();
        if (st.equals(en) || !dict.contains(en))
           return 0;
         
        Map<String, Integer> seen = new HashMap<String, Integer>();         
        Queue<String> myQ=new LinkedList<String>();
        myQ.offer(st);
        seen.put(st, 1);

        while(!myQ.isEmpty()) {
            String s = myQ.remove();                                                
            for (int i = 0; i < s.length(); ++i) {
                for (int j = 0; j < 26; ++j) {
                   StringBuilder sb = new StringBuilder(s);
                   sb.setCharAt(i, (char)('a' + j));
                   String cur = sb.toString();
                   if (cur.equals(en))
                       return seen.get(s) + 1;
                   if (!seen.keySet().contains(cur) && dict.contains(cur)) {
                       myQ.offer(cur);                   
                       seen.put(cur, seen.get(s) + 1);
                   }
                    
                }
            }
           
        }
        return 0;
   }
	public static void main(String[] args) {
		HashSet<String> dict = new HashSet<String>();
		dict.add("hit");
		dict.add("cog");
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		System.out.println(ladderLength("hit", "cog", dict));
		

	}

}
