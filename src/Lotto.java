import java.util.Random;


public class Lotto {

	/**
	 * @param args
	 * �ν��Ͻ� ���� random
	 * Ŭ���� Random
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
	//static:��������.
	Random random = new Random(); //Ŭ���� Ÿ���� ���� ����
	private int getNumber() {
		return random.nextInt(45)+1; //��ü.�Լ�() 0~44
	}
}