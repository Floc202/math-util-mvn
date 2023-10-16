/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.Floc202.mathutil.core.test;

import com.Floc202.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author loclo
 */
public class MathUtilityDDTTest {
    //ta cần chuẩn bị bộ data để nhồi vào cái hàm qua 2 tham số
    // kĩ thuật tách data kiểm thử ra khỏi câu lệnh so sánh 
    // 1 cái đầu vào n , 1 cái dau062 ra exc
    //và có nhieu cap nhu the 
    // còn gọi là tham so kiem thu
    //dua data vao qua tham so ham
    
    // hàm 2 chiều này sẽ nhồi vào hàm ở dưới 
    public static Object[][] initData(){
        Object[][] dataSet = {{0,1},
                              {1,1},
                              {3,6},
                              {4,24},
                              {5,120}};
        return dataSet;
    }
    @ParameterizedTest
    @MethodSource("initData")
//tets case
    public void verifyFactorialGiveRightArhumentReturnsOK(int n, long expected){
        
        assertEquals(expected, MathUtility.getFactorial(n));
        
    }
    
}
