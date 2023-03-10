package com.mc.tour.presentation;

import java.util.Scanner;
import com.mc.tour.service.Tour;

public class MainMenu {
	
	Scanner sc = new Scanner(System.in);
	private Tour tour = new Tour();

	public void mainMenu() {
		
		while(true) {
		
			System.out.println();
			System.out.println("=============================");
			System.out.println("현재 보유 금액 : " + tour.bringMyMoney());
			System.out.println("현재 보유 마일리지 : " + tour.bringMyMile());
			System.out.println("=============================");
			
			System.out.println("번호\t 가격\t 마일리지 ");
			System.out.println("1\t 미국행\t 300000\t 3000");
			System.out.println("2\t 중국행\t 200000\t 2000");
			System.out.println("3\t 일본행\t 150000\t 1500");
			System.out.println("=============================");
			
			System.out.print("목적지 선택(번호 입력) : ");
			int num = sc.nextInt();
			System.out.println("=============================");
			
			if(!tour.isAble(num)) {
				System.out.println("현재 보유 금액이 부족합니다.");
				break;
			}
		
			switch (num) {
				case 1:
					tour.buyTicket1();
					System.out.println("티케팅 후 잔액은 : " + tour.bringMyMoney());
					System.out.println("티케팅 후 마일리지는 : " + tour.bringMyMile());
					break;
				case 2:
					tour.buyTicket2();
					System.out.println("티케팅 후 잔액은 : " + tour.bringMyMoney());
					System.out.println("티케팅 후 마일리지는 : " + tour.bringMyMile());
					break;
				case 3:
					tour.buyTicket3();
					System.out.println("티케팅 후 잔액은 : " + tour.bringMyMoney());
					System.out.println("티케팅 후 마일리지는 : " + tour.bringMyMile());
					break;
			}
			
			
		
		
		
		
		}
	}
}
