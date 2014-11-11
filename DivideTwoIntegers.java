package leetcode;

public class DivideTwoIntegers {
	public static int makeNegativeNum(int divisor) {
		
		int neg = 0;
		if(divisor > 0) {
			while(divisor > 0) {
				divisor--;
				neg -= 1;
			}
		}
		else {
			while(divisor < 0) {
				divisor++;
				neg += 1;
			}
		}
		return neg;
	}
	
	public static int divide(int dividend, int divisor) {
        int carry = 0;
        int t = Math.abs(dividend);
        int m = Math.abs(divisor);
        m = makeNegativeNum(m);
        while((t+m) >=0) {
        		carry++;
        		t = t+m;
        }
        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
        	return carry;
        }
        else {
        	return makeNegativeNum(carry);
        }
        
    }

	public static void main(String[] args) {
		System.out.println(divide(-2147483647, 2));
	}

}
