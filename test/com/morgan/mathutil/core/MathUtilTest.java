package com.morgan.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;



/**
 *
 * @author Zenny
 */
public class MathUtilTest {
    
    //Ta đi test ngoại lệ, tức là so sánh/đo lường xem ngoại lệ
    //có xuất hiện hay ko khi ta đưa data cà chớn, n < 0 || n > 20
    //thay vì so sánh expected value vs. actual value
    //LÚC NÀY TA SẼ ĐI SO SÁNH/ƯỚC LƯỢNG XEM NGOẠI LỆ CÓ XUẤT HIỆN NHƯ KÌ VỌNG
    //NẾU NGOẠI LỆ XH NHƯ KÌ VỌNG, THÌ MÀU XANH - THẤY MÀU ĐỎ NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    
    @Test(expected = Exception.class)
        public void testFactorialGivenWrongArgumentThrowsException() {
        //Tesst casse #3: đưa data cà chón, n âm, n quá lớn
        //                hàm dc thiết kế ném về ngoại lệ!!!
        //thấy ngoại lệ mừng rơi nước mắt khi đưa vào -5
        //thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh
        System.out.println("Hope to see the Exception Illegal Argument Exception");
        MathUtil.getFactorial(-5);
    }
        
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        
       //Test case #2: n = 3, hy vọng hàm trả về 6, thực tế???
       Assert.assertEquals(6, MathUtil.getFactorial(3));
       
       //Test case #2: n = 4, hy vọng hàm trả về 24, thực tế???
       Assert.assertEquals(24, MathUtil.getFactorial(4));
       
       //Test case #3: n = 5, hy vọng hàm trả về 120, thực tế???
       Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
    
    
    @Test //coding convention - quy tắc viết code
          //tên hàm kiểm thử/tên hàm của test script
          //phải nói lên ý nghĩa của việc kiểm thử
          //tình huống này, ta mún test hàm getF() tham số tử tế
          //n = 0..20!!!
    public void testFactorialGivenRightArgumentReturnsWell() {
        
        //Test case số #1: n = 0, hy vọng trả về 1
        //                        thực tế hàm trả về mấy, đoạn xem!!!
        long expected = 1;
        long actual = MathUtil.getFactorial(0); //hàm chạy đi thì mới biết
        //so sánh giữa expected vs. actual, máy tự so, ko cần
        //sout() khổ cực
        Assert.assertEquals(expected, actual);
       
       //Test case #2: n = 1, hy vọng hàm trả về 1, thực tế???
       Assert.assertEquals(1, MathUtil.getFactorial(1));
       
       //Test case #2: n = 2, hy vọng hàm trả về 2, thực tế???
       Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    
    //@Test ra lệnh cho thư viện JUnit mình đã add/import
    //tự động generate ra cái hàm public static valid main()
    //biến hàm tryJUnitComparison() thành hàm main()
    //và gửi main() này cho JVM chạy - Java Virtual Machine
    //@Test --- main()
    //ko @Test thì class ko có main(), lấy gì mà chạy no runable method
    
    @Test
    public void tryJUnitComparison() {
        //hàm này thử nghiệm so sánh expected vs. actual
        //ta đang xài hàm của thư viện JUnit nhưng ko xài bừa
        //bãi mà phải viết theo quy tắt định trước
        //quy tắc định trước nằm ở @ - annotation
        Assert.assertEquals(69, 69);
    }  
}

//CLASS NÀY DEV SẼ VIÉT NHỮNG CÂU LỆNH DÙNG ĐỂ TEST HÀM
//CỦA CODE CHÍNH, TEST CÁC HÀM CỦA CLASS MATHUTIL
//Trong class này sẽ có những lời gọi hàm getFactorial()
//có những lệnh so sánh giữa EXPECTED và ACTUAL
//giống giống mình đã làm test ở bên MAIN()
//nhưng khác ở chỗ, SAI -> MÀU ĐỎ, ĐÚNG -> MÀU XANH
//mắt ko cần nhìn các dòng output từ hàm System.out cho mất sức
//mắt giờ chỉ nhìn 2 màu XANH ĐỎ
//Muốn có dc điều này ta sẽ dùng thêm các UNIT TESTING FRAMEWORK
//Ví dụ: JUnit, TestNG (Java)
//       xUnit,MSTest,NUnit(C#)
//       PHUnit(PHP)
//       ...

//VIỆC VIẾT CODE ĐỂ TEST CODE GỌI LÀ UNIT TESTING
//ĐOẠN CODE TRONG CLASS NÀY DÙNG JUNIT/UNIT TESTING FRAMEWORK
//ĐỂ KIỂM THỬ HÀM CỦA CODE CHÍNH
//ĐOẠN CODE KIỂM THỬ NÀY ĐC GỌI LÀ: TEST SCRIPT
//Code dùng để test code (chính) gọi là test script
//Test Script là các đoạn code đc viết ra để tesst code chính (DAO
//DTO, Controller, API...)
//Muốn test thì cần phải phác thảo các TEST CASE
//Test Script sẽ sử dụng các Test Case
//Ví dụ: Viết code để test hàm getFactorial() với các case
//n = -5, 0, 1, ...

//QUY TẮC XANH ĐỎ
//* MÀU XANH KHI TẤT CẢ CÁC TEST CASE PHẢI CÙNG LÀ XANH,
//tức là expected == actual
//cho tất cả các tình huống test

//* MÀU ĐỎ CHỈ CẦN 1 TRONG NHỮNG TEST CASE BỊ SAI
//CHỈ CẦN 1 CÁI EXPECTED != ACTUAL, KẾT LUẬN MẠNH TAY/GẮT: HÀM SAM QUÁ SAI

//Ý nghĩa của quy tắc nếu đã test, nếu đã liệt kê các test case, thì chúng
//phải đúng hết, còn chỉ cần 1 thằng sai, hàm ko ổn định về việc return => hàm sai
//ĐÚNG ĐÚNG HẾT, SAI THÌ CẦN 1 THẰNG

//EXPECTED == ACTUAL => CASE ĐÚNG, TEST CASE PASSED
//EXPECTED != ACTUAL => CASE FAILED
      //NẾU EXPECTED LÀ CHÍNH XÁC, HÀM ĐÃ XỬ LÍ SAI, BUG
      //CŨNG CÓ KHI EXPECTED, CÁI TA KÌ VỌNG BỊ SAI!!! LỖI DO DÂN QC TÍNH TOÁN
      //BẰNG TAY BỊ SAI!!

//TOÀN BỘ CODE TRONG CLASS NÀY DC VIẾT RA DÙNG ĐỂ TEST CODE CHÍNH Ở
//BÊN SRC PACKAGES
//CODE DC VIẾT RA DÙNG ĐỂ ĐI TEST CODE KHÁC
//THÌ CODE NÀY DC GỌI LÀ TEST SCRIPT
//1 TEST SCRIPT SẼ CHỨA NHIỀU CODE ĐỂ TEST HÀM CHÍNH
//1 TEST SCRIPT SẼ CHỨA NHIỀU TEST CASE
//                            TEST CASE, CÁC TÌNH HUỐNG XÀI HÀM
//1 TEST SCRIPT CÓ THỂ XÀI DDT ĐỂ DỄ BẢO TRÌ CODE TEST
//VIẾT VIẾT CODE CHÍNH CÓ THỂ XÀI TDD