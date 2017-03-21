package com.rong.interviews.bitscount;

import junit.framework.TestCase;

/**
 * Created by rongyj on 3/21/17.
 */
public class SetBitsCounterTest extends TestCase {

    public void testCountSetBits(){
        SetBitsCounter setBitsCounter = new SetBitsCounter();
        int bitsCount=setBitsCounter.sumCount(0);
        assertEquals(0,bitsCount);
        bitsCount=setBitsCounter.sumCount(6);
        assertEquals(9,bitsCount);
        bitsCount=setBitsCounter.sumCount(8);
        assertEquals(13,bitsCount);
    }
}
