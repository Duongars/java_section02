package baitap;

import java.util.Scanner;

public class bai07 {
//: Nhập vào năm và tháng, in ra màn hình số ngày trong tháng đó

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng ");
        int month = Integer.parseInt(scanner.nextLine());


        switch (month){
            case 1 :
                System.out.printf("tháng %d có 31 ngày ",month );
                break;
            case 2 :
                System.out.printf("tháng %d có 28 ngày ",month );
                break;
            case 3 :
                System.out.printf("tháng %d có 31 ngày ",month );
                break;
            case 4 :
                System.out.printf("tháng %d có 30 ngày ",month );
                break;
            case 5 :
                System.out.printf("tháng %d có 31 ngày ",month );
                break;
            case 6 :
                System.out.printf("tháng %d có 30 ngày ",month );
                break;
            case 7 :
                System.out.printf("tháng %d có 31 ngày ",month );
                break;
            case 8 :
                System.out.printf("tháng %d có 31 ngày ",month );
                break;
            case 9 :
                System.out.printf("tháng %d có 30 ngày ",month );
                break;
            case 10 :
                System.out.printf("tháng %d có 31 ngày ",month );
                break;
            case 11 :
                System.out.printf("tháng %d có 30 ngày ",month );
                break;
            case 12 :
                System.out.printf("tháng %d có 31 ngày ",month );
                break;

        }
    }
}
