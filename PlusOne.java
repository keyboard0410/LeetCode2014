package leetcode;

public class PlusOne {
	
	public static int[] plusOne(int[] digits) {
        int carrier = 0;
        for(int i = digits.length - 1; i >= 0; i--) {
        	
        	if(i == digits.length - 1) {
        		int t = digits[i];
        		digits[i] = (1 + t) % 10;
        		carrier = (1 + t) / 10;
        	}
        	else {
        		int temp = digits[i]; 
        		digits[i] = (carrier+temp) % 10;
        		carrier = (carrier+temp) / 10;
        	}
        	if(carrier == 1 && i==0) {
        		int[] newdigits = new int[digits.length+1];
        		newdigits[0] = 1;
        		for(int j = 1; j < newdigits.length; j++) {
        			newdigits[j] = digits[j-1];
        		}
        		return newdigits;
        	}
        }
       
        return digits;
    }

	public static void main(String[] args) {
		int[] digits = {9,9,9};
		for(int e: plusOne(digits)) {
			System.out.println(e);
		}
		

	}

}
