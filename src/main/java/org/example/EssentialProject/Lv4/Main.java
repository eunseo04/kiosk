package org.example.EssentialProject.Lv4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.getMenuItems1().add(new MenuItem("1.","ShackBurger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.getMenuItems1().add(new MenuItem("2.","SmokeShack", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.getMenuItems1().add(new MenuItem("3.","Cheeseburger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.getMenuItems1().add(new MenuItem("4.","Hamburger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));
        menu.setMenu("1. Burgers",menu.getMenuItems1());
        menu.getMenuItems2().add(new MenuItem("1.","LemonAde", "W 2.9", "느끼함을 잡아주는 상큼한 레몬맛 에이드"));
        menu.getMenuItems2().add(new MenuItem("2.","MilkShack", "W 3.2", "신선한 우유를 쓴 달달하고 시원한 밀크쉐이크"));
        menu.getMenuItems2().add(new MenuItem("3.","Coke", "W 2.3", "근본!, 햄버거와 찰떡인 톡 쏘는 콜라"));
        menu.getMenuItems2().add(new MenuItem("4.","Cider", "W 2.3", "모두가 아는 맛, 입맛을 살려주는 청량한 사이다"));
        menu.setMenu("2. Drinks",menu.getMenuItems2());
        menu.getMenuItems3().add(new MenuItem("1.","Salad", "W 2.9", "아삭한 채소와 달콤한 마요네즈의 조합"));
        menu.getMenuItems3().add(new MenuItem("2.","FriedPotato", "W 3.2", "햄버거의 친구, 바삭바삭한 감자튀김"));
        menu.getMenuItems3().add(new MenuItem("3.","IceCream", "W 2.3", "입안에서 녹는 바닐라 아이스크림"));
        menu.getMenuItems3().add(new MenuItem("4.","CheeseStick", "W 2.3", "쭈욱 늘어나는 치즈스틱"));
        menu.setMenu("3. Desserts",menu.getMenuItems3());
        Kiosk kiosk = new Kiosk(menu.getMap());

        while(true) {
            try {
                System.out.println("[ MAIN MENU ]");
                menu.getCategory();
                System.out.println("0. 종료");
                System.out.print("번호를 입력해주세요: ");
                int num1 = scanner.nextInt();
                System.out.println();
                if (num1 == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    kiosk.burgerMenu(num1);
                    System.out.print("번호를 입력해주세요: ");
                    int num2 = scanner.nextInt();
                    System.out.println();
                    kiosk.start(num2);
                }
            }catch (InputMismatchException e) {
                        System.out.println("숫자를 입력해주세요!");
                        scanner.next();
            }
        }
    }
}
