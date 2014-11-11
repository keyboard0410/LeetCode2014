package leetcode;

public class UniquePathsII {
	
   	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
   		if(obstacleGrid == null || obstacleGrid.length < 1){
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        boolean top = false;
        boolean left = false;
         
        int[][] res = new int[m][n];
         
         for(int i = 0; i < m; i++){
             if(obstacleGrid[i][0] == 1){
                 res[i][0] = 0;
                 top = true;
             }else{
                 if(top == false){
                     res[i][0] = 1;
                 }else{
                     res[i][0] = 0;
                 }
                  
             }
        }
         
         for(int i = 0; i < n; i++){
             if(obstacleGrid[0][i] == 1){
                 res[0][i] = 0;
                 left = true;
             }else{
                 if(left == false){
                     res[0][i] = 1;
                 }else{
                     res[0][i] = 0;
                 }
             }
        }
         
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    res[i][j] = 0;
                }else{
                    res[i][j] = res[i-1][j] + res[i][j-1];
                }
            }
        }
         
        return res[m-1][n-1];
   	}
 
        
	public static void main(String[] args) {
		int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));

	}

}
