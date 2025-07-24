package org.example.ChallengeProject.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static org.example.ChallengeProject.Lv2.Sale.valueOf;

public class Basket {
    private List<MenuItem> menu = new ArrayList<>();
    private List<Double> price = new ArrayList<>();
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
            Stream<MenuItem> stream1 = menu.stream()
                    .filter(menu -> !menu.getName().equals("SmokeShack"));
            stream1.forEach(System.out::println);
            for (MenuItem item : menu) {
                getTotal().add(item.getPrice());
            }
            double stream2 = getTotal().stream().mapToDouble(Double::doubleValue).sum();
            sum = stream2;
            System.out.println("[ Total ]\n" +"W " + sum);
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
        } else if (num2 != 2) {
                throw new RuntimeException();
        }
    }

    public void lastOrder(int num1){
        if (num1 == 1) {
            System.out.println("1. 국가유공자 : 10% \n" +
                    "2. 군인     :  5%\n" +
                    "3. 학생     :  3%\n" +
                    "4. 일반     :  0%");
        } else if (num1 == 2) {
            System.out.println();
        } else {
            throw new RuntimeException();
        }
    }

    public void sale(int num){
        switch(valueOf(1)){
            case 국가유공자 -> {
                sum -= sum/10;
                System.out.println("주문이 완료되었습니다. 금액은 W "+sum+"입니다.");
                System.out.println();
                menu.clear();
            }
            case 군인 -> {
                sum -= sum/20;
                System.out.println("주문이 완료되었습니다. 금액은 W "+sum+"입니다.");
                System.out.println();
                menu.clear();
            }
            case 학생 -> {
                sum -= sum/(3/100);
                System.out.println("주문이 완료되었습니다. 금액은 W "+sum+"입니다.");
                System.out.println();
                menu.clear();
            }
            case 일반 -> {
                System.out.println("주문이 완료되었습니다. 금액은 W "+sum+"입니다.");
                System.out.println();
                menu.clear();
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }

    }

    public List <MenuItem> getBasket(){
        return menu;
    }
    public List <Double> getTotal(){
        return price;
    }
}
