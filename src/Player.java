
public class Player {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		int[] Numbers=lotto.getLotto();
		for(int i=0; i<Numbers.length; i++){
			System.out.println(Numbers[i]);
		}
	}
}
