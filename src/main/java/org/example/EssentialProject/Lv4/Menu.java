package org.example.EssentialProject.Lv4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems1 = new ArrayList<>();
    private List<MenuItem> menuItems2 = new ArrayList<>();
    private List<MenuItem> menuItems3 = new ArrayList<>();
    private HashMap<String,List<MenuItem>> map = new HashMap<>();

    public void setMenu (String category, List<MenuItem> menuItems) {
        map.put(category,menuItems);
    }

    public List<MenuItem> getMenuItems1() {
        return menuItems1;
    }

    public List<MenuItem> getMenuItems2() {
        return menuItems2;
    }

    public List<MenuItem> getMenuItems3() {
        return menuItems3;
    }

    public void getCategory() {
        for(String i : map.keySet()){
            System.out.println(i);
        }
    }

    public HashMap<String,List<MenuItem>> getMap() {
        return map;
    }

}
