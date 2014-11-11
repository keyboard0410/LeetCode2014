package leetcode;

import java.util.Arrays;

public class Candy {

	public static int candy(int[] ratings) {
		
        int[] counter = new int[ratings.length];
        Arrays.fill(counter, 1);
        int count = 0;
       
        for(int i = 1; i < ratings.length; i++) {
        	if(ratings[i] > ratings[i-1]) {
        		counter[i] = counter[i-1] + 1;
        	}
        }
        
        for(int k = ratings.length - 2; k >= 0; k--) {
        	if(ratings[k] > ratings[k+1] && counter[k] <= counter[k+1]) {
        		counter[k] = counter[k+1] + 1;
        	}
        }
        for(int j = 0; j < counter.length; j++) {
        	count += counter[j];
        	System.out.print(counter[j] + "\t");
        	
        }
     System.out.println();
        return count;
    }

	public static void main(String[] args) {
		int[] ratings = {1,3,2,4,5,5,1,2};
		System.out.println(candy(ratings));
		

	}

}
