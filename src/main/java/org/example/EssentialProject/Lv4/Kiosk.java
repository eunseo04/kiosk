package org.example.EssentialProject.Lv4;

import java.util.ArrayList;
import java.util.List;

public class Kiosk {

    private final List<String> main = new ArrayList<>();
    Menu menu;

    Kiosk() {
        main.add("[ MAIN MENU ]");
        main.add("1. Burgers");
        main.add("2. Drinks");
        main.add("3. Desserts");
        main.add("0. 종료");
    }

    Kiosk (Menu menu) {
        this.menu = menu;
    }

    public void mainMenu() {
        for (String str : main) {
            System.out.println(str);
        }
    }

    public void bgMenu(int num1){
        if (num1 == 1) {
            System.out.println("[ BURGERS MENU ]");
            menu.burgerMenu();
        }
    }

    public void start(int num2) {
        switch(num2) {
            case 0:
                break;
            case 1:
                System.out.print("선택한 메뉴: ");
                System.out.print(menu.getMenuItems().get(0).name + " | ");
                System.out.print(menu.getMenuItems().get(0).price + " | ");
                System.out.println(menu.getMenuItems().get(0).explain);
                System.out.println();
                break;
            case 2:
                System.out.print("선택한 메뉴: ");
                System.out.print(menu.getMenuItems().get(1).name + " | ");
                System.out.print(menu.getMenuItems().get(1).price + " | ");
                System.out.println(menu.getMenuItems().get(1).explain);
                System.out.println();
                break;
            case 3:
                System.out.print("선택한 메뉴: ");
                System.out.print(menu.getMenuItems().get(2).name + " | ");
                System.out.print(menu.getMenuItems().get(2).price + " | ");
                System.out.println(menu.getMenuItems().get(2).explain);
                System.out.println();
                break;
            case 4:
                System.out.print("선택한 메뉴: ");
                System.out.print(menu.getMenuItems().get(3).name + " | ");
                System.out.print(menu.getMenuItems().get(3).price + " | ");
                System.out.println(menu.getMenuItems().get(3).explain);
                System.out.println();
                break;
            default:
                System.out.println("있는 메뉴를 선택해주세요!");
        }
    }
}
