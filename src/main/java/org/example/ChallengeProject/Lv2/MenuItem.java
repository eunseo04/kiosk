package org.example.ChallengeProject.Lv2;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String number;
    private String name;
    private double price;
    private String explain;

    MenuItem(String number, String name, double price, String explain) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요. (getter)
    String getName(){
        return name;
    }
    String getNumber(){
        return number;
    }
    double getPrice(){
        return price;
    }
    String getExplain(){
        return explain;
    }
}
