package day1;

public class Variable1 {

	public static void main(String[] args) {
		//������ ���� ����
		//����Ÿ�� ������
		byte num1 = 1;
		short num2 = 32767;
		int num3 = 2147483647;
		//longŸ�� ���� �ڿ��� L�� �ٿ��� ��, ���ڰ� int�������� Ŭ �� �ʼ��� ����
		long num4 = 2147483648L;
		char ch1 = '��';
		int num5 = 0b111;//���� �տ� 0b�� ���̸� 2����, 2���� 111=>10���� 7
		int num6 = 0111; //���� �տ� 0�� ���̸� 8����, 8���� 111=>10���� 73
		int num7 = 0x111;//���� �տ� 0x�� ���̸� 16����, 16���� 111=>10���� 273
		int num8 = 111;  //���� �տ� �ƹ��͵� �� ���̸� 10����
		System.out.println(num5);//7
		System.out.println(num6);//73
		System.out.println(num7);//273
		System.out.println(num8);//111
		float dnum1 = 1.12345678901234567F;
		double dnum2 = 1.12345678901234567;
		System.out.println(dnum1);
		System.out.println(dnum2);} 
	    boolean stop = true;
	    private void sysout() {
			// TODO Auto-generated method stub

		}
	   