package com.example.tianyong.unittestlibrary;

/**
 * Created by Creaty on 2017/5/15.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayTest {
    private Array mArray;
    int[] ArrayList = {-2, -3, -5, 10, -9};


    @Before
    public void setUp() throws Exception {
        mArray = new Array();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void list() throws Exception {
        assertEquals(10, mArray.list(ArrayList), 0);

    }

}