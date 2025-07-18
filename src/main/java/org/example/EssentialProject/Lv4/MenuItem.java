package org.example.EssentialProject.Lv4;

public class MenuItem {
    private String number;
    private String name;
    private String price;
    private String explain;

    MenuItem(String number, String name, String price,String explain) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    String getName(){
        return name;
    }
    String getNumber(){
        return number;
    }
    String getPrice(){
        return price;
    }
    String getExplain(){
        return explain;
    }
}
