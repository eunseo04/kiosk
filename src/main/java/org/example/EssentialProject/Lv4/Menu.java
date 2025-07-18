package org.example.EssentialProject.Lv4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Menu {
    // MenuItem 클래스를 List로 관리
    private List<MenuItem> menuItems1 = new ArrayList<>();
    private List<MenuItem> menuItems2 = new ArrayList<>();
    private List<MenuItem> menuItems3 = new ArrayList<>();
    private HashMap<String,List<MenuItem>> map = new HashMap<>();
    String category;

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수?


    public void setMenu (String category, List<MenuItem> menuItems) {
        map.put(category,menuItems);
    }

    // List를 리턴하는 함수
    public List<MenuItem> getMenuItems1() {
        return menuItems1;
    }

    public List<MenuItem> getMenuItems2() {
        return menuItems2;
    }

    public List<MenuItem> getMenuItems3() {
        return menuItems3;
    }

    public HashMap<String,List<MenuItem>> getMap() {
        return map;
    }

    public String getCategory(int num1) {
        if (num1 == 1) {
            category = "1. Burgers";
        } else if (num1 == 2) {
            category = "2. Drinks";
        } else if (num1 == 3) {
            category = "3. Desserts";
        }
        return category;
    }

}
