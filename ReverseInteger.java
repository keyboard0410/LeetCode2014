package leetcode;

public class ReverseInteger {

	public static int reverse(int x) {
		String str = String.valueOf(x);
		StringBuffer s = new StringBuffer();
		for(int k = str.length() - 1; k >= 0; k--) {
			if(str.charAt(k) != '0') {
				if(str.charAt(k) == '-') {
					s.insert(0, str.charAt(k));
				}
				else {
					s.append(str.charAt(k));
				}
			}
			else {
				if(s != null) {
					s.append(str.charAt(k));
				}
				else {
					continue;
				}
				
			}
			
		}
	
		try {
			Integer.parseInt(s.toString());
		}
		catch (Exception e) {
			System.out.println("reversed int out of range");
			return 0;
		}
		
		return Integer.parseInt(s.toString());
		
        
    }
	public static void main(String[] args) {
		System.out.println(reverse(1003));
		System.out.println(Integer.parseInt("0200"));

	}

}
