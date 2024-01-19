package baitap;

import java.util.Scanner;

public class bai06 {

//    : Nhập vào chỉ số cũ (chỉ số công tơ điện ở đầu tháng) và chỉ số
//mới (chỉ số công tơ điện ở cuối tháng), tính tiền điện tiêu thụ trong tháng
//của hộ gia đình biết giá điện được tính như sau:
//Số điện (kWh) Giá điện (VNĐ/kWh)
//0 <= Số điện < 50 10.000
//50 <= Số điện < 100 15.000
//100 <= Số điện < 150 20.000
//150 <= Số điện < 200 25.000
//200 <= Số điện 30.00

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số diện cũ");
        float oldIndex = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập số diện mơí ");
        float newIndex = Float.parseFloat(scanner.nextLine());

        float consume = newIndex-oldIndex;
        float bill;

        if (consume<50){
            bill= consume* 10000;
        } else if (consume<100) {
            bill = consume * 15000;
        } else if (consume<150) {
            bill = consume * 20000;
        } else if (consume<200) {
            bill = consume * 25000;
        } else {
           bill = consume * 30000;
        }

        System.out.printf("hóa đơn tiền điện là : %.2f",bill);

        } {


    }
}
