package day1;

import java.util.Scanner;

public class _02_escapesequence {

	public static void main(String[] args) {
		int n;
		System.out.print("정수 입력 : ");
		Scanner input/*이름*/ = new Scanner(System.in);
		n = input.nextInt/*형식*/();
		System.out.println("입력하신 숫자는"+ n + "입니다.");
		//Scanner를 사용함
		int a;
		Scanner A = new Scanner(System.in);
		a = A.nextInt();
		
		Scanner B = new Scanner(System.in);
		double b = B.nextDouble();
		B.close();
	}

}
