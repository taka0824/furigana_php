
public class For02 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		for(int number: array) {
//			第一引数：配列を代入していく型　変数名
//			第二引数：配列の変数
//			配列の要素の個数分の回数ブロック処理を行うため、初期値と条件式が不要
			System.out.println("For02 =" + number);
		}
	}
}