package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class WordLadderII {

	public ArrayList<ArrayList<String>> findLadders(String start, String end, HashSet<String> dict) {
		 HashSet<String> dedupSet = new HashSet<String>();  
	        LinkedList<ArrayList<String>> resultList = new LinkedList<ArrayList<String>>();
	        ArrayList<String> temp = new ArrayList<String>();
	        temp.add(start);
	        resultList.add(temp);
	        
	        while(!resultList.isEmpty()){
	            boolean foundEnd = false;
	            int len = resultList.size();
	            for(int i = 0; i < len; i++){
	                ArrayList<String> list = resultList.pollFirst();// pop first list
	                String from = list.get(list.size()-1);//get frontier string
	                dedupSet.add(from);
	                char[] arr = from.toCharArray();
	                for(int j = 0; j < arr.length; j++){
	                    char base = arr[j];
	                    for(char c = 'a'; c < 'z'; c++){
	                        if(c == base) continue;
	                        arr[j] = c;
	                        String s = new String(arr);
	                        if(dict.contains(s) && !dedupSet.contains(s)){
	                            if(s.equals(end)) foundEnd = true;
	                            ArrayList<String> newList = new ArrayList<String>(list);
	                            newList.add(s);
	                            resultList.add(newList);
	                        }
	                    }
	                    arr[j] = base;
	                }
	            }  
	            if(foundEnd){
	                ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
	                for(ArrayList<String> list : resultList){
	                    if(list.get(list.size()-1).equals(end)) res.add(list);
	                }
	                return res;
	            }
	        }
	        return new ArrayList<ArrayList<String>>();
    }
	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		HashSet<String> dict = new HashSet<String>();
		dict.add("hit");
		dict.add("cog");
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		System.out.println(new WordLadderII().findLadders(start, end, dict));
		
	}

}
