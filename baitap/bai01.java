package baitap;

import java.util.Scanner;

public class bai01 {
    public static void main(String[] args) {
//        Nhập vào một số nguyên từ bàn phím, kiểm tra số đó là số chẵn
//hay số lẻ, in kết quả ra màn hình console
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số");
        int num = Integer.parseInt(scanner.nextLine());

        if (num % 2 ==0){
            System.out.println("số chẵn");
        } else {
            System.out.println("số lẻ");
        }


    }
}
