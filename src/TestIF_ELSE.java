
public class TestIF_ELSE {

	public static void main(String[] args) {
		int tuoi = 17;
		String thiCu = "truot";
		String giaCanh = "ngheo";
		if (tuoi <17){
			System.out.println("hoc tiep di chau");
		} else if (tuoi >= 17 && thiCu == "dau"){
			System.out.println("di hoc dai hoc di");
		} else if (tuoi >= 17 && thiCu == "truot" && giaCanh == "giau"){
			System.out.println("hoc ielts ma di du hoc di");
		} else {
			System.out.println("di phu ho + on luyen tiep di");
		}
	}

}
