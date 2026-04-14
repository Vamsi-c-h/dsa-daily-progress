/*
Problem: Equal Row and Column Pairs
Link: https://leetcode.com/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75
*/

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int row[] = new int[n];
        int col[] = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                row[j] = grid[i][j];
            }
            for(int a=0; a<n; a++){
                for(int b=0; b<n; b++){
                    col[b] = grid[b][a];
                }
                if(Arrays.equals(row, col)){
                    count++;
                }
            }            
        }
        return count;
    }
}