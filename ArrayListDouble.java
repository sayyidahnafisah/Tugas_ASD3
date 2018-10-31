import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {
	ArrayList<Double> TinggiBadan = new ArrayList<Double>();
	TinggiBadan.add(170.30);
	TinggiBadan.add(175.26);
	TinggiBadan.add(175.19);
	TinggiBadan.add(165.19);
	TinggiBadan.add(180.40);
	System.out.println("Apakah ArrayList Kosong : " + TinggiBadan.isEmpty());
	System.out.println("Tinggi Badan : " + TinggiBadan);
	System.out.println("Berapa Jumlah Data : " + TinggiBadan.size());
	TinggiBadan.remove(3);
	System.out.println("Tinggi Badan : " + TinggiBadan);
	}

}
