
public class Break01 {
	public static void main(String[] args) {
		for(int count = 0; count < 5; count++) {
			if(count ==2) {
				break;
//				ifとセットで使用することで、〜の時に処理終了の設定ができる
			}
			System.out.println("Break01 =" + count);
		}
	}
}