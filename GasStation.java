package leetcode;

public class GasStation {

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int i = 0;
        int newStartPoint = 0;
        int sumGas = 0;
        int sumCost = 0;
        int temp = 0;
        while(newStartPoint < gas.length) {
        	sumGas +=gas[i];
        	sumCost += cost[i];
        	if(sumGas >= sumCost) {
        		i++;
        		temp++;
        		i = i % gas.length;
        
        		if(i == newStartPoint) {
            		return newStartPoint;
            	}
        	}
        	else {
        		newStartPoint = (temp +1);
        		i = newStartPoint;
        		temp = newStartPoint;
        		sumGas = 0;
        		sumCost = 0;
        	}
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] gas = {2,4,7};
		int[] cost = {3,4,3};
		System.out.println(canCompleteCircuit(gas, cost));

	}

}
