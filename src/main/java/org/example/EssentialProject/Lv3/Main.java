package org.example.EssentialProject.Lv3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuItem a = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem b = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem c = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem d = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        Kiosk kiosk = new Kiosk(a, b, c, d);
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
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요!");
                scanner.next();
            }
        }
    }
}
