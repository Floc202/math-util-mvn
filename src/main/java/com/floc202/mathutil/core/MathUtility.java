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
        if(n == 0 || n==1)
            return 1; // nếu có thề kết thúc sớm, thì kết thúc ngay
        // sống sót đến chỗ này sure n = 2...20 vì nếu lớn hpn7 20 chết dọc dường rồi,
        // 2 cụm if ở trên rồi ko cần else vì trên đó xài return 
        long result = 1; //giai thừa khời đầu là 1 
        //nhân dồn 2 3 4 5 ...n vào biến này thì thành n!
        
        for (int i = 2; i <= n; i++) {
            result *=i;
        }
        return result;
    }
    
}
