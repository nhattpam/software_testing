package com.nhattpam.mathutil.test.core;

import com.nhattpam.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author nhattpam
 */
public class MathUtilityTest {

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test case tu te dau vao -> phai chay dung
        long expected = 1; //hy vong 0! = 1
        long actual = MathUtil.getFactorial(n);//call ham

        //so sanh expected vs actual dung framework
        Assert.assertEquals(expected, actual);
        //ham giup so sanh 2 gia tri nao do co giong nhau khong
        //neu giong nhau -> mau xanh
        //neu khac nhau -> mau do

        //gop them vai case thanh cong/dua dau vao ngon!!! -> ham phai tinh ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));

    }

    // dua data vao linh tinh; THIET KE CUA HAM LA NEM RA NGOAI LE
    //KI vong EXCEPTION xuat hien khi n<0 || n>20
    //Rat mong EXCEPTION xuat hien
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        //Test case
//        //input: -5
//        //excepted: IllegalArgumentException xuat hien
//        MathUtil.getFactorial(-5); //ham @Test chay, hay ham getF chay -> nem ra ngoai le NumberFormat
//        
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        //Test case
        //input: -5
        //excepted: IllegalArgumentException xuat hien
        MathUtil.getFactorial(-5); //ham @Test chay, hay ham getF chay -> nem ra ngoai le NumberFormat
    }

    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        //Test case
        //input: -5
        //excepted: IllegalArgumentException xuat hien
        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-5));

    }

    //Dùng try-catch (JUnit 4 & 5)
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        try {
            MathUtil.getFactorial(-5); // Gọi hàm cần test
            Assert.fail("Expected IllegalArgumentException but none was thrown"); // Nếu không có exception, test FAIL
        } catch (IllegalArgumentException e) {
            // Nếu bắt được đúng exception, test PASS
        }
    }

    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch2() {
        try {
            MathUtil.getFactorial(-5); // Gọi hàm cần test
        } catch (Exception e) {
            Assert.assertEquals("Invalid  argument. N must be between 0..20", 
                    e.getMessage());
        }
    }
}
