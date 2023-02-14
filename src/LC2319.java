

public class LC2319 {
    /*
    https://leetcode.cn/problems/check-if-matrix-is-x-matrix/
     */

    public static boolean checkXMatrix(int[]  [] grid) {
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||(i+j)==(n-1)){
                    if (grid[i][j]==0){return false;}
                }
                else{
                    if(grid[i][j]!=0)return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
    int [][] res = {{1,0,3},{0,2,0},{2,0,5}};

        System.out.println(checkXMatrix(res));


    }






}

