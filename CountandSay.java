package leetcode;

public class CountandSay {

	public static String countAndSay(int n) {
        if(n == 1) {
        	return "1";
        }
        String s = "1";
        int count = 1;
        int i = 0;
        while(count < n) {
        	int[] num = new int[s.length()];
        	for(int j = 0; j < s.length(); j++) {
        		num[j] = s.charAt(j) - '0';
        	}
        	int cal = 0;
        	StringBuffer sb = new StringBuffer();
        	
        	for(i = 0; i < num.length; i++) {
        		int temp = num[i];
        		cal++;
        		while(i + cal < num.length) {
        			if(num[i+cal] == temp) {
        				cal++;
        			}
        			else {
        				break;
        			}
        		}
        		i = i + cal;
        		sb.append(cal);
				sb.append(temp);
				cal = 0;
				i--;
        	}
        	s = sb.toString();
        	count++;
        }
        return s;
    }
	public static void main(String[] args) {
		System.out.println(countAndSay(4));

	}

}
