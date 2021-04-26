package day1;

import java.util.Scanner;


public class input {

	public static void main(String[] args) {
		/* 콘솔창에서 입력받아 변수에 저장하는 예제 */
		Scanner sacn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = Scan.nextInt();
		
		System.out.println("문자를 입력하세요 : ");
		//sacn.next():문자열을 읽어옴
		//문자열.charAt(0) : 해당 문자열 중에 첫번째 글자를 읽어옴
		char ch = scan.next().charAt(0);
		System.out.println("입력받은 값 : " + ch);
		
		System.out.println("문자열을 입력하세요 : ");
		string strl = scan.nextLine();
		System.out.println("입력받은 값 : " + strl);
		
		scan.close();
		

	}

}
