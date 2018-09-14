
public class TestSoNguyenTo {

	public static boolean isSoNguyenTo(int n){
		if (n<2){
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0){
				return false;
			}
			
		}
		return true;
	}
		
	public static void main(String[] args) {
	System.out.println("cac so nguyen to <50 la: ");
	for (int i = 0; i <=50; i++) {
		if (isSoNguyenTo(i)){
			System.out.print(i+", ");
		}
		
	}
}
}
