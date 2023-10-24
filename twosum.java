public class twosum {
  public int numRollsToTarget(int n, int k, int target){
    int[][] f = new int[n + 1][target + 1];
    f[0][0] = 1;
    for(int i = 1; i < n + 1; i++){
      for(int j = 0; j < target + 1; j++){
        for(int x = 1; x <= k; x++){
          if(j >= x){
            f[i][j] = (f[i][j] + f[i - 1][j - x]) % 1000000007;
          }
        }
      }
    }
    return f[n][target];
  }
}

