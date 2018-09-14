
public class TestToanTu {

	public static void main(String[] args) {
		int a = 10;
		a /=5;
		int b = 2;
		String c = (a % b == 0) ? "a chia het cho b" : "a khong chia het cho b";
		System.out.println("gia tri cua a: "+a);
		System.out.println("gia tri cua b: "+b);
		System.out.println(c);
	}

}
