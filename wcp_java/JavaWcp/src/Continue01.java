
public class Continue01 {
	public static void main(String[] args) {
		for(int count = 0; count < 5; count++) {
			if(count == 2) {
				continue;
			}
//			ifとセットで使用することで、〜の条件の時にブロック処理をスキップすることができる。（次のループ処理に進む）
		System.out.println("Continue = " + count);
		}
	}
}