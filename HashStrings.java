package leetcode;

import java.util.Hashtable;


public class HashStrings {
	
	
	
	
	
	
	
	String s;
	// this is the test of SVN
	public HashStrings(String s) {
		
		this.s = s;
	}
	
	@Override
	public int hashCode() {
		int k=0;
		for(int i = 0; i < s.length(); i++) {
			
			k += s.charAt(i);
		}
		return k;
	}

	public static void main(String[] args) {
		HashStrings st1 = new HashStrings("abc");
		HashStrings st2 = new HashStrings("cba");
		Hashtable<String, String> table = new Hashtable<String, String>();
		
	
		table.put("abc", "abc");
		table.put("cba", "cba");
		table.put("ddd", "ddd");
		System.out.println(table);
		
		int a = st1.hashCode();
		int b = st2.hashCode();
		System.out.println("a = "+a+" ; "+"b = "+ b);
			

	}

}
