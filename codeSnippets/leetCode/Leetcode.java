import java.util.Arrays;

class Leetcode {

    public int countVowelStrings(int n) {

        if (n == 1)
            return 5;

        int[][] dp = new int[n][5];

        Arrays.fill(dp[0], 1);

        for (int j = 1; j < n; j++) {
            for (int i = 1; i < 5; i++) {
                // int[] nextRow = new int[5];
                dp[j][0] = 1;
                dp[j][i] = dp[j][i - 1] + dp[j - 1][i];
            }
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + dp[n - 1][i];
        }
        return sum;
    }

    public int countSquares(int[][] matrix) {

        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0)
                    dp[i][j] = 0;
                else if (i == 0 || j == 0)
                    dp[i][j] = matrix[i][j];
                else
                    dp[i][j] = matrix[i][j] + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
            }
        }
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum = sum + dp[i][j];
            }
        }

        return sum;
    }

    public int numTeams(int[] rating) {

        int[] incArray = new int[rating.length];
        int[] decArray = new int[rating.length];

        for (int i = 0; i < rating.length; i++) {
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i])
                    incArray[i]++;
            }
        }

        for (int i = rating.length; i >= 0; i--) {
            for (int j = i; j < rating.length; j++) {
                if (rating[j] < rating[i])
                    decArray[i]++;
            }
        }

        int teamCount = 0;

        for (int i = 1; i < rating.length; i++) {
            for (int j = 0; j < i; j++) {
                if (rating[i] >= rating[j] && incArray[j] > 0) {
                    teamCount = teamCount + incArray[j];
                }
            }
        }

        for (int i = rating.length - 2; i > 0; i--) {
            for (int j = rating.length - 1; j > i; j--) {
                if (rating[i] >= rating[j] && decArray[j] > 0) {
                    teamCount = teamCount + decArray[j];
                }
            }
        }

        return teamCount;
    }

    public int[] findBall_top_column(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        if (n == 1)
            return new int[] { -1 };

        int[][] dp = new int[m][n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    if (grid[i][j] == -1 && grid[i][j - 1] == 1)
                        dp[i][j] = -1;
                    else
                        dp[i][j] = 1;
                } else if (i == m - 1 && j == 0) {
                    if (grid[i][j] == 1 && grid[i][j + 1] == -1)
                        dp[i][j] = -1;
                    else
                        dp[i][j] = 1;
                } else if (i == m - 1) {
                    if ((grid[i][j] == -1 && grid[i][j - 1] == 1) || (grid[i][j] == 1 && grid[i][j + 1] == -1))
                        dp[i][j] = -1;
                    else
                        dp[i][j] = 1;
                } else if (j == n - 1) {
                    if (grid[i][j] == -1 && grid[i][j - 1] == 1)
                        dp[i][j] = -1;
                    else if (grid[i][j] == 1)
                        dp[i][j] = dp[i + 1][j];
                    else
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j - 1]);
                } else if (j == 0) {
                    if (grid[i][j] == 1 && grid[i][j + 1] == -1)
                        dp[i][j] = dp[i][j + 1];
                    else if (grid[i][j] == -1)
                        dp[i][j] = dp[i + 1][j];
                    else
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
                } else {
                    if ((grid[i][j] == -1 && grid[i][j - 1] == 1) || (grid[i][j] == 1 && grid[i][j + 1] == -1))
                        dp[i][j] = -1;
                    else if (grid[i][j] == -1 && grid[i + 1][j] == 1)
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j - 1]);
                    else if (grid[i][j] == 1 && grid[i + 1][j] == -1)
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
                    else if (grid[i][j] == -1)
                        dp[i][j] = dp[i + 1][j - 1];
                    else
                        dp[i][j] = dp[i + 1][j + 1];

                }
            }

        }
        return dp[0];
    }

    public int[] findBall_bottom_column(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        if (n == 1)
            return new int[] { -1 };

        int[][] dp = new int[m][n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    if (grid[i][j] == -1 && grid[i][j - 1] == 1)
                        dp[i][j] = -1;
                    else
                        dp[i][j] = j;
                } else if (i == m - 1 && j == 0) {
                    if (grid[i][j] == 1 && grid[i][j + 1] == -1)
                        dp[i][j] = -1;
                    else
                        dp[i][j] = j;
                } else if (i == m - 1) {
                    if ((grid[i][j] == -1 && grid[i][j - 1] == 1) || (grid[i][j] == 1 && grid[i][j + 1] == -1))
                        dp[i][j] = -1;
                    else
                        dp[i][j] = j;
                } else if (j == n - 1) {
                    if (grid[i][j] == 1) {
                        if (grid[i + 1][j] == -1)
                            dp[i][j] = dp[i + 1][j];
                        else
                            dp[i][j] = -1;
                    } else {
                        if (grid[i][j - 1] == 1)
                            dp[i][j] = -1;
                        else if (grid[i + 1][j - 1] == -1)
                            dp[i][j] = dp[i + 1][j - 1];
                        else if (grid[i + 1][j] == 1)
                            dp[i][j] = dp[i + 1][j];
                        else
                            dp[i][j] = -1;
                    }
                } else if (j == 0) {
                    if (grid[i][j] == -1) {
                        if (grid[i + 1][j] == 1)
                            dp[i][j] = dp[i + 1][j];
                        else
                            dp[i][j] = -1;
                    } else {
                        if (grid[i][j + 1] == -1)
                            dp[i][j] = -1;
                        else if (grid[i + 1][j + 1] == 1)
                            dp[i][j] = dp[i + 1][j + 1];
                        else if (grid[i + 1][j] == -1)
                            dp[i][j] = dp[i + 1][j];
                        else
                            dp[i][j] = -1;
                    }
                } else {
                    if (grid[i][j] == -1) {
                        if (grid[i][j - 1] == 1)
                            dp[i][j] = -1;
                        else if (grid[i + 1][j] == 1)
                            dp[i][j] = dp[i + 1][j];
                        else
                            dp[i][j] = dp[i + 1][j - 1];
                    } else {
                        if (grid[i][j + 1] == -1)
                            dp[i][j] = -1;
                        else if (grid[i + 1][j] == -1)
                            dp[i][j] = dp[i + 1][j];
                        else
                            dp[i][j] = dp[i + 1][j + 1];
                    }
                }
            }

        }
        return dp[0];
    }

    public int[] findBall(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        if (n == 1)
            return new int[] { -1 };

        int[][] dp = new int[m][n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    if ((grid[i][j] == 1) || (grid[i][j - 1] == 1 && grid[i][j] == -1))
                        dp[i][j] = -1;
                    else
                        dp[i][j] = j - 1;
                } else if (i == m - 1 && j == 0) {
                    if ((grid[i][j] == 1 && grid[i][j + 1] == -1) || grid[i][j] == -1)
                        dp[i][j] = -1;
                    else
                        dp[i][j] = j + 1;
                } else if (i == m - 1) {
                    if ((grid[i][j] == -1 && grid[i][j - 1] == 1) || (grid[i][j] == 1 && grid[i][j + 1] == -1))
                        dp[i][j] = -1;
                    else if (grid[i][j] == 1)
                        dp[i][j] = j + 1;
                    else
                        dp[i][j] = j - 1;
                }

                else if (j == n - 1) {
                    if ((grid[i][j] == 1) || (grid[i][j] == -1 && grid[i][j - 1] == 1))
                        dp[i][j] = -1;
                    else
                        dp[i][j] = dp[i + 1][j - 1];
                } else if (j == 0) {
                    if ((grid[i][j] == 1 && grid[i][j + 1] == -1) || grid[i][j] == -1)
                        dp[i][j] = -1;
                    else
                        dp[i][j] = dp[i + 1][j + 1];
                } else {
                    if ((grid[i][j] == -1 && grid[i][j - 1] == 1) || (grid[i][j] == 1 && grid[i][j + 1] == -1))
                        dp[i][j] = -1;
                    else if (grid[i][j] == 1)
                        dp[i][j] = dp[i + 1][j + 1];
                    else
                        dp[i][j] = dp[i + 1][j - 1];
                }

            }

        }
        return dp[0];
    }

    public int totalSteps(int[] nums) {

        int[] ans = new int[nums.length];
        boolean remove = true;
        int steps = 0;
        int limit = 0;

        while (remove) {
            int count = 0;
            ans[0] = nums[0];

            for (int i = 1, j = 1; i < nums.length - limit; i++) {
                if (nums[i - 1] > nums[i])
                    count++;
                else {
                    ans[j] = nums[i];
                    j++;
                }
            }
            if (count > 0) {
                steps++;
                limit += count;
            } else
                remove = false;

            if (remove) {
                count = 0;
                nums[0] = ans[0];
                for (int i = 1, j = 1; i < ans.length - limit; i++) {
                    if (ans[i - 1] > ans[i])
                        count++;
                    else {
                        nums[j] = ans[i];
                        j++;
                    }
                }
            }
            if (count > 0) {
                steps++;
                limit += count;
            } else
                remove = false;
        }
        return steps;
    }

    public int numDecodings(String s) {

        if (s.length() == 0 || s.charAt(0) == '0')
            return 0;
        else if (s.length() == 1)
            return 1;
        else if (s.length() == 2)
            if (Integer.parseInt(s) <= 26 && Integer.parseInt(s) % 10 != 0)
                return 2;
            else if (Integer.parseInt(s) <= 26 && Integer.parseInt(s) % 10 == 0)
                return 1;
            else
                return 1;

        int totalWays = 0;

        if (Integer.parseInt(s.substring(0, 2)) <= 26)
            totalWays = numDecodings(s.substring(1)) + numDecodings(s.substring(2));
        else
            totalWays = numDecodings(s.substring(1));

        return totalWays;

    }

    // public int getMaximumGold(int[][] grid) {
    //     int maxGold = 0;

    //     for(int i=0; i<grid.length; i++)){
    //         for(int j=0; j<grid[0].length; j++)){
    //             if(grid[i][j] != 0)

                
    //         }
    //     }
    //     return maxGold;
    // }

    // public void getMaximumGold(int[][] grid, int i, int j, maxGold) {
    //     if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
    //         return;

    //     for(int i=0; i<grid.length; i++)){
    //         for(int j=0; j<grid[0].length; j++)){
    //             if(grid[i][j] != 0)
    //                 maxGold = Math.max(maxGold, grid[i][j] + getMaximumGold(grid, i+1, j, maxGold) + getMaximumGold(grid, i-1, j, maxGold) + getMaximumGold(grid, i


    //         }
    //     }
    // }

}
