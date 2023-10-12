/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.Floc202.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author loclo
 */
public class MathUtilityTest {
    //test case template/ structure:
    //ID | Desc | steps/procedures | expected result | status (PASSED/FAILED)
    //test case #1 : verify the getFactorial()function with n = 0
    //steps/ procedures:
    //  1. Given n= 0;
    //      2. call/ invoke getFactorial(int 0)
    //Expected result 
    //the method getFactorial(n = 0) must return 1
    //          as the result of 0! == 1
    //status : passed | failed đoán xem khi chạy app /hàm / mothod
    
    @Test
//tets case 2: n = 1;
    public void verifyFactorialGiveRightArhument1ReturnsOK(){
        
        assertEquals(1, MathUtility.getFactorial(0));
        
    }
    @Test
    // test case 3: n= 5
    public void verifyFactorialGiveRightArhument5ReturnsOK(){
        
        assertEquals(120, MathUtility.getFactorial(5));
        
    }
    @Test
    //test case 4; n= 6
    public void verifyFactorialGiveRightArhument6ReturnsOK(){
        
        assertEquals(720, MathUtility.getFactorial(6));
        
    }
    
}
