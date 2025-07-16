package org.example.EssentialProject.Lv3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kiosk kiosk = new Kiosk();
        kiosk.menu();

        while (true) {
            try {
                System.out.print("번호를 입력해주세요: ");
                int num = scanner.nextInt();
                kiosk.start(num);
                if (num == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            } catch(InputMismatchException e){
                System.out.println("숫자를 입력해주세요!");
                scanner.next();
            }
        }
    }
}
