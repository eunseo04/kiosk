package org.example.ChallengeProject.Lv1;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<MenuItem> menu = new ArrayList<>();
    double sum;

    public void orderMenu(){
        if (!menu.isEmpty()){
            System.out.println();
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
        }
    }

    public void orderAsk(){
        if (!menu.isEmpty()) {
            System.out.println("아래와 같이 주문 하시겠습니까?");
            System.out.println("[ Orders ]");
            sum = 0.0;
            for (MenuItem item : menu) {
                System.out.println(item.getName() + " | " + item.getPrice() + " | " + item.getExplain());
                sum += item.getPrice();
            }
            System.out.println("[ Total ]");
            System.out.println("W " + sum);
            System.out.println("1. 주문      2. 메뉴판");
        } else{
            throw new RuntimeException();
        }
    }

    public void basketMenu(){
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
    }

    public void collect(MenuItem food, int num2) {
        if (num2 == 1) {
            System.out.println(food.getName()+" 이 장바구니에 추가되었습니다.");
            getBasket().add(food);
        } else if (num2 == 2) {

        } else {
            throw new RuntimeException();
        }
    }

    public void lastOrder(int num1){
        if (num1 == 1) {
            System.out.println("주문이 완료되었습니다. 금액은 W "+sum+"입니다.");
            System.out.println();
            menu.clear();
        } else if (num1 == 2) {
            System.out.println();
        } else {
            throw new RuntimeException();
        }
    }

    public List<MenuItem> getBasket(){
        return menu;
    }
}
