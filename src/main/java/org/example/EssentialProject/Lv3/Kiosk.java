package org.example.EssentialProject.Lv3;

import java.util.ArrayList;
import java.util.List;

public class Kiosk {
    private final List<MenuItem> menuItems = new ArrayList<>();

    Kiosk(MenuItem a, MenuItem b, MenuItem c, MenuItem d) {
        menuItems.add(a);
        menuItems.add(b);
        menuItems.add(c);
        menuItems.add(d);
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
                System.out.println();
                break;
            case 3:
                System.out.print("선택한 메뉴: ");
                System.out.print(menuItems.get(2).name + " | ");
                System.out.print(menuItems.get(2).price + " | ");
                System.out.print(menuItems.get(2).explain);
                System.out.println();
                break;
            case 4:
                System.out.print("선택한 메뉴: ");
                System.out.print(menuItems.get(3).name + " | ");
                System.out.print(menuItems.get(3).price + " | ");
                System.out.print(menuItems.get(3).explain);
                System.out.println();
                break;
            default:
                System.out.println("있는 메뉴를 선택해주세요!");
        }
    }
}
