package com.practice.leetcode.easy.math;

/**
 *
 * Given two numbers n and k where n represents number of elements in a set, find number of ways to partition the set
 * into k subsets.
 *
 * Example 1:
 * Input: n = 3, k = 2
 * Output: 3
 *
 * Explanation: Let the set be {1,2,3}, we can partition it into 2 subsets in the following ways
 * {
 *     {1,2}, {3}},
 *     {{1}, {2,3}},
 *     {{1,3}, {2}},
 * }
 *
 * Example 2:
 * Input: n =3, k =1
 * Output: 1
 *
 * Explanation: let the set be {1,2,3}, we can partition it into 1 set
 * {
 *     {{1,2,3}}
 * }
 *
 *
 *
 */
public class CountNumberOfWaysToPartitionASetIntoKSubsets {


    /**
     * Let S(n,k) be total number of partitions of n elements into k sets. Value of S(n,k) can be defined recursively as,
     * S(n,k) = k*S(n-1,k) +S(n-1,k-1)
     *
     * When we add a (n+1)'th element to k partitions, there are two possibilities.
     * 1) It is added as a single element set to existing partitions. For example S(n,k-1)
     * 2) It is added to all sets of every partition. For example k*S(n,k)
     *
     * Therefore S(n+1,k) = k*S(n,k) + S(n,k-1) which means
     *
     * S(n,k) = K*S(n-1,k) + S(n-1,k-1)
     * @param n
     * @param k
     * @return
     */
    public static int countP(int n, int k){

        //Base cases
        if ( n == 0 || k == 0 || k>n)
            return 0;

        if (k ==1 || k == n)
            return 1;

        //S(n,k) = k*S(n-1,k) + s(n-1,k-1)
        //System.out.println(k * countP(n-1,k) + countP(n-1,k-1));
        return (k * countP(n-1,k) + countP(n-1,k-1));
    }

    /**
     * A Dynamic Programming way to count the number of partitions of a set with n elements into k subsets
     * @param n
     * @param k
     * @return
     */
    public static int coutPDPWay(int n, int k){

        // Table to store the results
        int [][] dp = new int[n+1][k+1];

        //Base cases
        for (int i =0; i <= n; i++){
            dp[i][0] = 0;
        }
        for (int i =0; i<=n; i++){
          dp[0][k] = 0;
        }

        for( int i  =1; i <=n; i++){
            for(int j = 1; j <=k; j++){
                if( j== 1 || i == j){
                    dp[i][j] =1;
                }else{
                    dp[i][j] = j * dp[i - 1][j] + dp[i - 1][j - 1];
                }

            }
        }
        return dp[n][k];
    }


    public static void main(String[] args) {
        System.out.println(countP(3,2));
        System.out.println(coutPDPWay(3,2));
        System.out.println(countP(9,3));
    }
}
