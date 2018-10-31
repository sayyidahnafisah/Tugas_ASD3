import java.util.ArrayList;

public class ArrayListFloat {

	public static void main(String[] args) {
	ArrayList <Float> BeratBadan = new ArrayList<Float>();
	BeratBadan.add((float) 55.3);
	BeratBadan.add((float) 48.00);
	BeratBadan.add((float) 51.25);
	
	System.out.println("Berapa Banyak Data : " + BeratBadan.size());
	System.out.println("Berat Badan : " + BeratBadan);
	BeratBadan.set(0, (float) 46.45);
	BeratBadan.set(2, (float) 45.25);
	System.out.println("Berat Badan : " + BeratBadan);
	}

}
