package org.example.ChallengeProject.Lv1;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<MenuItem> menu = new ArrayList<>();

    public void orderMenu(){
        if (!menu.isEmpty()){
            System.out.println();
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
        }
    }

    public void orderAsk(){
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println("[ Orders ]");
        for (MenuItem item : menu) {
            System.out.println(item.getName() + " | " + item.getPrice() + " | " + item.getExplain());
        }
        System.out.println("[ Total ]");
        System.out.println("1. 주문      2. 메뉴판");
    }

    public void basketMenu(){
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
    }
    public void collect(String name, int num2) {
        if (num2 == 1) {
            System.out.println(name+" 이 장바구니에 추가되었습니다.");
        }
    }

    public void lastOrder(int num){
        if (num == 1) {
            System.out.println("주문이 완료되었습니다. 금액은 W 8.9 입니다.");
        }
    }

    public List<MenuItem> getBasket(){
        return menu;
    }
}
