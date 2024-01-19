package baitap;

import java.util.Scanner;

public class bai10 {

//Viết chương trình nhập vào lương cơ bản và ngày công thực tế
//của nhân viên. In ra màn hình lương nhân viên biết:
//• Số ngày công trong tháng là 26 ngày
//• Lương được tính theo công thức:
//• lương cơ bản * (ngày công thực tế / số ngày công)
//• Nếu ngày công lớn hơn ngày công thực tế thì các ngày dư ra sẽ
//được tính 150% so với ngày công bình thường


    public static void main(String[] args) {

        int defaultWorkday = 26;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ngày công thực tế ");
        int actualWorkday = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập lương cơ bản ");
        float basicSalary = Float.parseFloat(scanner.nextLine());

        int overTime = actualWorkday - defaultWorkday;
        float income ;

        if (overTime >=0) {
            income = basicSalary + overTime*(basicSalary/defaultWorkday)*1.5F;
        }else {
            income = basicSalary *((float) actualWorkday /defaultWorkday) ;
        }

        System.out.printf("thu nhập của bạn là: %f",income);

    }
}
