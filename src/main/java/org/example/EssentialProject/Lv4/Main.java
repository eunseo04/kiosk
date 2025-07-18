package org.example.EssentialProject.Lv4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(); // Menu 객체 생성을 통해 이름 설정
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        menu.setCategory("1. Burgers", new MenuItem("1.","ShackBurger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.setCategory("1. Burgers", new MenuItem("2.","SmokeShack", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.setCategory("1. Burgers", new MenuItem("3.","Cheeseburger", "W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.setCategory("1. Burgers", new MenuItem("4.","Hamburger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거"));
        menu.setCategory("2. Drinks", new MenuItem("1.","LemonAde", "W 2.9", "느끼함을 잡아주는 상큼한 레몬맛 에이드"));
        menu.setCategory("2. Drinks", new MenuItem("2.","MilkShack", "W 3.2", "신선한 우유를 쓴 달달하고 시원한 밀크쉐이크"));
        menu.setCategory("2. Drinks", new MenuItem("3.","Coke", "W 2.3", "근본!, 햄버거와 찰떡인 톡 쏘는 콜라"));
        menu.setCategory("2. Drinks", new MenuItem("4.","Cider", "W 2.3", "모두가 아는 맛, 입맛을 살려주는 청량한 사이다"));
        menu.setCategory("3. Desserts", new MenuItem("1.","Salad", "W 2.9", "아삭한 채소와 달콤한 마요네즈의 조합"));
        menu.setCategory("3. Desserts", new MenuItem("2.","FriedPotato", "W 3.2", "햄버거의 친구, 바삭바삭한 감자튀김"));
        menu.setCategory("3. Desserts", new MenuItem("3.","IceCream", "W 2.3", "입안에서 녹는 바닐라 아이스크림"));
        menu.setCategory("3. Desserts", new MenuItem("4.","CheeseStick", "W 2.3", "쭈욱 늘어나는 치즈스틱"));
        Kiosk kiosk = new Kiosk(menu); // Kiosk 객체 생성
        kiosk.start();// Kiosk 내 시작하는 함수 호출

    }
}
