package LinkedList;

import java.util.Scanner;

public class Link {
	Scanner sc = new Scanner(System.in);
	public static String data;
	public static int choice;
	public static LinkedList l = new LinkedList();
	public void run() {
		while(true) {
			play();
		}
	}
	private void play() {
		
		System.out.print("\n(1)추가, (2)삭제, (3)검색, (4)모두보기, (5)종료\n : ");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.print("입력 : ");
			data = sc.next();
			l.insertLast(data);
			break;
		case 2:
			System.out.print("입력 : ");
			data = sc.next();
			l.deleteNode(data);
			break;
		case 3:
			System.out.print("입력 : ");
			data = sc.next();
			l.searchNode(data);
			break;
		case 4:
			l.printList();
			break;
		case 5:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		}
		
	}
}
