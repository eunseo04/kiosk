package org.example.EssentialProject.Lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<MenuItem> menuItems = new ArrayList<>();

    Menu() {
    }

    public void burgerMenu() {
        for (MenuItem menuItem : getMenuItems()) {
            System.out.print(menuItem.number + " ");
            System.out.print(menuItem.name + " | ");
            System.out.print(menuItem.price + " | ");
            System.out.print(menuItem.explain);
            System.out.println();
        }
        System.out.println("0. 뒤로가기");
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
