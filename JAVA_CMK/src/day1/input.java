package day1;

import java.util.Scanner;


public class input {

	public static void main(String[] args) {
		/* �ܼ�â���� �Է¹޾� ������ �����ϴ� ���� */
		Scanner sacn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int num = Scan.nextInt();
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		//sacn.next():���ڿ��� �о��
		//���ڿ�.charAt(0) : �ش� ���ڿ� �߿� ù��° ���ڸ� �о��
		char ch = scan.next().charAt(0);
		System.out.println("�Է¹��� �� : " + ch);
		
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		string strl = scan.nextLine();
		System.out.println("�Է¹��� �� : " + strl);
		
		scan.close();
		

	}

}
