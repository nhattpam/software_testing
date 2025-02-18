/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.nhattpam.mathutil.test.core;

import com.nhattpam.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author nhattpam
 */
@RunWith(value = Parameterized.class)
public class MathUtityDDTTest {

    //tra ve mang 2 chieu, gom nhieu gap Expected | Input
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1}, // n = 0, expected = 1
            {1, 1}, // n = 1, expected = 1
            {2, 2}, // n = 2, expected = 2
            {3, 6}, // n = 3, expected = 6
            {4, 24}, // n = 4, expected = 24
            {5, 120} // n = 5, expected = 120
        };
        //int a[] = {1,2,3}
        //int a[][] = {{1,2}, {3,4}, {5,6}}
    }

    @Parameterized.Parameter(value = 0) // map với cột đầu tiên trong mảng (Input)
    public int n;

    @Parameterized.Parameter(value = 1) // map với cột thứ hai trong mảng (Expected Output)
    public long expected;

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
