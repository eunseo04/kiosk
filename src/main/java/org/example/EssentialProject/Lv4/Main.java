package org.example.EssentialProject.Lv4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu =  new Menu();
        menu.getMenuItems().add(new MenuItem("1.","ShackBurger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.getMenuItems().add(new MenuItem("2.","SmokeShack", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.getMenuItems().add(new MenuItem("3.","Cheeseburger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.getMenuItems().add(new MenuItem("4.","Hamburger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));
        Kiosk kiosk1 = new Kiosk(menu);
        Kiosk kiosk2 = new Kiosk();
        while(true) {
            try {
                kiosk2.mainMenu();
                System.out.print("번호를 입력해주세요: ");
                int num1 = scanner.nextInt();
                if (num1 == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    while (true) {
                        kiosk1.bgMenu(num1);
                        System.out.print("번호를 입력해주세요: ");
                        int num2 = scanner.nextInt();
                        if (num2 == 0) {
                            break;
                        }
                        kiosk1.start(num2);
                    }
                }
            }catch (InputMismatchException e) {
                        System.out.println("숫자를 입력해주세요!");
                        scanner.next();
            }
        }
    }
}
