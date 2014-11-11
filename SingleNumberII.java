package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
	
	public static int singleNumber(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < A.length; i++) {
			if(map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			}
			else {
				map.put(A[i],  1);
			}
		}
		int m = 0;
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			if(e.getValue() == 1) {
				m = e.getKey();
			}
		}
		return m;
		
    }
	public static void main(String[] args) {
		int[] A = {2,2,5};
		int mm = singleNumber(A);
		System.out.println(mm);

	}

}
