/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.morgan.mathutil.main;

import com.morgan.mathutil.core.MathUtil;

/**
 *
 * @author Zenny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tryTDDFirst();
        testFactorialGivenWrongArgumentThrowsException();
    }
    
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Tesst casse #3: đưa data cà chón, n âm, n quá lớn
        //                hàm dc thiết kế ném về ngoại lệ!!!
        //thấy ngoại lệ mừng rơi nước mắt khi đưa vào -5
        //thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh
        System.out.println("Hope to see the Exception Illegal Argument Exception");
        MathUtil.getFactorial(-5);
    }
    
    public static void tryTDDFirst(){
        //Test case #1 (tình huống kiểm thử hàm số 1/xài thử hàm);
        //- input: n=1;
        //-Gọi hàm getFactorial(1)
        //Hy vọng hàm trả về 1, vì 1! = 1
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        //so sánh expected vs actual coi chúng nó giống nhau hem
        //giống -> hàm đúng với case đang test
        //sai -> bug rồi!!! với case đang test
        System.out.println("Test 1! | Status: "+
                                       "Expected: 2" + expected +
                                       " | Actual: " + MathUtil.getFactorial(1));
       //Test case #2 (tình huống kiểm thử hàm số 2/xài thử hàm lần 2);
        //- input: n=2;
        //-Gọi hàm getFactorial(2)
        //Hy vọng hàm trả về 2, vì 2! = 2
        System.out.println("Test 1! | Status: "+
                                       "Expected: 2" + expected +
                                       " | Actual: " + MathUtil.getFactorial(2));
    }     
    
}

//TEST CASE LÀ GÌ?
//Là 1 tình huống xài app/kiểm thử app/kiểm thử tính năng/màn hình
//chức năng/xử lí của app
//Test case là tình huống kiểm thử app/chức năng mà khi đó
//ta phải
//- đưa vào data giá/mẫu/test,
//-đưa ra giá trị kì vọng ta mong chờ app trả ra
//sau đó chờ hàm/tính năng xử lí xong trả ra kết quả!!!
//và ta nhìn kết quả và ta so sánh với kì vọng trước đó!!!
//để kết luận hàm ổn/tính năng ổn, TEST CASE PASSED
//                                  TEST CASE FAILED
