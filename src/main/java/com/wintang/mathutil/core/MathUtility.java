/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wintang.mathutil.core;

/**
 *
 * @author Wintang
 */
//class này chứa 1 loạt các hàm static dùng làm thư viện cho nơi khác 
public class MathUtility {

    public static final double PI = 3.14;

    public static long getFactorial(int n) {

        if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be 0..20");

        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1; //biến tích lũy, gom dồn việc nhân, biến con heo
        //accumulation
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
