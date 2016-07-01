package test;

public class StaticInitClass {
	private int num;
	static{
		System.out.println("스태틱 초기화블록 실행중..");
	} // 클래스 초기화블록
	{
		System.out.println("인스턴스 초기화블록 실행중..");
	}//인스턴스 초기화블록
	public StaticInitClass() {
		System.out.println("생성자 실행중..");
	} //생성자(초기화)
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
