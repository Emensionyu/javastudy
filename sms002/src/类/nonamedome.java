package ��;
/*��������;����û�����ֵĶ���
 * ���������Ӧ�ó���������ֻ����һ�ε�ʱ��
 * 	ע�⣺��ε��õ�ʱ�򲻺��ʡ��������������Ͼ������������Ա��������������
 * B���������������ʵ�ʲ�������
 * 
 
 */
public class nonamedome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentdemo sd=new studentdemo();
		student s1=new student();
		new student().show();
		sd.method(s1);
		sd.method(new student());
		new studentdemo().method(new student());
       
	}

}
