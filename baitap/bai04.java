package baitap;

import java.util.Scanner;

public class bai04 {
//Nhập từ bàn phím một số nguyên, kiểm tra và in kết quả số đó có
//chia hết cho cả 3 và 5 không


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số nguyên ");
        int num = Integer.parseInt(scanner.nextLine());

        if (num%3==0 && num%5==0){
            System.out.println("số chia hết cho cả 3 và 5 ");
        }else {
            System.out.println("số không chia hết cho cả 3 và 5 ");
        }

    }
}
