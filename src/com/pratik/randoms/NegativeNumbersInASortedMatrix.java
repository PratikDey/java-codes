package com.pratik.randoms;

public class NegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans = countNegatives(arr);
        System.out.println(ans);
    }
    public static int countNegatives(int[][] grid) {
        int count = 0;

        for(int i = 0; i < grid.length; i++) {
            int start = 0;
            int end = grid[i].length - 1;
            if(grid[i][start] < 0) {
                count = count + grid[0].length;
                continue;
            }
            if(grid[i][end] > 0) {
                continue;
            }

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (grid[i][mid] < 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            count = count + (grid[0].length - start);
        }
        return count;
    }
}
