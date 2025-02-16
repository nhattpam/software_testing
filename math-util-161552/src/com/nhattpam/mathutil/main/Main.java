/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhattpam.mathutil.main;

import com.nhattpam.mathutil.core.MathUtil;

/**
 *
 * @author nhattpam
 */
public class Main {
    public static void main(String[] args) {
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");  
        System.out.println("5! = " + actual + " actual");

    }
}
