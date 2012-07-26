import java.util.Random;


public class Lotto {

	/**
	 * @param args
	 * 인스턴스 변수 random
	 * 클래스 Random
	 */
	public static void main(String[] args) {
		new Lotto().getLotto();	
	}
	public int[] getLotto() {
		int[] numbers=new int[6];
		for(int i=0; i <6; i++){
			numbers[i]=getNumber(); 			
		}
		return numbers;
	}
	//static:전역변수.
	Random random = new Random(); //클래스 타입을 가진 변수
	private int getNumber() {
		return random.nextInt(45)+1; //객체.함수() 0~44
	}
}
