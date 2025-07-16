package org.example.EssentialProject.Lv3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Kiosk {
    private final List<MenuItem> menuItems = new ArrayList<>();

    Kiosk() {
        menuItems.add(new MenuItem("ShackBurger", 6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void menu() {
        for  (MenuItem menuItem : menuItems) {
            System.out.print(menuItem.name + " | ");
            System.out.print(menuItem.price + " | ");
            System.out.print(menuItem.explain);
            System.out.println();
        }
    }

    public void start(int num) {
        switch(num) {
            case 1:
                System.out.println("ShackBurger을(를) 선택하셨습니다.");
                break;
            case 2:
                System.out.println("SmokeShack을(를) 선택하셨습니다.");
                break;
            case 3:
                System.out.println("Cheeseburger을(를) 선택하셨습니다.");
                break;
            case 4:
                System.out.println("Hamburger을(를) 선택하셨습니다.");
                break;
            default:
                System.out.println("있는 메뉴를 선택해주세요!");
        }
    }
}
