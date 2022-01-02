package PhonInfo;

import java.util.Scanner;

public class PhoneMenu {
	public static PhoneLink list = new PhoneLink();
	public static PhoneInfo info = new PhoneInfo();
	public static Scanner sc = new Scanner(System.in);
	public void showMain() {

		System.out.println("============");
		System.out.println("1.데이터입력");
		System.out.println("2.데이터검색");
		System.out.println("3.데이터삭제");
		System.out.println("4.데이터수정");
		System.out.println("5.데이터전체출력");
		System.out.println("6.프로그램종료");
		System.out.print("선택 : ");
	}
	public PhoneInfo readData() {
		System.out.println("데이터 입력을 시작합니다..");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String phone = sc.next();
		System.out.print("생년월일 : ");
		String birth = sc.next();
		info  = new PhoneInfo(name,phone,birth);
		return info;
	}
	public void update(PhoneInfo pl) {
		System.out.print("수정할 이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.print("수정할 번호을 입력해주세요 : ");
		String phone = sc.next();
		System.out.print("수정할 생일을 입력해주세요 : ");
		String birth = sc.next();
		pl.setPhoneInfo(name, phone, birth);
	}
	public void programExit() {
		System.exit(0);
	}
	public void run() {
		while(true) {
			play();
		}
	}
	private void play() {
		showMain();
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			list.add(readData());
			break;
		case 2:
			System.out.println("검색하고 싶은 이름을 입력해주세요");
			System.out.println(list.search(sc.nextLine())); 
			break;
		case 3:
			System.out.println("삭제하고 싶은 이름을 입력해주세요");
			list.delete(sc.nextLine());
			break;
		case 4:
			System.out.println("수정하고 싶은 이름을 입력해주세요");
			update(list.update(sc.nextLine()));
			break;
		case 5:
			list.showAll();
			break;
		case 6:
			System.out.println("프로그램을 종료합니다.");
			programExit();
			default:
				System.out.println("잘못입력하였습니다.");
				break;
		}
		
	}
}
