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

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        //Dùng đệ quy, kiểm thử hồi quy - REGRESSION TESTING
        //Trong thực tế làm dự án, code của ta sẽ liên tục đc sửa vì
        //Fix bug thì phải sửa code, sửa hàm
        //Thêm hàm, thêm tính năng
        //Tối ưu hàm cũ, làm hàm cũ gọn hơn dễ đọc hơn chạy nhanh hơn
        //Hàm đang ngon - đang màu xanh, nếu ta sửa code vì lí do gì đó
        //Liệu rằng hàm còn xanh hay ko, thì phải test lại
        //Nếu test bằng tay, log thì cực kì tốn tgian, mất sức
        //Nếu code của ta có sẵn test script
        //Nếu hàm sửa ngon nó phải ra màu XANH, ko ngon ra màu ĐỎ
        //Nhờ test script ta verify lại 1 hàm rất nhanh -> kiểm thử lại
        //Thứ đã từng kiểm thử để đảm bảo nó còn nogn so với trước khi sửa
        //Gọi là kiểm thử hồi quy, nhờ CI hồi quy liên tục
        
        //Bài này mình thử hồi quy bằng cách sửa lại hàm theo thuật toán
        //Đệ quy - RECURSION
        
        //5! = 1 . 2 . 3 . 4 . 5
        //5! =            4! . 5
        //4! = 1 . 2 . 3 .4
        //4! =       3! . 4
        //3! = 1 . 2 . 3
        //3! =    2! . 3
        //2! = 1 . 2 DỪNG NHEN. ĐỆ QUY LUÔN PHẢI DỪNG
        //N! = N . (N-1)! ĐỆ QUY LÀ GỌI LÀ CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
        //                BÚP BÊ NGA
        
        return n * getFactorial(n-1);
    }

//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be 0..20");
//
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        long result = 1; //biến tích lũy, gom dồn việc nhân, biến con heo
//        //accumulation
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//
//        return result;
//    }
}
