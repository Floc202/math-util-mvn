/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Floc202.mathutil.core;

/**
 * 
 * @author loclo
 */
//Class này sẽ chứa các hàm static sinh ra để làm tool dùng chung
//cái gì mà dùng chung cho nhiều nơi nhna65 info và trả info, trả vw62 info qua
//hàm mà ko cần lưu trữ 
//do062 nào là static thì gọi gọi trực tiếp qua class
// ko gọi static qua con dường new!!!!!!!!!!!!

public class MathUtility {
    /**
     * C# public const db pi 3.14
     */
    public static final double PI = 3.14;
    // hàm tính n! 
    //n quá lớn thì tra kieu long
    //
    public static long getFactorial(int n){
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0...20");
        if(n == 0 || n == 1)
            return 1; // nếu có thề kết thúc sớm, thì kết thúc ngay
        // sống sót đến chỗ này sure n = 2...20 vì nếu lớn hpn7 20 chết dọc dường rồi,
        // 2 cụm if ở trên rồi ko cần else vì trên đó xài return 
//        long result = 10; //giai thừa khời đầu là 1 
        //khi long = 10 là cố tình làm code màu đỏ vì 2!lúc này là 20, 3! là 60
        //nhân 10 lần
        //nhân dồn 2 3 4 5 ...n vào biến này thì thành n!
        
//        for (int i = 2; i <= n; i++) {
//            result *=i;
//        }
//        return result;
            return n*getFactorial(n - 1); //đệ quy xong
    }
    // Đê quy = recursion
    //búp bê Nga - đệ quy là gọi chính mình với quy mô nhỏ hơn nhỏ đến mức thì dừng tay
    //5! = 1.2.3.4.5
    //5! = 4! .5 = 5. 4!
    //4! = 1.2.3.4
    //4! = 4. 3!
    //3!= ......
    //N! = N.(N-1)!
    //
    //kĩ thuật kiểm thử hồi quy - regression  test
    //test lại những code cũ đã từng test để xác nhận nó còn có ổn ko 
    //tại sao phài test lại ?
    //ccode theo thời gian có thay đổi thay đổi vì 
    // 1. Ae fix bug , sẽ sửa code 
    // 2. ae tối uu code , cpde đẹp hơn , chạy ctot61 hơn 
    //3. ae thêm hàm mới  khi test dam bao nó van ngon van xanh
    // nếu màu xanh code chỉnh sữa ổn , vì thỏa expected  == actual
    // ta test cần màu  > nahanh , ko hao sức , chinn1h xác miên đủ test case , test script
    // test lại những thứ test gọi là test hồi quy regrenssion
    
}
