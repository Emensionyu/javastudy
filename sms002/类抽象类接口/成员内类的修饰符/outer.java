package ��Ա��������η�;

public class outer {
	private int num=10;
	private static int num2=20;
		 static class inner{
			public void show() {
				System.out.println(num2);//�౻��̬�����Ժ���ʵ�����ֻ���Ǿ�̬��
			}
			public static void show2() {
				System.out.println(num2);
			}
		}

}
