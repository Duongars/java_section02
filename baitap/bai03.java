package baitap;

import java.util.Scanner;

public class bai03 {
//: Nhập vào 2 số nguyên và một phép tính toán học, in ra kết quả
//của các phép tính


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số nguyên 1");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số nguyên 2");
        int num2 = Integer.parseInt(scanner.nextLine());

        float result =0 ;
        System.out.println("nhập toán tử");
        String operator = scanner.nextLine();

        switch (operator){
            case "cộng" :
            result = num1+ num2;
            break;
            case "trừ" :
                result = num1 - num2;
                break;
            case "nhân" :
                result = num1 * num2;
                break;
            case "chia" :
                result = num1 / num2;
                break;
        }

        System.out.printf("kết quả phép tính %s là %f",operator,result);


    }
}
