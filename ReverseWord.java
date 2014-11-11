package leetcode;


import java.util.LinkedList;


public class ReverseWord {
	
public static String reverseWords(String s) {
	
	if(s == null )
		return s;
        
        LinkedList<String> list = new LinkedList<String>();
        String sub = "";
        for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == ' ') {
                
                if(sub != "") {
                    
                    list.add(sub);
                    sub = "";
                }
                
            }
            
            else {
                
                sub +=  s.charAt(i);
            }
            
            if(i == s.length() -1 && sub != "") {
            	
            	list.add(sub);
            }
        }
        
    
        StringBuilder str = new StringBuilder();
        for(int j = list.size() -1; j>=0; j--) {
            
            str.append(list.pollLast());
            
            
            if(j > 0) {
                str.append(" ");
            }
            
        }
        return str.toString();
    }
	public static void main(String[] args) {
				
		System.out.print(reverseWords("  the sky  is  blue  "));

	}

}
