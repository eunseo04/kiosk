package org.example.EssentialProject.Lv2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem a = new MenuItem("ShackBurger", 6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem b = new MenuItem("SmokeShack", 8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem c = new MenuItem("Cheeseburger", 6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem d = new MenuItem("Hamburger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거");

        menuItems.add(a);
        menuItems.add(b);
        menuItems.add(c);
        menuItems.add(d);

        for  (MenuItem menuItem : menuItems) {
            System.out.print(menuItem.name + " | ");
            System.out.print(menuItem.price + " | ");
            System.out.print(menuItem.explain);
            System.out.println();
        }

        while (true) {
            try {
                System.out.print("번호를 입력해주세요: ");
                int num = scanner.nextInt();

                if (num == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                switch(num) {
                    case 1:
                        System.out.print("선택한 메뉴: ");
                        System.out.print(menuItems.get(0).name + " | ");
                        System.out.print(menuItems.get(0).price + " | ");
                        System.out.print(menuItems.get(0).explain);
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("선택한 메뉴: ");
                        System.out.print(menuItems.get(1).name + " | ");
                        System.out.print(menuItems.get(1).price + " | ");
                        System.out.print(menuItems.get(1).explain);
                        break;
                    case 3:
                        System.out.print("선택한 메뉴: ");
                        System.out.print(menuItems.get(2).name + " | ");
                        System.out.print(menuItems.get(2).price + " | ");
                        System.out.print(menuItems.get(2).explain);
                        break;
                    case 4:
                        System.out.print("선택한 메뉴: ");
                        System.out.print(menuItems.get(3).name + " | ");
                        System.out.print(menuItems.get(3).price + " | ");
                        System.out.print(menuItems.get(3).explain);
                        break;
                    default:
                        System.out.println("있는 메뉴를 선택해주세요!");
                }
            } catch(InputMismatchException e){
                System.out.println("숫자를 입력해주세요!");
                scanner.next();
            }
        }
    }
}
