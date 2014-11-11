package leetcode;

import java.util.ArrayList;

public class PascalsTriangle {

	 public static ArrayList<ArrayList<Integer>> generate(int numRows) {
		 ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>(numRows); 
		 if(numRows == 0) {
			 return lists;
		 }
		 ArrayList<Integer> list0 = new ArrayList<Integer>();
		 list0.add(1);
		 lists.add(list0);
		 if(numRows == 1) {
			 return lists;
		 }
		 ArrayList<Integer> list1 = new ArrayList<Integer>();
		 list1.add(1);
		 list1.add(1);
		 lists.add(list1);
		 if(numRows == 2) {
			 return lists;
		 }
		 for(int i = 2; i < numRows; i++) {
			 ArrayList<Integer> list = new ArrayList<Integer>();
			
			 list.add(1);

			 for(int j = 0; j < lists.get(i-1).size() -1; j++) {
				list.add(lists.get(i-1).get(j) + lists.get(i-1).get(j+1));
					 
			 }
			 list.add(1);
			 lists.add(list);
		 }
		 System.out.println(lists);
		 return lists;
	 }
	public static void main(String[] args) {
		generate(4);

	}

}
