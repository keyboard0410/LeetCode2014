package leetcode;

public class DivideTwoIntegers2 {
	
	public static int divide(int dividend, int divisor) {
		if(dividend == 0) {
    	    return 0;
    	}
		if(divisor == 1) {
			return dividend;
		}
        int res = 0;
        int flag = 1;
        if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
        	flag = -1;
        }

        int t = Math.abs(dividend);
    	int m = Math.abs(divisor);
    	
        if(t >= m) {
        	
        	while(t - m >= 0) {
        		res++;
        		t = t - m;
        	}
        }
        else {
        	return 0;
        }
        return flag * res;
        
    }
	
    public int divideBitManipulation(int dividend, int divisor) {
        long a = Math.abs((long) dividend);
         long b = Math.abs((long) divisor);
         long flaga = dividend > 0 ? 1 : -1;
         long flagb = divisor > 0 ? 1 : -1;
         while ((b << 1) <= a) 
             b <<= 1;
         long c = 0;
         long absDivisor = Math.abs((long) divisor);

         while (b >= absDivisor) {
             c <<= 1;
             while (a >= b) {
                 a -= b;
                 c += 1;
             }
             b >>= 1;
         }
         return (int) (c * flaga * flagb);
     }

	public static void main(String[] args) {
		System.out.println(divide(15, 2));
	}

}
