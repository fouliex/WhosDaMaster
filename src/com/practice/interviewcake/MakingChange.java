package com.practice.interviewcake;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a method that given:
 * 1. an amount of money
 * 2. an array of coin denomination
 * compute the number of ways to make the amount of money with coins with the available denominations.
 * <p>
 * For example:
 * For amount = 4($4) and denomination =[1,2,3](1¢,2¢,3¢) your program would output 4 - the number of ways to make $4
 * with those denominations
 * <p>
 * <p>
 * 1¢, 1¢, 1¢, 1¢
 * 1¢, 1¢, 2¢
 * 1¢, 3¢
 * 2¢, 2¢
 * Created by George Fouche on 10/10/17.
 */
public class MakingChange {
    private Map<String, Integer> memo = new HashMap();

    public int numberOfWays(int amount, int[] denominations) {

        return changePossibilitiesTopDownExample2(amount, denominations, 0);
    }

    /**
     * As a recursive solution this solution often duplicate the work pf checking remaining change possibilities
     * For example, we check ways to make 2 with [3] twice.
     *
     * @param amountLeft
     * @param denominations
     * @param currentIndex
     * @return
     */
    private int changePossibilitiesTopDownExample1(int amountLeft, int[] denominations, int currentIndex) {

        //base case
        //we hit the amount spot on
        if (amountLeft == 0) {
            return 1;
        }

        // we overshot the amount left(used too many coins)
        if (amountLeft < 0) {
            return 0;
        }

        // we are out of denomination
        if (currentIndex == denominations.length) {
            return 0;
        }

      /*  System.out.println(String.format("checking ways to make %d with %s",
                amountLeft, Arrays.toString(Arrays.copyOfRange(denominations, currentIndex, denominations.length))));*/

        // choose a current coin
        int currentCoin = denominations[currentIndex];

        // see how many possibilities we can get
        // for each number of times to use currentCoin
        int numPossibilities = 0;
        while (amountLeft >= 0) {
            numPossibilities += changePossibilitiesTopDownExample1(amountLeft, denominations, currentIndex + 1);
            amountLeft -= currentCoin;
        }

        return numPossibilities;

    }

    /**
     * This solution  solves  our duplicate problem  with memoization and takes O(n *m) time and O(n*M) space,where n is the size of amount
     * m is the number of items in denominations.
     * <p>
     * However because the method is recursive it will build up a large call stack.
     *
     * @param amountLeft
     * @param denominations
     * @param currentIndex
     * @return
     */
    private int changePossibilitiesTopDownExample2(int amountLeft, int[] denominations, int currentIndex) {
        //Check our memo to see if we've already solved this one
        String memoKey = amountLeft + "," + currentIndex;
        if (memo.containsKey(memoKey)) {
            System.out.println("grabbing memo [" + memoKey + "]");
            return memo.get(memoKey);
        }

        //base cases
        if (amountLeft == 0) {
            return 1;
        }

        // we overshot the amount left(used too many coins)
        if (amountLeft < 0) {
            return 0;
        }

        // We are out of denominations
        if (currentIndex == denominations.length) {
            return 0;
        }

        /*System.out.println(String.format("checking ways to make %d with %s",
                amountLeft, Arrays.toString(Arrays.copyOfRange(denominations, currentIndex, denominations.length))));*/


        // choose a current coin
        int currentCoin = denominations[currentIndex];

        int numPossibilities = 0;
        while (amountLeft >= 0) {
            numPossibilities += changePossibilitiesTopDownExample2(amountLeft, denominations, currentIndex + 1);
            amountLeft -= currentCoin;
        }

        memo.put(memoKey, numPossibilities);

        return numPossibilities;

    }

    /**
     * 
     * @param amount
     * @param denominations
     * @return
     */
    public static int changePossibilitiesBottomUp(int amount, int[] denominations) {
        int[] waysOfDoingNCents = new int[amount + 1]; // array of zeros from 0...amount
        waysOfDoingNCents[0] = 1;

        for (int coin : denominations) {
            for (int higherAmount = coin; higherAmount <= amount; higherAmount++) {
                int higherAmountRemainder = higherAmount - coin;
                waysOfDoingNCents[higherAmount] += waysOfDoingNCents[higherAmountRemainder];
            }
        }
        return waysOfDoingNCents[amount];
    }


    public static void main(String[] args) {
        int[] denominations = {1, 2, 3};
        MakingChange makingChange = new MakingChange();
        System.out.println(makingChange.numberOfWays(4, denominations));
        System.out.println(makingChange.changePossibilitiesBottomUp(4, denominations));

    }
}
