package day1;

public class println {

	public static void main(String[] args) {
		/* System.out.println(); ()�ȿ� �ִ� ������ �ֿܼ� ����ϴ� �޼ҵ�(���)
		 *                       ������ ��� �� ���͸� ħ
		 * System.out.println(���ڿ�);
		 * System.out.println(����);
		 * System.out.println(�Ǽ�);
		 * System.out.println(����);
		 * System.out.println(����);
		 * */
		System.out.println("Hello");
		System.out.println(1);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println('A');

		System.out.println(1 + 2 + 3);//6�� ���
		//���ڿ�1 + ����2 => ���ڿ�12�� ��
		//���ڿ�12 + ����3 => ���ڿ�123
		System.out.println("1" + 2 + 3);//123���
		//���ڿ� 1�� 2�� ���� ���ϴ� ���� �ƴ϶� ����2�� ����3�� �� �� �� ���ڿ�
		//1�� ���� => ���ڿ� 1�� ���� 5�� ����
		System.out.println("1" + (2 + 3));//15�� ���
		System.out.println(1 + 2 + "3");//33�� ���
		
	}

}
