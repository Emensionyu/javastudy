package �̳�;

class son extends father{//���������ȼ��ظ��ࡣ��̬���������Ÿ���ļ��ض����أ�Ȼ���ټ�������ľ�̬�����
	int num=20;
	static {
		System.out.println("����ѫŷ��2018���");
	}
	{
		System.out.println("ϣ��������ѫ2018�������֣����������ߵĺɶ�������");//��������Ҳ�ᱻ���أ��������ڹ��췽��Ǯ����
	}
	public son(String name) {        //�вι��췽��
		//super();��Ĭ�ϵ�
		super("����ѫ");//Ҫ���ڵ�һ��ֻ�ܳ���һ�Σ����ܶ�ζԸ�����г�ʼ����ֻҪ���ʸ��๹�죬���ܶԸ������ݳ�ʼ�� 
		System.out.println("��ð�");
	}
	public son() {            //�޲ι��췽��
		this("����ѫ");
		System.out.println("������޲ι��챻������");
	}
	public void show() {
		System.out.println(super.age);//super ������洢�ռ�ı�ʶ
	}
}
