
public class TestContinue {

	public static void main(String[] args) {
	for (int i=1; i<5; i++){
		for (int j=1; j<5; j++){
			if(i==2 &j==3){
				continue;
			}
			// khi i=2 va j=3 thi k in ket qua ra
			System.out.println(i+""+j);
		}
	}

	}

}
