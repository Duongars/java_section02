package baitap;

import java.util.Scanner;

public class bai05 {

//    : Nhập vào 3 cạnh của tam giác, kiểm tra 3 cạnh đó có phải là tam
//giác không, nếu là tam giác thì là tam giác gì (thường, cân, vuông, vuông
//cân, đều

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh 1 ");
        float a = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập cạnh 2 ");
        float b = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập cạnh 3 ");
        float c = Float.parseFloat(scanner.nextLine());

        boolean angleCheck = true;

        if (a + b < c || a + c < b || b + c <3){
            angleCheck = false;
            System.out.println("đây không phải là tam giác");

        }

        if (angleCheck){
            if (a == b && b == c && a == c){
                System.out.println("đây là tam giác đều");
            } else if (a == b || b == c || c == a) {
                System.out.println("đây là tam giác cân");
            } else if (a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c) {
                System.out.println("đây là tam giác vuông");
            }else{
                System.out.println("đây là tam giác thường");
            }

        }

    }


}
