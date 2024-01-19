package baitap;

import java.util.Scanner;

public class bai09 {
//    Nhập vào 3 số từ bàn phím, In ra 3 số theo thứ tự có giá trị giảm
//dần

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số 1 ");
        float a = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập số 2 ");
        float b = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập số 3 ");
        float c = Float.parseFloat(scanner.nextLine());

        float first, second,third;

        if (a<b){
            first =a;
            second=b;
        } else {
            second=a;
            first=b;
        }

        if (first>c){
            first=c;
            second=a;
            third=b;
        }else if ( second<c) {
            third=c;

        }else {
            third=second;
            second=c;

        }

        System.out.printf("thứ tự giảm dần %f %f %f",third,second,first );

    }


}
