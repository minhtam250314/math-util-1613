/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.morgan.mathutil.core;

/**
 *
 * @author Zenny
 */
//đây là class mô phỏng lại các hàm tiện ích/dùng chung cho mọi class khác
//class khác, mô phỏng lại class tiện ích java.Math của JDK
//Pham cái gì là đồ dùng chung, thường dc thiết kế là static
public class MathUtil {

    public static final double PI = 3.14;

    //hàm tiện ích n!=1,2,3,..n
    //lưu ý/quy ước:
    //không tính giai thừa số âm!!!
    //0!=1!=1
    //Vì giai thừa tăng cực nhanh, nên 21! đã vượt 18 số 0
    //tràn kiểu long
    //ta ko tính 21! trở lên
    
    //Sửa hàm 
    //n! = 1.2.3.4.5...n
    //5! = 1.2.3.4.5
    //5! = 4!x5= 5 x 4!
    //4! = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1!
    //1! = 1 chốt dừng
    //n! = n x (n-1)!
    //ĐỆ QUY, GỌI LẠ CHÍNH MÌNH VS QUY MÔ NHỞ HƠN
    
    public static long getFactorial(int n) {
         if (n < 0 || n > 20) 
         throw new IllegalArgumentException("Invalid n.n must be between 0..20");
         
         if (n==0 || n==1)
             return 1;
        
     return n* getFactorial(n-1);
    }
    //CODING CONVENTION; QUY TẮC VIẾT CODE CTY ÉP PHẢI THEO!!!
    //

    //TA HỌC SƠ VỀ KHÁI NIỆM TDD - TEST DRIVEN DEVELOPMENT
    //LA KĨ THUẬT LẬP TRÌNH/ÁP DỤNG CHO DÂN DEVELOPER ĐỂ GIA TĂNG
    //CHẤT LƯỢNG CODE/GIẢM THIỂU CÔNG SỨC TÌM BUG/PHÁT HIỆN BUG SỚM
    //TDD yêu cầu dev khi viết code/viết hàm/class phải viết luôn
    //Các bộ kiểm thử/viết luôn các test case/viết luôn các đoạn
    //code dùng thử hàm/class để kiểm tra tính đúng đắn của hàm/class
    //Viết code kèm với viết test cases
    //Viết code có ý thức viết luôn phần kiểm thử code/hàm/class
    // development driven
    //SAU KHI CÓ DC TÊN HÀM (CHỈ TÊM HÀM MÀ THOY)
    //TA VIẾT LUÔN CÁC TÍNH HUÒNG XÀI HÀM
    //CHẤP NHẬN KHI CHẠY HÀM CHẠY SAI - DO CODE CHƯA XONG
    //SAU KHI TA TỐI ƯU/CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CODE CHẠY ĐÚNG!!!
    //QUÁ TRÌNH SAI - ĐÚNG - SAI - ĐÚNG diễn ra liên tục (cycle)
}
