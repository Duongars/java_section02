package baitap;

import java.util.Scanner;

public class bai02 {

//    Nhập vào 3 điểm html, css, javascript của sinh viên, tính điểm
//trung bình và in ra xếp loại của sinh viên:
//Điểm trung bình Xếp loại
//0 <= avgMark < 5 Yếu
//5 <= avgMark < 7 Trung bình
//7 <= avgMark < 8 Khá
//8 <= avgMark < 9 Giỏi
//9 <= avgMark < 10 Xuất sắc

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số điểm");
        float mark = Float.parseFloat(scanner.nextLine());
        if (mark < 5) {
            System.out.println("xếp loại yếu");
        } else if (mark<7) {
            System.out.println("xếp loại trung bình");
        }else if (mark<8) {
            System.out.println("xếp loại khá");
        }else if (mark<9) {
            System.out.println("xếp loại giỏi");
        }else {
            System.out.println("xếp loại xuât sắc");
        }


    }
}
