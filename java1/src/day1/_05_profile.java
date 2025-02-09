package day1;
import java.util.Scanner;
public class _05_profile {

	public static void main(String[] args) {
		String address, name;
		int age;
		double tall;
		System.out.print("이름 주소 나이 키를 차례대로 입력해주세요 : ");
		Scanner in = new Scanner(System.in);
		name = in.next();
		address = in.nextLine();
		age = in.nextInt();
		tall = in.nextDouble();
		in.close();
		System.out.printf("당신의 이름은 %s입니다.\n", name);
		System.out.printf("당신의 주소는 %s입니다.\n", address);
		System.out.printf("당신의 나이는 %d살입니다.\n", age);
		System.out.printf("당신의 키는 %.1fcm입니다.\n", tall);

	}

}
