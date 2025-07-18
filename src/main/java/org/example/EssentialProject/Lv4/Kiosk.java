package org.example.EssentialProject.Lv4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {
    Menu menu;
    int num1;
    int num2;

    Kiosk(Menu menu){
        this.menu = menu;
    }

    public void mainMenu() {
        for(String i : menu.getMap().keySet()){
            System.out.println(i);
        }
        System.out.println("0. 종료");
    }

    public void burgerMenu() {
        if(num1==1){
            System.out.println("[ BURGERS MENU ]");
        } else if(num1==2){
            System.out.println("[ DRINKS MENU ]");
        } else if(num1==3){
            System.out.println("[ DESSERTS MENU ]");
        }

        for (MenuItem item : menu.getMap().get(menu.getCategory(num1))) { // Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
            // menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.
            System.out.print(item.getNumber() + " " + item.getName() + " | " + item.getPrice() + " | " + item.getExplain());
            System.out.println();
        }
        System.out.println("0. 뒤로가기");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in); // 스캐너 선언

        // 반복문 시작
        while(true) {
            try {
                System.out.println("[ MAIN MENU ]");
                mainMenu(); // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
                System.out.print("번호를 입력해주세요: "); // 숫자 입력 받기
                num1 = scanner.nextInt();
                System.out.println();
                if (num1 == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                burgerMenu(); // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
                System.out.print("번호를 입력해주세요: "); // 숫자 입력 받기
                num2 = scanner.nextInt();
                if (num2 == 0) {
                    System.out.println();
                    continue;
                }
                System.out.println();
                MenuItem food = menu.getMap().get(menu.getCategory(num1)).get(num2-1);
                System.out.println("선택한 메뉴: " + food.getName() + " | " + food.getPrice() + " | " + food.getExplain());
                System.out.println();
            }catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요!");
                scanner.next();
            }
        }
    }
}

