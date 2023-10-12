/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Floc202.mathutil.main;
 
/**
 *
 * @author loclo
 */
import com.Floc202.mathutil.core.MathUtility;
public class Main {
    public static void main(String[] args) {
        //test case 1: xem bên dưới
        int n= 0; //hàm kiềm tra 0!
        long expected = 1; //hàm ý ràng , hy vong rằng n =0! phài trả về 1
        long actual = MathUtility.getFactorial(n); // thực te la mấy gọi hàm biết ngay
        //so sánh giua ecpected == actual hay ko
        System.out.println(n +"! -> expected :" + expected +
                " | actual: " + actual);
        
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n); //5
        System.out.println(n +"! -> expected :" + expected +
                " | actual: " + actual);
        
    }
}
// dân dev viết code(Hàm, class) thì phài có trách nhiệm test code của mình
// làm sao tets code của mình ? 
// c1: in ra màn hình
// c2: in ra file log
// c3: dùng dồ chơi bên - thư viện đem vào!!
// nhưng dù làm kiểu nào cũng pahi3 có 3 cong việc
// thiết kế test case
// thực thi test case - test run
// ghi bug nếu có bug

//test case là bộ data đưa vào app để xem app hành xử đúng 
//  kèm thêm expecter value để xem appp có trả ra ok ko
//kèm thêm huogn71 dẫn sử dụng app
//cấu trúc test case nhu sau
// dùng trong thực tế đi làm và dùng trong bài thi pe
// một test case gồm những info sau
// test case ID : test case description | steps/procedures
// expecter resul| status (pass | faile)
//test case là tình huống xài app với bộ data đưa ra và gái trị kì vong
//giờ ta test hàm getF ta phải thiết kế các test case coi xem 
//hàm trả về đúng hay ko
//test case 1: verity getFactorial (with n = 0) check 0! correct or not?
//test case/ procedule
//1. Given n=0;
//2. call/ invoke getFactorial(n=0)
//
////EXpected result: 1

//test case 2: verity getFactorial (with n = 5) check 0! correct or not?
//test case/ procedule
//1. Given n=120;
//2. call/ invoke getFactorial(n=5)
//
////EXpected result: 120 the method 