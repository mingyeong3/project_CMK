package day1;

import java.util.Scanner;

public class test1_3 {

	public static void main(String[] args) {
		// �� ������ ���ڸ� �Է¹޾� ����ϴ� ������ �ۼ��ϼ���.
	    /* ����1�� �Է��ϼ��� : 1
	     * ���ڸ� �Է��ϼ��� : +
	     * ����2�� �Է��ϼ��� : 2
	     * 1 + 2
	     * */

		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("����1�� �Ϸ��ϼ��� : ");
		 int num1 = scan.nextInt();
		 System.out.println("���ڸ� �Է��ϼ��� : ");
		 char ch = scan.next().charAt(0);
		 System.out.println("����2�� �Է��ϼ��� : ");
		 int num2 = scan.nextInt();
		 System.out.println(""+ num1 + ch + num2);
		 
		 
		 System.out.println("�� ������ ���ڸ� �Է��ϼ��� (��: 1 + 2) :");
		 num1 = scan.nextInt();
		 ch = scan.next().charAt(0);
		 num2 = scan.nextInt();
		 System.out.println("+ num1 + ch + num2");
		 
				 
		 
	
	}

	
}
