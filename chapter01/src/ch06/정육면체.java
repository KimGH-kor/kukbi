package ch06;

class ������{
	int ����;
	int �ʺ�;
	int ����;
	int ����;
	������(int ����, int �ʺ�, int ����){
		this.���� = ����;
		this.�ʺ� = �ʺ�;
		this.���� = ����;
		���� = ����*�ʺ�*����;
	}
	������(){
		this(1,1,1);
	}
	������(int ����){
		this(����,1,1);
	}
	������(int ����, int �ʺ�){
		this(����,�ʺ�,1);
	}

	
	void �������() {
		System.out.println(����);
	}
	
}

public class ������ü {
	public static void main(String[] args) {
		������ �� = new ������(10, 2);
		��.�������();
	}
}
