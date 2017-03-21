package com.rong.interviews.bitscount;

/**
 * Created by rongyj on 3/20/17.
 */
public class SetBitsCounter {

    private int countSetBits(int number) {
        int count = 0;
        while(number>0){
            ++count;
            number &= number-1;
        }
        return count;
    }

    /**
     * Summary the bitsCount for the numbers from 1 to the specified number
     * @param number  the input postive integer
     * @return The sum of the set bits count for all numbers from 1 to the input number
     */

    public int sumCount(int number){
        int sum=0;
        for(int i=1; i<=number; i++){
            sum=sum+countSetBits(i);
        }
        return sum;
    }
}
