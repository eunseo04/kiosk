package org.example.EssentialProject.Lv4;

import java.util.HashMap;
import java.util.List;

public class Kiosk {
    HashMap<String, List<MenuItem>> map;

    Kiosk(HashMap<String, List<MenuItem>> map) {
        this.map = map;
    }

    public void burgerMenu(int num1) {
        if (num1 == 1) {
            System.out.println("[ BURGERS MENU ]");
            for (MenuItem item : map.get("1. Burgers")) {
                System.out.print(item.getNumber() + " ");
                System.out.print(item.getName() + " | ");
                System.out.print(item.getPrice() + " | ");
                System.out.print(item.getExplain());
                System.out.println();
            }
            System.out.println("0. 뒤로가기");
        } else if (num1 == 2) {
            System.out.println("[ DRINK MENU ]");
            for (MenuItem item : map.get("2. Drinks")) {
                System.out.print(item.getNumber() + " ");
                System.out.print(item.getName() + " | ");
                System.out.print(item.getPrice() + " | ");
                System.out.print(item.getExplain());
                System.out.println();
                }
            System.out.println("0. 뒤로가기");
        } else if (num1 == 3) {
            System.out.println("[ DESSERT MENU ]");
            for (MenuItem item : map.get("3. Desserts")) {
                System.out.print(item.getNumber() + " ");
                System.out.print(item.getName() + " | ");
                System.out.print(item.getPrice() + " | ");
                System.out.print(item.getExplain());
                System.out.println();
            }
            System.out.println("0. 뒤로가기");
        }
    }

    public void start(int num2) {
        MenuItem item = map.get("1. Burgers").get(num2);
        System.out.print("선택한 메뉴: ");
        System.out.println(item.getName() + " | " + item.getPrice() + " | "+ item.getExplain());
        System.out.println();
    }
}
