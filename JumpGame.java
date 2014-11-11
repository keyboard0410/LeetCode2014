package leetcode;

public class JumpGame {
 	public static boolean canJump(int[] A) {
 	    if(A.length == 1) {
 	        return true;
 	    }
 	    int i = 0;
        for(i = 0; i < A.length -1; i++) {
            if(A[i] == 0) {
                if(i==0) {
                	return false;
                }
                int j = i;
                int count = 0;
                while(j >= 0) {
                	if(j==0 && A[j] > i) {
                		break;
                	}
                	else if(j >=1 && A[j-1] > 1+count){
                    	break;
                    }
                	else if(j >=1 &&  A[j-1] <= 1+count){
                		j--;
                		count++;
                	}
                	else {
                		return false;
                	}
                }
            }
            else {
            	continue;
            }
        }
        if(i == A.length -1) {
        	return true;
        }
        return false;
    }

	public static void main(String[] args) {
		int[] A = {0};
		System.out.println(canJump(A));

	}

}
