
public class TestForLabel {
	// check vòng lặp for với label
	public static void main(String[] args) {
		aa: for (int a = 1; a <= 5; a++){
			bb: for (int b = 1; b <= 5; b++ ){
				if (a==2 && b==2){
					break aa;
				}
				System.out.println(a + "" +b);
			}
		}
	}
}